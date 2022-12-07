package com.example.test

class Math {
    fun add(a: String, b: String): String {
        var result = ""
        if (b == "" || a == "") {
            result = "нельзя вводить буквы"
        } else if (a.contains(".") || b.contains(".")) {
            var num1 = a.toDouble()
            var num2 = b.toDouble()
            result = (num1 + num2).toString()
        }else if (a.contains(Regex("[/!@^[.№%?&'()іңғүұқөһӘҢҒҰҚӨ]*\$]"))||
            b.contains(Regex("[/!@^[.№%?&'()әңғүұқөһӘҢҒҰҚӨ]*\$]"))) {
            result = "Символы вводить нельзя"
        }else if (a.contains(Regex("[A-zА-я]"))||b.contains(Regex("[A-zА-я]"))){
            result = "Буквы вводить нельзя"
        }else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            result = (num1 + num2).toString()
        }
        return result
    }

    fun divide(a:String,b: String):String{
        var result= ""
        if (b=="0"){
            result="нельзя делить на ноль"
        }else{
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 + num2).toString()
        }
        return result
    }
}