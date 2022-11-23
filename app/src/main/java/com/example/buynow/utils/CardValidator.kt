package com.example.buynow.utils

object CardValidator {

    fun isValid(number: Long): Boolean {
        return (getSize(number) in 13..16 &&
                (prefixMatched(number, 4) ||
                        prefixMatched(number, 5) ||
                        prefixMatched(number, 37) ||
                        prefixMatched(number, 6)) &&
                (sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0)
    }


    private fun sumOfDoubleEvenPlace(number: Long): Int {
        var sum = 0
        val num = number.toString() + ""
        var i = getSize(number) - 2
        while (i >= 0) {
            sum += getDigit((num[i].toString() + "").toInt() * 2)
            i -= 2
        }
        return sum
    }

    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digits
    private fun getDigit(number: Int): Int {
        return if (number < 9) number else number / 10 + number % 10
    }

    // Return sum of odd-place digits in number
    private fun sumOfOddPlace(number: Long): Int {
        var sum = 0
        val num = number.toString() + ""
        var i = getSize(number) - 1
        while (i >= 0) {
            sum += (num[i].toString() + "").toInt()
            i -= 2
        }
        return sum
    }

    // Return true if the digit d is a prefix for number
    private fun prefixMatched(number: Long, d: Int): Boolean {
        return getPrefix(number, getSize(d.toLong())) == d.toLong()
    }

    // Return the number of digits in d
    private fun getSize(d: Long): Int {
        val num = d.toString() + ""
        return num.length
    }

    // Return the first k number of digits from
    // number. If the number of digits in number
    // is less than k, return number.
    private fun getPrefix(number: Long, k: Int): Long {
        if (getSize(number) > k) {
            val num = number.toString() + ""
            return num.substring(0, k).toLong()
        }
        return number
    }
}