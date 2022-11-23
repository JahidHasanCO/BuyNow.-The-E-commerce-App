package com.example.buynow.utils

import java.util.regex.Pattern

enum class CardType {

    UNKNOWN, VISA("^4[0-9]{12}(?:[0-9]{3}){0,2}$"), MASTERCARD("^(?:5[1-5]|2(?!2([01]|20)|7(2[1-9]|3))[2-7])\\d{14}$"), AMERICAN_EXPRESS(
        "^3[47][0-9]{13}$"
    ),
    DINERS_CLUB("^3(?:0[0-5]\\d|095|6\\d{0,2}|[89]\\d{2})\\d{12,15}$"), DISCOVER("^6(?:011|[45][0-9]{2})[0-9]{12}$"), JCB(
        "^(?:2131|1800|35\\d{3})\\d{11}$"
    ),
    CHINA_UNION_PAY("^62[0-9]{14,17}$");

    private var pattern: Pattern?

    constructor() {
        pattern = null
    }

    constructor(pattern: String) {
        this.pattern = Pattern.compile(pattern)
    }

    companion object {

        fun detect(cardNumber: String?): CardType {
            for (cardType in values()) {
                if (null == cardType.pattern) continue
                if (cardNumber?.let {
                        cardType.pattern!!.matcher(it).matches()
                    } == true) return cardType
            }
            return UNKNOWN
        }
    }
}