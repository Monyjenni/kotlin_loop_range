fun main(args: Array<String>) {
//   // for loop
//
    val cars = arrayOf("mazda","rollroy","Toyota","KIA")
    for (x in cars){
        println(x)
    }

    for (y in 1..100){
        println(y)
    }

    val num= arrayOf(1,2,3,5,8,3,4,6,1,3,4,0)
    for (z in num){
        println(z)
    }
    // doesnt take the last index
    for (t in 1 until 10){
        println(t)
    }

//    //countdown
    for (p in 10 downTo 1 step 2){
        println(p)
    }

    //intArray
    val numbers = intArrayOf(1,2,3,4)
    for (q in numbers){
        println(q)
    }
//
//    //loop to print the index of the lists

    val numBers = intArrayOf(26,23,56,73)
    for (f in numBers.indices){
        println(f)
    }

    // loop to print the both index and value

    val numberS = intArrayOf(3,5,2,4,6,1,8)
    for ((index,value ) in numbers.withIndex())
        println("$index ${value}")

    val lek = intArrayOf(3,4,1,8,9,3,5)
    for ((index,value) in lek.withIndex())
        if(value <= 1){
            continue
        }else{
            println(value)
        }

    //Break or Continue a Range

    for (nums in 5..15){
        if(nums==10){
            break
        }
        println(nums)
    }

    for (lekkhmer in 10 .. 50){
        if (lekkhmer == 15){
            continue
        }
        println(lekkhmer)
    }


}