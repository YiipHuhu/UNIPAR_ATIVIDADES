fun main() {
    val totalAge = ageAddiction(Alan, Carlos)
    println("Soma da idade entre ${Alan.name} e ${Carlos.name} é de $totalAge anos")
    val totalHeight = ageAddiction(Claudio, Ana)
    println("A multiplicação da altura entre ${Claudio.name} e ${Ana.name} é de $totalHeight altura")
    println(helloPeople(Alan))
    println(allInfs(Alan))
}

class People(
    var name: String,
    var height: Double,
    var age: Double,
    var student: Boolean
)

var Alan = People("Alan", 1.70, 19.9, true)
var Carlos = People("Carlos", 1.70, 19.0, true)
var Ana = People("Ana", 1.50, 15.0, true)
var Claudio = People("Claudio", 1.80, 30.0, true)


fun ageAddiction(person1: People, person2: People): Double {
    return person1.age + person2.age
}
fun heightAddiction(person1: People, person2: People): Double {
    return person1.height * person2.height
}
fun helloPeople(person: People) {
    println("Ola, ${person.name}")
}
fun allInfs(person: People) {
    if (person.student == true) {
        var result = "sim"
        println("Nome: ${person.name},\n ${person.height} de altura,\n ${person.age} anos,\n estudante: $result")
    }
    else{
        var result = "não"
        println("Nome: ${person.name},\n ${person.height} de altura,\n ${person.age} anos,\n estudante: $result")
    }
}


//    - Calcule a soma de duas idades e armazene o resultado em uma nova variável.
//    - Multiplique a altura por um fator de 2 e armazene o resultado.
//    - Concatene o nome da pessoa com uma saudação, por exemplo, "Olá, [Nome]!".