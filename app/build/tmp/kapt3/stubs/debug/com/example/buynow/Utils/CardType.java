package com.example.buynow.Utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0007\b\u0012\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/example/buynow/Utils/CardType;", "", "(Ljava/lang/String;I)V", "pattern", "", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/util/regex/Pattern;", "UNKNOWN", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DINERS_CLUB", "DISCOVER", "JCB", "CHINA_UNION_PAY", "Companion", "app_debug"})
public enum CardType {
    /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
    /*public static final*/ VISA /* = new VISA() */,
    /*public static final*/ MASTERCARD /* = new MASTERCARD() */,
    /*public static final*/ AMERICAN_EXPRESS /* = new AMERICAN_EXPRESS() */,
    /*public static final*/ DINERS_CLUB /* = new DINERS_CLUB() */,
    /*public static final*/ DISCOVER /* = new DISCOVER() */,
    /*public static final*/ JCB /* = new JCB() */,
    /*public static final*/ CHINA_UNION_PAY /* = new CHINA_UNION_PAY() */;
    private java.util.regex.Pattern pattern;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.buynow.Utils.CardType.Companion Companion = null;
    
    CardType() {
    }
    
    CardType(java.lang.String pattern) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/buynow/Utils/CardType$Companion;", "", "()V", "detect", "Lcom/example/buynow/Utils/CardType;", "cardNumber", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.buynow.Utils.CardType detect(@org.jetbrains.annotations.Nullable()
        java.lang.String cardNumber) {
            return null;
        }
    }
}