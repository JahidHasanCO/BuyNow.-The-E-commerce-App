package com.example.buynow.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/example/buynow/Adapter/CoverProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/buynow/Adapter/CoverProductAdapter$ViewHolder;", "ctx", "Landroid/content/Context;", "coverProductList", "Ljava/util/ArrayList;", "Lcom/example/buynow/Model/Product;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "getItemCount", "", "goDetailsPage", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CoverProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.buynow.Adapter.CoverProductAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context ctx;
    private final java.util.ArrayList<com.example.buynow.Model.Product> coverProductList = null;
    
    public CoverProductAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Product> coverProductList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.buynow.Adapter.CoverProductAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CoverProductAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void goDetailsPage(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/buynow/Adapter/CoverProductAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "productCheck_coverPage", "Landroid/widget/Button;", "getProductCheck_coverPage", "()Landroid/widget/Button;", "productImage_coverPage", "Landroid/widget/ImageView;", "getProductImage_coverPage", "()Landroid/widget/ImageView;", "productNoteCover", "Landroid/widget/TextView;", "getProductNoteCover", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView productImage_coverPage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView productNoteCover = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button productCheck_coverPage = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getProductImage_coverPage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getProductNoteCover() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getProductCheck_coverPage() {
            return null;
        }
    }
}