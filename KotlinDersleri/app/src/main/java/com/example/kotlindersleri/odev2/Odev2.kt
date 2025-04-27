package com.example.kotlindersleri.odev2

import kotlinx.coroutines.processNextEventInCurrentThread
import kotlinx.coroutines.yield

fun main() {
    val sonuc = Fonksiyon1(5)
    println(sonuc)
    var sonuc2 = Fonksiyon2(3,4)
    println(sonuc2)
    var sonuc3 = Fonksiyon3(4)
    println(sonuc3)
    var sonuc4= Fonksiyon4("Ankara")
    println(sonuc4)
    var sonuc5 = Fonksiyon5(3)
    println(sonuc5)
    var sonuc6 = Fonksiyon6(21)
    println(sonuc6)
    var sonuc7 = Fonksiyon7(60)
    println(sonuc7)

}
fun Fonksiyon1 (derece:Int) : Double {
   return derece*1.8+32
}
fun Fonksiyon2(kenar1:Int, kenar2:Int) : Int {
    return kenar1*2+kenar2*2
}
fun Fonksiyon3(sayi:Int) : Int {
    var sonuc=1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}
fun Fonksiyon4(kelime:String) : Int {
    return kelime.count {it =='a'|| it =='A'}
}
fun Fonksiyon5(kenars:Int) : Int {
    return (kenars-2)*180
}
fun Fonksiyon6(gun:Int) : Int {
    var saat = gun*8
    if (saat>160){
        return 1600+(saat-160)*20
    }else{
        return 1600
    }
}
fun Fonksiyon7(kota:Int) : Int {
    if (kota>50){
        return 100+(kota-50)*4
    }else{
        return 100
    }
}
