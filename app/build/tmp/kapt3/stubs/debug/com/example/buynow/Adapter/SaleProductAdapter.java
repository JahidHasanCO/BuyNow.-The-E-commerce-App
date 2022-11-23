package com.example.buynow.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/buynow/Adapter/SaleProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/buynow/Adapter/SaleProductAdapter$ViewHolder;", "saleProductList", "Ljava/util/ArrayList;", "Lcom/example/buynow/Model/Product;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "ctx", "getCtx", "()Landroid/content/Context;", "getItemCount", "", "goDetailsPage", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SaleProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.buynow.Adapter.SaleProductAdapter.ViewHolder> {
    private final java.util.ArrayList<com.example.buynow.Model.Product> saleProductList = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context ctx = null;
    
    public SaleProductAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Product> saleProductList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCtx() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.buynow.Adapter.SaleProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.SaleProductAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void goDetailsPage(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/example/buynow/Adapter/SaleProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "discountTv_singleProduct", "Landroid/widget/TextView;", "getDiscountTv_singleProduct", "()Landroid/widget/TextView;", "discount_singleProduct", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "getDiscount_singleProduct", "()Landroid/widget/LinearLayout;", "productAddToFav_singleProduct", "Landroid/widget/ImageView;", "getProductAddToFav_singleProduct", "()Landroid/widget/ImageView;", "productBrandName_singleProduct", "getProductBrandName_singleProduct", "productImage_singleProduct", "getProductImage_singleProduct", "productName_singleProduct", "getProductName_singleProduct", "productPrice_singleProduct", "getProductPrice_singleProduct", "productRating_singleProduct", "Landroid/widget/RatingBar;", "getProductRating_singleProduct", "()Landroid/widget/RatingBar;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView productImage_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView productAddToFav_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RatingBar productRating_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView productBrandName_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView discountTv_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView productName_singleProduct = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView productPrice_singleProduct = null;
        private final android.widget.LinearLayout discount_singleProduct = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getProductImage_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getProductAddToFav_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RatingBar getProductRating_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getProductBrandName_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDiscountTv_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getProductName_singleProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getProductPrice_singleProduct() {
            return null;
        }
        
        public final android.widget.LinearLayout getDiscount_singleProduct() {
            return null;
        }
    }
}