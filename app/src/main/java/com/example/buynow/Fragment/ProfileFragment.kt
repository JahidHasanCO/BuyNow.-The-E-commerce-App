package com.example.buynow.Fragment

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.cardview.widget.CardView

import com.example.buynow.R
import com.example.buynow.SettingsActivity
import com.example.buynow.Utils.Extensions
import com.example.buynow.Utils.Extensions.toast
import com.example.buynow.Utils.FirebaseUtils
import com.example.buynow.Utils.FirebaseUtils.firebaseDataBase
import com.example.buynow.Utils.FirebaseUtils.firebaseUser

import com.example.buynow.Utils.FirebaseUtils.storageReference
import com.example.buynow.loadingDialog
import com.google.android.gms.tasks.Continuation
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.UploadTask
import de.hdodenhof.circleimageview.CircleImageView
import java.io.IOException
import java.util.*



class ProfileFragment : Fragment() {

    lateinit var profileImage_profileFrag: CircleImageView

    private val PICK_IMAGE_REQUEST = 71
    private var filePath: Uri? = null
    private lateinit var loadingDialog: loadingDialog

    lateinit var uploadImage_profileFrag:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        profileImage_profileFrag = view.findViewById(R.id.profileImage_profileFrag)
        val settingCd_profileFrag = view.findViewById<CardView>(R.id.settingCd_profileFrag)
        uploadImage_profileFrag = view.findViewById(R.id.uploadImage_profileFrag)

        loadingDialog = loadingDialog(context as Activity)

        uploadImage_profileFrag.visibility = View.GONE

        uploadImage_profileFrag.setOnClickListener {
            uploadImage()
        }

        settingCd_profileFrag.setOnClickListener {
            val intent = Intent(context, SettingsActivity::class.java)
            startActivity(intent)
        }



        profileImage_profileFrag.setOnClickListener {

            val popupMenu: PopupMenu = PopupMenu(context,profileImage_profileFrag)

            popupMenu.menuInflater.inflate(R.menu.profile_photo_storage,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.galleryMenu ->
                        launchGallery()
                    R.id.cameraMenu ->
                        uploadImage()

                }
                true
            })
            popupMenu.show()

    }

        return view
    }

    private fun launchGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }

    private fun uploadImage(){
        loadingDialog.startLoadingDialog()
        if(filePath != null){
            val ref = storageReference?.child("profile_Image/" + UUID.randomUUID().toString())
            val uploadTask = ref?.putFile(filePath!!)

            val urlTask = uploadTask?.continueWithTask(Continuation<UploadTask.TaskSnapshot, Task<Uri>> { task ->
                if (!task.isSuccessful) {
                    task.exception?.let {
                        throw it
                    }
                }
                return@Continuation ref.downloadUrl
            })?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val downloadUri = task.result
                    addUploadRecordToDb(downloadUri.toString())

                    // show save...


                } else {
                    // Handle failures
                }
            }?.addOnFailureListener{

            }
        }else{
            loadingDialog.dismissDialog()
            Toast.makeText(context, "Please Upload an Image", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if(data == null || data.data == null){
                return
            }

            filePath = data.data
            try {
                val bitmap = MediaStore.Images.Media.getBitmap(context?.contentResolver, filePath)
                profileImage_profileFrag.setImageBitmap(bitmap)
                uploadImage_profileFrag.visibility = View.VISIBLE
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }

    private fun addUploadRecordToDb(uri: String){

        val userHashmap: HashMap<String, Any>  =  HashMap()

        userHashmap.put("userImage", uri)

        if (firebaseUser != null) {
            FirebaseUtils.databaseReference.child("Users").child(firebaseUser.uid)
                .updateChildren(userHashmap)
                .addOnSuccessListener {

                    uploadImage_profileFrag.visibility = View.GONE
                    loadingDialog.dismissDialog()
                    Toast.makeText(context,"Profile Photo Uploaded",Toast.LENGTH_SHORT).show()

                }
        }



    }
}