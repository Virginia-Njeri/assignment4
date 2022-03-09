fun main() {
    nameOfCars(arrayOf("volvo","mercedez","Honda","BMW"))

  cities(arrayOf("harare","mumbai","dodoma","jakarta"))

    (arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62))
    (arrayOf("owl","hen","dove"))



}


fun nameOfCars(name:Array<String>){
    println(name.contentToString())
}
fun cities(cities:Array<String>) {
    cities.forEach { cities ->
        println(cities.capitalize())
    }
    fun nuM(num: Array<Int>) {
        var sum = num[2] + num[5]
        println(sum)
        var position = num.indexOf(158)
        println(position)
        var Assend = num.sortedArray()
        println(Assend.contentToString())
    }

    fun birdsName(names:Array<String>):Array <String>{
    var name=names
    println(name.contentToString())
    return name

    }
}











