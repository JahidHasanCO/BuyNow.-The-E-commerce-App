package com.example.buynow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006,"}, d2 = {"Lcom/example/buynow/VisualResultActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "PredictName", "", "getPredictName", "()Ljava/lang/String;", "setPredictName", "(Ljava/lang/String;)V", "predictNameTV", "Landroid/widget/TextView;", "getPredictNameTV", "()Landroid/widget/TextView;", "setPredictNameTV", "(Landroid/widget/TextView;)V", "predictedRecView", "Landroidx/recyclerview/widget/RecyclerView;", "getPredictedRecView", "()Landroidx/recyclerview/widget/RecyclerView;", "setPredictedRecView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "resultProduct", "Ljava/util/ArrayList;", "Lcom/example/buynow/Model/Product;", "Lkotlin/collections/ArrayList;", "getResultProduct", "()Ljava/util/ArrayList;", "setResultProduct", "(Ljava/util/ArrayList;)V", "visualSearchResultAdapter", "Lcom/example/buynow/Adapter/VisualSearchResultAdapter;", "getVisualSearchResultAdapter", "()Lcom/example/buynow/Adapter/VisualSearchResultAdapter;", "setVisualSearchResultAdapter", "(Lcom/example/buynow/Adapter/VisualSearchResultAdapter;)V", "getJsonData", "context", "Landroid/content/Context;", "fileName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setResultData", "app_debug"})
public final class VisualResultActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.TextView predictNameTV;
    public java.util.ArrayList<com.example.buynow.Model.Product> resultProduct;
    public com.example.buynow.Adapter.VisualSearchResultAdapter visualSearchResultAdapter;
    public androidx.recyclerview.widget.RecyclerView predictedRecView;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PredictName = "";
    
    public VisualResultActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getPredictNameTV() {
        return null;
    }
    
    public final void setPredictNameTV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.buynow.Model.Product> getResultProduct() {
        return null;
    }
    
    public final void setResultProduct(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.buynow.Model.Product> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.VisualSearchResultAdapter getVisualSearchResultAdapter() {
        return null;
    }
    
    public final void setVisualSearchResultAdapter(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.VisualSearchResultAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getPredictedRecView() {
        return null;
    }
    
    public final void setPredictedRecView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPredictName() {
        return null;
    }
    
    public final void setPredictName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJsonData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    private final void setResultData() {
    }
}