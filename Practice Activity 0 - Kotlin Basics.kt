fun main() {
    fun lbsToKg(lbs: Double): Double = lbs * 0.453592
    fun kgToLbs(kg: Double): Double = kg / 0.453592
    fun milesToKm(mi: Double): Double = mi * 1.60934
    fun kmToMiles(km: Double): Double = km / 1.60934
    fun fahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9
    fun celsiusToFahrenheit(c: Double): Double = (c * 9 / 5) + 32

    println("Do you want to convert (1) lbs to kg or (2) kg to lbs? Enter 1 or 2:")
    when (readLine()!!.toInt()) {
        1 -> {
            print("Enter the value in pounds: ")
            val lbs = readLine()!!.toDouble()
            println("$lbs lbs is : ${lbsToKg(lbs)} kg")
        }
        2 -> {
            print("Enter the value in kilograms: ")
            val kg = readLine()!!.toDouble()
            println("$kg kg is : ${kgToLbs(kg)} lbs")
        }
    }
    println("[][][][[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]")
    println("Do you want to convert (1) miles to km or (2) km to miles? Enter 1 or 2:")
    when (readLine()!!.toInt()) {
        1 -> {
            print("Enter the value in miles: ")
            val mi = readLine()!!.toDouble()
            println("$mi miles is : ${milesToKm(mi)} kilometers")
        }
        2 -> {
            print("Enter the value in kilometers: ")
            val km = readLine()!!.toDouble()
            println("$km km is : ${kmToMiles(km)} miles")
        }
    }
    println("[][]][[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]")
    println("Do you want to convert (1) Fahrenheit to Celsius or (2) Celsius to Fahrenheit? Enter 1 or 2:")
    when (readLine()!!.toInt()) {
        1 -> {
            print("Enter the value in Fahrenheit: ")
            val f = readLine()!!.toDouble()
            println("$f°F is : ${fahrenheitToCelsius(f)}°C")
        }
        2 -> {
            print("Enter the value in Celsius: ")
            val c = readLine()!!.toDouble()
            println("$c°C is : ${celsiusToFahrenheit(c)}°F")
        }
    }
    println("[][]][[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]")
    val ages = mutableListOf<Int>()
    println("Enter the ages of 10 students:")
    for (i in 1..10) {
        print("Student $i: ")
        val age = readLine()!!.toInt()
        ages.add(age)
    }
    val averageAge = ages.average()
    println("The ages of the students are: $ages")
    println("The average age is $averageAge")
    println("[][]][[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]")
    println("Fictional Story")
    val hero = "Arden"
    val warrior = "Kael"
    val mage = "Lira"
    val rogue = "Sylas"
    val dragon = "Valkor"
    val sword = "Blade of Eternity"
    val staff = "Staff of Elements"
    val bow = "Shadowstrike Bow"
    val potion = "Elixir of Life"
    val spell = "Inferno Blast"

    val story = """
        In the ancient land of Eldoria, a hero named $hero embarked on a perilous quest. Alongside his companions,
        the fearless warrior $warrior, the brilliant mage $mage, and the cunning rogue $rogue, they sought to defeat
        the mighty dragon $dragon. Armed with the legendary $sword, $staff, and $bow, the team faced numerous trials.
        With the help of the $potion and $spell, they overcame all odds to save their kingdom from destruction.
    """
    println(story)
}