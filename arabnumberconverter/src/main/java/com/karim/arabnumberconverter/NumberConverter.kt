package com.karim.arabnumberconverter

class NumberConverter {
    companion object{
        fun arabNumber(str:String):String{
            val englishNumbers= arrayListOf<String>("0","1","2","3","4","5","6","7","8","9")
            val arabNumbers= arrayListOf<String>("٠","١","٢","٣","٤","٥","٦","٧","٨","٩")
            var str1=str
            for(i in 0..9){
                str1=str1.replace(englishNumbers[i],arabNumbers[i])
            }
            return str1
        }
    }
}