package com.example.buynow.db.Card;

import java.lang.System;

@androidx.room.Entity(tableName = "Card_List")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/buynow/db/Card/CardEntity;", "", "nameCH", "", "number", "exp", "cvv", "brandC", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrandC", "()Ljava/lang/String;", "setBrandC", "(Ljava/lang/String;)V", "getCvv", "setCvv", "getExp", "setExp", "id", "", "getId", "()I", "setId", "(I)V", "getNameCH", "setNameCH", "getNumber", "setNumber", "app_debug"})
public final class CardEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "CardHolder_Name")
    private java.lang.String nameCH;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Card_Number")
    private java.lang.String number;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Card_Exp")
    private java.lang.String exp;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Card_cvv")
    private java.lang.String cvv;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "Card_Brand")
    private java.lang.String brandC;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    public CardEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String nameCH, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.String exp, @org.jetbrains.annotations.NotNull()
    java.lang.String cvv, @org.jetbrains.annotations.NotNull()
    java.lang.String brandC) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameCH() {
        return null;
    }
    
    public final void setNameCH(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExp() {
        return null;
    }
    
    public final void setExp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCvv() {
        return null;
    }
    
    public final void setCvv(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBrandC() {
        return null;
    }
    
    public final void setBrandC(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}