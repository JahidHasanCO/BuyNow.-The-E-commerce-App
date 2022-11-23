package com.example.buynow

import android.annotation.TargetApi
import android.app.Activity
import android.content.ContentUris
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Color.TRANSPARENT
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.FileProvider
import com.example.buynow.Utils.Extensions.toast
import com.example.buynow.ml.MobilenetV110224Quant
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.File
import java.io.IOException

class VisualSearchActivity : AppCompatActivity() {


    //Our constants
    private val OPERATION_CAPTURE_PHOTO = 1
    private val OPERATION_CHOOSE_PHOTO = 2

    lateinit var uploadAPhotoBtn_visualSearch:Button
    lateinit var takeAPhotoBtn_visualSearch:Button
    var Imgbitmap:Bitmap? = null

    lateinit var bottomSheetDialod:BottomSheetDialog
    lateinit var bottomSheetView:View

    private val PICK_IMAGE_REQUEST = 71
    private val CAMERA_IMAGE_REQUEST = 42
    var predictName: String = ""
    var max: Int = -1
    private var filePath: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visual_search)


        uploadAPhotoBtn_visualSearch = findViewById(R.id.uploadAPhotoBtn_visualSearch)
        takeAPhotoBtn_visualSearch = findViewById(R.id.takeAPhotoBtn_visualSearch)

        val backIv_visualAc: ImageView = findViewById(R.id.backIv_visualAc)
        backIv_visualAc.setOnClickListener {
            onBackPressed()
        }

//        bitmap = BitmapFactory.decodeResource(this.getResources(),
//            R.drawable.bn);

        bottomSheetDialod = BottomSheetDialog(
            this, R.style.BottomSheetDialogTheme
        )

         bottomSheetView = LayoutInflater.from(applicationContext).inflate(
            R.layout.visual_predict,
            findViewById<ConstraintLayout>(R.id.visualBottomSheet)
        )


        val fileName = "label.txt"
        val inputString = application.assets.open(fileName).bufferedReader().use { it.readText() }
        var townList = inputString.split("\n")


        uploadAPhotoBtn_visualSearch.setBackgroundColor(Color.TRANSPARENT)

        takeAPhotoBtn_visualSearch.setOnClickListener {

        }

        uploadAPhotoBtn_visualSearch.setOnClickListener {

            var intent : Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent,PICK_IMAGE_REQUEST)

            bottomSheet(townList)
            
        }



    }

    private fun bottomSheet(townList: List<String> ){

//            bottomSheetView.findViewById<ImageView>(R.id.imageView_VisualPredict).setImageBitmap(Imgbitmap)

        bottomSheetView.findViewById<Button>(R.id.searchBtn_VisualPredict).setOnClickListener {


            predictData()
            predictName = townList[max]

            val intent = Intent(this, VisualResultActivity::class.java)
            intent.putExtra("PredictName", predictName)
            startActivity(intent)

            bottomSheetDialod.dismiss()
        }

        bottomSheetDialod.setContentView(bottomSheetView)
        bottomSheetDialod.show()
    }







    private fun predictData() {



        var resize:Bitmap = Bitmap.createScaledBitmap(Imgbitmap!!,224,224,true)

        val model = MobilenetV110224Quant.newInstance(this)

// Creates inputs for reference.

        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.UINT8)

        var tbuffer = TensorImage.fromBitmap(resize)

        var byteBuffer = tbuffer.buffer

        inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

        max = getMax(outputFeature0.floatArray)


// Releases model resources if no longer used.
        model.close()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if(data == null || data.data == null){
                return
            }

            filePath = data.data
            try {
                Imgbitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, filePath)
                bottomSheetView.findViewById<ImageView>(R.id.imageView_VisualPredict).setImageBitmap(Imgbitmap)
//                profileImage_profileFrag.setImageBitmap(bitmap)
//                uploadImage_profileFrag.visibility = View.VISIBLE
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }


    }

    fun getMax(arr:FloatArray) : Int{
        var ind = 0
        var min = 0.0f
        for (i in 0..1000){
            if (arr[i]>min){
                ind = i
                min = arr[i]
            }
        }

        return  ind
    }
}