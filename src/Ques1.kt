import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    print("Enter principal value: ")
    val p = s.nextInt()
    print("Enter rate value: ")
    val r = s.nextDouble()
    print("Enter time value: ")
    val t = s.nextInt()

    val si = SI()
    println("Simple Interest: ${si.findSI(p, r, t)}")
    println("Simple Interest Through Lambda: ${si.findSIByLambda(p, r, t)}")
}

class SI {
    fun findSI(p: Int, r: Double, t: Int): Double {
        return (p* r*t) / 100
    }

    val findSIByLambda: (Int, Double, Int) -> Double = { p, r, t -> (p * r * t) / 100 }
}