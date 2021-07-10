package com.example.buynow

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.text.set
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.buynow.Adapter.ProductAdapter
import com.example.buynow.Model.Product
import com.example.buynow.Utils.DefaultCard.GetDefCard
import com.example.buynow.Utils.Extensions.cardXXGen
import com.example.buynow.Utils.Extensions.toast
import com.example.buynow.db.CartViewModel
import com.example.buynow.db.ProductEntity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class ProductDetailsActivity : AppCompatActivity() {

    var productIndex: Int = -1
    lateinit var ProductFrom: String
    private lateinit var cartViewModel: CartViewModel
    private val TAG = "TAG"
    lateinit var productImage_ProductDetailsPage: ImageView
    lateinit var backIv_ProfileFrag: ImageView
    lateinit var productName_ProductDetailsPage: TextView
    lateinit var productPrice_ProductDetailsPage: TextView
    lateinit var productBrand_ProductDetailsPage: TextView
    lateinit var productDes_ProductDetailsPage: TextView
    lateinit var RatingProductDetails: TextView
    lateinit var productRating_singleProduct: RatingBar



    lateinit var RecomRecView_ProductDetailsPage: RecyclerView
    lateinit var newProductAdapter: ProductAdapter
    lateinit var newProduct: ArrayList<Product>

    lateinit var pName: String
    var qua: Int = 1
    var pPrice: Int = 0
    lateinit var pPid: String
    lateinit var pImage: String

    lateinit var cardNumber: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        getWindow()?.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        productIndex = intent.getIntExtra("ProductIndex", -1)
        ProductFrom = intent.getStringExtra("ProductFrom").toString()

        productImage_ProductDetailsPage = findViewById(R.id.productImage_ProductDetailsPage)
        productName_ProductDetailsPage = findViewById(R.id.productName_ProductDetailsPage)
        productPrice_ProductDetailsPage = findViewById(R.id.productPrice_ProductDetailsPage)
        productBrand_ProductDetailsPage = findViewById(R.id.productBrand_ProductDetailsPage)
        productDes_ProductDetailsPage = findViewById(R.id.productDes_ProductDetailsPage)
        productRating_singleProduct = findViewById(R.id.productRating_singleProduct)
        RatingProductDetails = findViewById(R.id.RatingProductDetails)
        RecomRecView_ProductDetailsPage = findViewById(R.id.RecomRecView_ProductDetailsPage)
        backIv_ProfileFrag = findViewById(R.id.backIv_ProfileFrag)
        val addToCart_ProductDetailsPage: Button = findViewById(R.id.addToCart_ProductDetailsPage)
        val shippingAddress_productDetailsPage:LinearLayout = findViewById(R.id.shippingAddress_productDetailsPage)
        val cardNumberProduct_Details:TextView = findViewById(R.id.cardNumberProduct_Details)

        cardNumber = GetDefCard()

        if(cardNumber == "" || cardNumber == null){
            cardNumberProduct_Details.text = "You Have No Cards"
        }
        else{
            cardNumberProduct_Details.text = cardXXGen(cardNumber)
        }


        shippingAddress_productDetailsPage.setOnClickListener {
            startActivity(Intent(this,PaymentMethodActivity::class.java))
        }


        newProduct = arrayListOf()
        setProductData()
        setRecData()

        RecomRecView_ProductDetailsPage.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL, false
        )
        RecomRecView_ProductDetailsPage.setHasFixedSize(true)
        newProductAdapter = ProductAdapter(newProduct, this)
        RecomRecView_ProductDetailsPage.adapter = newProductAdapter

        backIv_ProfileFrag.setOnClickListener {
            onBackPressed()
        }

        addToCart_ProductDetailsPage.setOnClickListener {

            val bottomSheetDialod = BottomSheetDialog(
                this, R.style.BottomSheetDialogTheme
            )

            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.fragment_add_to_bag,
                findViewById<ConstraintLayout>(R.id.bottomSheet)
            )

            bottomSheetView.findViewById<View>(R.id.addToCart_BottomSheet).setOnClickListener {

                pPrice *= bottomSheetView.findViewById<EditText>(R.id.quantityEtBottom).text.toString()
                    .toInt()
                addProductToBag()
                bottomSheetDialod.dismiss()
            }

            bottomSheetView.findViewById<LinearLayout>(R.id.minusLayout).setOnClickListener {
                if(bottomSheetView.findViewById<EditText>(R.id.quantityEtBottom).text.toString()
                        .toInt() > 1){
                    qua--
                    bottomSheetView.findViewById<EditText>(R.id.quantityEtBottom).setText(qua.toString())
                }
            }

            bottomSheetView.findViewById<LinearLayout>(R.id.plusLayout).setOnClickListener {
                if(bottomSheetView.findViewById<EditText>(R.id.quantityEtBottom).text.toString()
                        .toInt() < 10){
                    qua++
                    bottomSheetView.findViewById<EditText>(R.id.quantityEtBottom).setText(qua.toString())
                }
            }

            bottomSheetDialod.setContentView(bottomSheetView)
            bottomSheetDialod.show()
        }

    }

    private fun addProductToBag() {

        cartViewModel = ViewModelProviders.of(this).get(CartViewModel::class.java)

        cartViewModel.insert(ProductEntity(pName, qua, pPrice, pPid, pImage))
        toast("Add to Bag Successfully")
    }

    fun getJsonData(context: Context, fileName: String): String? {


        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }

        return jsonString
    }

    private fun setProductData() {

        var fileJson: String = ""

        if (ProductFrom.equals("Cover")) {
            fileJson = "CoverProducts.json"
        }
        if (ProductFrom.equals("New")) {
            fileJson = "NewProducts.json"
        }


        val jsonFileString = this?.let {

            getJsonData(it, fileJson)
        }

        val gson = Gson()


        val listCoverType = object : TypeToken<List<Product>>() {}.type

        var coverD: List<Product> = gson.fromJson(jsonFileString, listCoverType)

        Glide.with(applicationContext)
            .load(coverD[productIndex].productImage)
            .into(productImage_ProductDetailsPage)

        productName_ProductDetailsPage.text = coverD[productIndex].productName
        productPrice_ProductDetailsPage.text = "$" + coverD[productIndex].productPrice
        productBrand_ProductDetailsPage.text = coverD[productIndex].productBrand
        productDes_ProductDetailsPage.text = coverD[productIndex].productDes
        productRating_singleProduct.rating = coverD[productIndex].productRating
        RatingProductDetails.text = coverD[productIndex].productRating.toString() + " Rating on this Product."

        pName = coverD[productIndex].productName
        pPrice = coverD[productIndex].productPrice.toInt()
        pPid = coverD[productIndex].productId
        pImage = coverD[productIndex].productImage

    }

    private fun setRecData() {


        var fileJson: String = ""

        if (ProductFrom.equals("Cover")) {
            fileJson = "NewProducts.json"
        }
        if (ProductFrom.equals("New")) {
            fileJson = "CoverProducts.json"
        }


        val jsonFileString = this?.let {

            getJsonData(it, fileJson)
        }
        val gson = Gson()

        val listCoverType = object : TypeToken<List<Product>>() {}.type

        var coverD: List<Product> = gson.fromJson(jsonFileString, listCoverType)

        coverD.forEachIndexed { idx, person ->

            if (idx < 9) {
                newProduct.add(person)
            }


        }


    }

}


