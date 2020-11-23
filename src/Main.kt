fun main(args: Array<String>) {
    /*
    println("Hello World")
    var x: Double = 3.156
    x=5.12
    println("x = $x")
    val creditcardnumber = 123_585_55_15L
    println("creditcardnumber = $creditcardnumber")
    val anullableint : Int?
    anullableint = 20
    println("anullableint = $anullableint")
    val anInt: Int? = 123
    val aLong: Long? = anInt?.toLong()
    println("aLong = $aLong")
    var aconvertedfloat:Float = "123.5".toFloat()
    println("aconvertedfloat = $aconvertedfloat")
    var a: Double = 0.0
    var b: Double = -0.0
    if(a == b) {
        println("a is equal to b")
    }
    var z: Double =10.20
    var a1: Double = z
    var b1: Double = z
    if (a1 === b1) {
        println("a1 is identical to b1")
    }
    val atruevalue = (100 > 10) && (2>1)
    println("atruvalue = $atruevalue")
    val atruevalue1 = (100>14) || (2>58)
    println("atrulvalue1 = $atruevalue1")
    */
    val strings: Array<String> = arrayOf("a","b","c","d")
    for (string in strings) {
        println("string = $string")
    }
    var a: Double = 125.5
    var b: Double = 5.4
    if (a>=b) {
        println("a is larger than equal b")
    } else {
        println("a is smaller than equal b")
    }
    var aString = if(a>=b) "larger" else "Smaller"
    println("aString = $aString")
    var c: Char = 'b'
    var Stringresult: String = when(c){
        'a'-> "The first character of the alphabet"
        'b'-> "The second character of the alphabet"
        else-> "One of the character of the alphabet"
    }
    println("stringresult = $Stringresult")
    fun checknumber(inputnumber: Int) = when (inputnumber){
        0 -> {
            println("do something...")
            println("this is zero")
        }
        1,2 -> print("one or two")
        in 3..10 -> print("a few, several")
        else -> print("many")
    }
    checknumber(inputnumber = 255)
    val intnumbers: Array<Int> = arrayOf(25, 45, 58, 48)
    println("for loop")
    for (intnumber in intnumbers){
        println("intnumber = $intnumber")
    }
    println("using indices")
    for(index in intnumbers.indices){
        println("value at index = $index is ${intnumbers[index]}")
    }
     var x: Long = 10
    val y: Double = 100.58
    if (x>=y){
        println("x is bigger than y")
    } else println("y is bigger than x")
    if (a>=b){
        println("a is bigger than b")
    } else println ("a is smaller than b")
    


}






