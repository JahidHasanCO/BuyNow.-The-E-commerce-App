package com.example.buynow.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/buynow/Adapter/CartItemClickAdapter;", "", "onItemDeleteClick", "", "product", "Lcom/example/buynow/db/ProductEntity;", "onItemUpdateClick", "app_debug"})
public abstract interface CartItemClickAdapter {
    
    public abstract void onItemDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.buynow.db.ProductEntity product);
    
    public abstract void onItemUpdateClick(@org.jetbrains.annotations.NotNull()
    com.example.buynow.db.ProductEntity product);
}