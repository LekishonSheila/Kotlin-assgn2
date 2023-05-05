fun main() {
    val name = "Sheila"
    val age = 20
    val country = "Kenya"
    val studentGreet = student(name, age, country)
    println(studentGreet)

    val detail = "Lekishon"
    val length = stringLength(detail)
    println("String length of $detail is $length")

    checkMyName("Sheila")
    checkMyName("Christine")

    val school = "AkiraChix"
    val replaced = replaceVowels(school)
    println(replaced)


}
//Write a function that takes in 3 parameters, name, age, and country, and returns
// a String with this structure “Hi, my name is x, I am y years old and I am from z.”
// Where x, y, and z are the provided name, age, and country respectively.
fun student(name:String,age:Int,country:String):String{
    return "Hi, my name is $name, I am $age years old and I am from $country"


}
// Write a function that takes in a String and returns its length
fun stringLength(detail:String):Int{
    return detail.length

}

//Write a function that takes in a name and prints out “That’s me!”
// when your name is passed to it, otherwise, it prints out “I don’t know who that is”
fun checkMyName(name: String){
    val myName = "Sheila"
    if(name == myName){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }

}

//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output.

fun replaceVowels(school: String): String {
    val vowels = "aeiouAEIOU"
    val replaced = school.replace(Regex("[$vowels]"), "*")
    return "String '$school' with vowels replaced by '*' is '$replaced'."
}


