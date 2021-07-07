package com.example.buynow.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u0006H\u0016J\u0010\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020\u0006H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u00069"}, d2 = {"Lcom/example/buynow/Fragment/BagFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/buynow/Adapter/CartItemClickAdapter;", "()V", "Item", "Ljava/util/ArrayList;", "Lcom/example/buynow/db/ProductEntity;", "Lkotlin/collections/ArrayList;", "getItem", "()Ljava/util/ArrayList;", "setItem", "(Ljava/util/ArrayList;)V", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "getAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "setAnimationView", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "cartAdapter", "Lcom/example/buynow/Adapter/CartAdapter;", "getCartAdapter", "()Lcom/example/buynow/Adapter/CartAdapter;", "setCartAdapter", "(Lcom/example/buynow/Adapter/CartAdapter;)V", "cartRecView", "Landroidx/recyclerview/widget/RecyclerView;", "getCartRecView", "()Landroidx/recyclerview/widget/RecyclerView;", "setCartRecView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "cartViewModel", "Lcom/example/buynow/db/CartViewModel;", "sum", "", "getSum", "()I", "setSum", "(I)V", "totalPriceBagFrag", "Landroid/widget/TextView;", "getTotalPriceBagFrag", "()Landroid/widget/TextView;", "setTotalPriceBagFrag", "(Landroid/widget/TextView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemDeleteClick", "product", "onItemUpdateClick", "app_debug"})
public final class BagFragment extends androidx.fragment.app.Fragment implements com.example.buynow.Adapter.CartItemClickAdapter {
    public androidx.recyclerview.widget.RecyclerView cartRecView;
    public com.example.buynow.Adapter.CartAdapter cartAdapter;
    public com.airbnb.lottie.LottieAnimationView animationView;
    public android.widget.TextView totalPriceBagFrag;
    public java.util.ArrayList<com.example.buynow.db.ProductEntity> Item;
    private int sum = 0;
    private com.example.buynow.db.CartViewModel cartViewModel;
    
    public BagFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getCartRecView() {
        return null;
    }
    
    public final void setCartRecView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.CartAdapter getCartAdapter() {
        return null;
    }
    
    public final void setCartAdapter(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CartAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.airbnb.lottie.LottieAnimationView getAnimationView() {
        return null;
    }
    
    public final void setAnimationView(@org.jetbrains.annotations.NotNull()
    com.airbnb.lottie.LottieAnimationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTotalPriceBagFrag() {
        return null;
    }
    
    public final void setTotalPriceBagFrag(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.buynow.db.ProductEntity> getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.db.ProductEntity> p0) {
    }
    
    public final int getSum() {
        return 0;
    }
    
    public final void setSum(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onItemDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.buynow.db.ProductEntity product) {
    }
    
    @java.lang.Override()
    public void onItemUpdateClick(@org.jetbrains.annotations.NotNull()
    com.example.buynow.db.ProductEntity product) {
    }
}