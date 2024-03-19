//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

println(introWord("faith",20))
      myFirstName("Faith")
      var x = modulas(7,4)
      println(x)
      var y = add(3,4,5,6)
      println(y)
      aboutMyself("I love football")
      name2()
}

//Write a function that takes in 2 parameters, name and age and returns a String with this structure
fun introWord(name:String, age:Int): String {
      var sentence = "Hi my name is $name and I am $age years old."
      return sentence
}
//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g given “Ada” it will print out “Hello Ada”
fun myFirstName(name:String){
      val name = ("Hello ${name}")
      println(name)

}
//create and invoke a function that gives two numbers and return the remainder of their division
fun modulas(num1:Int,num2:Int):Int{
      var modulas=num1%num2
      return modulas
}
//Create and invoke  function that returns the sum of any given 4 numbers
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
      var add = num1+num2+num3+num4
      return add
}
//Create and invoke a function that prints out an interesting fact about yourself
fun aboutMyself(word:String){
      println(word)
}
//Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string.
fun name2() {
      var word = "Akirachix"
      var a = word[0]
      var b = word[2]
      var c = word[3]
      var d = "$a$b$c"
      println(d)
}


