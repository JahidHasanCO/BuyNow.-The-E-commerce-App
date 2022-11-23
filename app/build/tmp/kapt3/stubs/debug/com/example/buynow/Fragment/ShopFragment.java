package com.example.buynow.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cJ&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006+"}, d2 = {"Lcom/example/buynow/Fragment/ShopFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cateList", "Ljava/util/ArrayList;", "Lcom/example/buynow/Model/Category;", "Lkotlin/collections/ArrayList;", "getCateList", "()Ljava/util/ArrayList;", "setCateList", "(Ljava/util/ArrayList;)V", "categoryAdapter", "Lcom/example/buynow/Adapter/CategoryAdapter;", "getCategoryAdapter", "()Lcom/example/buynow/Adapter/CategoryAdapter;", "setCategoryAdapter", "(Lcom/example/buynow/Adapter/CategoryAdapter;)V", "coverProduct", "Lcom/example/buynow/Model/Product;", "getCoverProduct", "setCoverProduct", "coverProductAdapter", "Lcom/example/buynow/Adapter/CoverProductAdapter;", "getCoverProductAdapter", "()Lcom/example/buynow/Adapter/CoverProductAdapter;", "setCoverProductAdapter", "(Lcom/example/buynow/Adapter/CoverProductAdapter;)V", "getJsonData", "", "context", "Landroid/content/Context;", "fileName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setCategoryData", "", "setCoverData", "app_debug"})
public final class ShopFragment extends androidx.fragment.app.Fragment {
    public java.util.ArrayList<com.example.buynow.Model.Category> cateList;
    public java.util.ArrayList<com.example.buynow.Model.Product> coverProduct;
    public com.example.buynow.Adapter.CategoryAdapter categoryAdapter;
    public com.example.buynow.Adapter.CoverProductAdapter coverProductAdapter;
    
    public ShopFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.buynow.Model.Category> getCateList() {
        return null;
    }
    
    public final void setCateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.buynow.Model.Product> getCoverProduct() {
        return null;
    }
    
    public final void setCoverProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Product> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.CategoryAdapter getCategoryAdapter() {
        return null;
    }
    
    public final void setCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CategoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.CoverProductAdapter getCoverProductAdapter() {
        return null;
    }
    
    public final void setCoverProductAdapter(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CoverProductAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setCategoryData() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJsonData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    private final void setCoverData() {
    }
}