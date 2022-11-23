package com.example.buynow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010Y\u001a\u00020ZH\u0002J\u0018\u0010[\u001a\u0004\u0018\u00010\u00042\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0004J\u0012\u0010_\u001a\u00020Z2\b\u0010`\u001a\u0004\u0018\u00010aH\u0014J\b\u0010b\u001a\u00020ZH\u0002J\b\u0010c\u001a\u00020ZH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u000209X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR\u001a\u0010A\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR\u001a\u0010D\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u001bR\u001a\u0010G\u001a\u000209X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\u001a\u0010J\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001a\u0010P\u001a\u00020QX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010V\u001a\u000209X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=\u00a8\u0006d"}, d2 = {"Lcom/example/buynow/ProductDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ProductFrom", "", "getProductFrom", "()Ljava/lang/String;", "setProductFrom", "(Ljava/lang/String;)V", "RatingProductDetails", "Landroid/widget/TextView;", "getRatingProductDetails", "()Landroid/widget/TextView;", "setRatingProductDetails", "(Landroid/widget/TextView;)V", "RecomRecView_ProductDetailsPage", "Landroidx/recyclerview/widget/RecyclerView;", "getRecomRecView_ProductDetailsPage", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecomRecView_ProductDetailsPage", "(Landroidx/recyclerview/widget/RecyclerView;)V", "TAG", "backIv_ProfileFrag", "Landroid/widget/ImageView;", "getBackIv_ProfileFrag", "()Landroid/widget/ImageView;", "setBackIv_ProfileFrag", "(Landroid/widget/ImageView;)V", "cardNumber", "getCardNumber", "setCardNumber", "cartViewModel", "Lcom/example/buynow/db/CartViewModel;", "newProduct", "Ljava/util/ArrayList;", "Lcom/example/buynow/Model/Product;", "Lkotlin/collections/ArrayList;", "getNewProduct", "()Ljava/util/ArrayList;", "setNewProduct", "(Ljava/util/ArrayList;)V", "newProductAdapter", "Lcom/example/buynow/Adapter/ProductAdapter;", "getNewProductAdapter", "()Lcom/example/buynow/Adapter/ProductAdapter;", "setNewProductAdapter", "(Lcom/example/buynow/Adapter/ProductAdapter;)V", "pImage", "getPImage", "setPImage", "pName", "getPName", "setPName", "pPid", "getPPid", "setPPid", "pPrice", "", "getPPrice", "()I", "setPPrice", "(I)V", "productBrand_ProductDetailsPage", "getProductBrand_ProductDetailsPage", "setProductBrand_ProductDetailsPage", "productDes_ProductDetailsPage", "getProductDes_ProductDetailsPage", "setProductDes_ProductDetailsPage", "productImage_ProductDetailsPage", "getProductImage_ProductDetailsPage", "setProductImage_ProductDetailsPage", "productIndex", "getProductIndex", "setProductIndex", "productName_ProductDetailsPage", "getProductName_ProductDetailsPage", "setProductName_ProductDetailsPage", "productPrice_ProductDetailsPage", "getProductPrice_ProductDetailsPage", "setProductPrice_ProductDetailsPage", "productRating_singleProduct", "Landroid/widget/RatingBar;", "getProductRating_singleProduct", "()Landroid/widget/RatingBar;", "setProductRating_singleProduct", "(Landroid/widget/RatingBar;)V", "qua", "getQua", "setQua", "addProductToBag", "", "getJsonData", "context", "Landroid/content/Context;", "fileName", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setProductData", "setRecData", "app_debug"})
public final class ProductDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private int productIndex = -1;
    public java.lang.String ProductFrom;
    private com.example.buynow.db.CartViewModel cartViewModel;
    private final java.lang.String TAG = "TAG";
    public android.widget.ImageView productImage_ProductDetailsPage;
    public android.widget.ImageView backIv_ProfileFrag;
    public android.widget.TextView productName_ProductDetailsPage;
    public android.widget.TextView productPrice_ProductDetailsPage;
    public android.widget.TextView productBrand_ProductDetailsPage;
    public android.widget.TextView productDes_ProductDetailsPage;
    public android.widget.TextView RatingProductDetails;
    public android.widget.RatingBar productRating_singleProduct;
    public androidx.recyclerview.widget.RecyclerView RecomRecView_ProductDetailsPage;
    public com.example.buynow.Adapter.ProductAdapter newProductAdapter;
    public java.util.ArrayList<com.example.buynow.Model.Product> newProduct;
    public java.lang.String pName;
    private int qua = 1;
    private int pPrice = 0;
    public java.lang.String pPid;
    public java.lang.String pImage;
    public java.lang.String cardNumber;
    
    public ProductDetailsActivity() {
        super();
    }
    
    public final int getProductIndex() {
        return 0;
    }
    
    public final void setProductIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductFrom() {
        return null;
    }
    
    public final void setProductFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getProductImage_ProductDetailsPage() {
        return null;
    }
    
    public final void setProductImage_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBackIv_ProfileFrag() {
        return null;
    }
    
    public final void setBackIv_ProfileFrag(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getProductName_ProductDetailsPage() {
        return null;
    }
    
    public final void setProductName_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getProductPrice_ProductDetailsPage() {
        return null;
    }
    
    public final void setProductPrice_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getProductBrand_ProductDetailsPage() {
        return null;
    }
    
    public final void setProductBrand_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getProductDes_ProductDetailsPage() {
        return null;
    }
    
    public final void setProductDes_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRatingProductDetails() {
        return null;
    }
    
    public final void setRatingProductDetails(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RatingBar getProductRating_singleProduct() {
        return null;
    }
    
    public final void setProductRating_singleProduct(@org.jetbrains.annotations.NotNull()
    android.widget.RatingBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecomRecView_ProductDetailsPage() {
        return null;
    }
    
    public final void setRecomRecView_ProductDetailsPage(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.ProductAdapter getNewProductAdapter() {
        return null;
    }
    
    public final void setNewProductAdapter(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.ProductAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.buynow.Model.Product> getNewProduct() {
        return null;
    }
    
    public final void setNewProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Product> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPName() {
        return null;
    }
    
    public final void setPName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQua() {
        return 0;
    }
    
    public final void setQua(int p0) {
    }
    
    public final int getPPrice() {
        return 0;
    }
    
    public final void setPPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPPid() {
        return null;
    }
    
    public final void setPPid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPImage() {
        return null;
    }
    
    public final void setPImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardNumber() {
        return null;
    }
    
    public final void setCardNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addProductToBag() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJsonData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    private final void setProductData() {
    }
    
    private final void setRecData() {
    }
}