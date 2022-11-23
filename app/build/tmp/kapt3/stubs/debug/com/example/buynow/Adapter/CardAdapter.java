package com.example.buynow.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aR\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/example/buynow/Adapter/CardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/buynow/Adapter/CardAdapter$cardViewHolder;", "ctx", "Landroid/content/Context;", "listener", "Lcom/example/buynow/Adapter/CarDItemClickAdapter;", "(Landroid/content/Context;Lcom/example/buynow/Adapter/CarDItemClickAdapter;)V", "cardList", "Ljava/util/ArrayList;", "Lcom/example/buynow/db/Card/CardEntity;", "Lkotlin/collections/ArrayList;", "getListener", "()Lcom/example/buynow/Adapter/CarDItemClickAdapter;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "newList", "", "cardViewHolder", "app_debug"})
public final class CardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.buynow.Adapter.CardAdapter.cardViewHolder> {
    private final android.content.Context ctx = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.buynow.Adapter.CarDItemClickAdapter listener = null;
    private final java.util.ArrayList<com.example.buynow.db.Card.CardEntity> cardList = null;
    
    public CardAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CarDItemClickAdapter listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.buynow.Adapter.CarDItemClickAdapter getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.buynow.Adapter.CardAdapter.cardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.buynow.Adapter.CardAdapter.cardViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.buynow.db.Card.CardEntity> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/example/buynow/Adapter/CardAdapter$cardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardHName", "Landroid/widget/TextView;", "getCardHName", "()Landroid/widget/TextView;", "cardImage", "Landroid/widget/ImageView;", "getCardImage", "()Landroid/widget/ImageView;", "cardNumber", "getCardNumber", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "exp", "getExp", "layD", "Landroid/widget/LinearLayout;", "getLayD", "()Landroid/widget/LinearLayout;", "app_debug"})
    public static final class cardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cardNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cardHName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView exp = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout layD = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.CheckBox checkbox = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView cardImage = null;
        
        public cardViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCardNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCardHName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getExp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLayD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCheckbox() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCardImage() {
            return null;
        }
    }
}