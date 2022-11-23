package com.example.buynow.presentation.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View

import android.widget.Button
import android.widget.ImageView
import com.example.buynow.R
import com.example.buynow.databinding.VisualPredictBinding
import com.example.buynow.ml.MobilenetV110224Quant
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.IOException

class VisualSearchActivity : AppCompatActivity() {

    lateinit var uploadAPhotoBtn_visualSearch: Button
    lateinit var takeAPhotoBtn_visualSearch: Button
    var Imgbitmap: Bitmap? = null

    lateinit var bottomSheetDialod: BottomSheetDialog
    lateinit var bottomSheetView: View

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

        val visualPredictBinding: VisualPredictBinding =
            VisualPredictBinding.inflate(LayoutInflater.from(this))
        bottomSheetView = visualPredictBinding.root


        val fileName = "label.txt"
        val inputString = application.assets.open(fileName).bufferedReader().use { it.readText() }
        val townList = inputString.split("\n")


        uploadAPhotoBtn_visualSearch.setBackgroundColor(Color.TRANSPARENT)

        takeAPhotoBtn_visualSearch.setOnClickListener {

        }

        uploadAPhotoBtn_visualSearch.setOnClickListener {

            var intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, PICK_IMAGE_REQUEST)

            bottomSheet(townList)

        }


    }

    private fun bottomSheet(townList: List<String>) {

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
        val resize: Bitmap = Bitmap.createScaledBitmap(Imgbitmap!!, 224, 224, true)
        val model = MobilenetV110224Quant.newInstance(this)

// Creates inputs for reference.

        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.UINT8)
        val tbuffer = TensorImage.fromBitmap(resize)
        val byteBuffer = tbuffer.buffer
        inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

        max = getMax(outputFeature0.floatArray)


// Releases model resources if no longer used.
        model.close()

    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data == null || data.data == null) {
                return
            }

            filePath = data.data
            try {
                Imgbitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, filePath)
                bottomSheetView.findViewById<ImageView>(R.id.imageView_VisualPredict)
                    .setImageBitmap(Imgbitmap)
//                profileImage_profileFrag.setImageBitmap(bitmap)
//                uploadImage_profileFrag.visibility = View.VISIBLE
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }


    }

    fun getMax(arr: FloatArray): Int {
        var ind = 0
        var min = 0.0f
        for (i in 0..1000) {
            if (arr[i] > min) {
                ind = i
                min = arr[i]
            }
        }

        return ind
    }
}