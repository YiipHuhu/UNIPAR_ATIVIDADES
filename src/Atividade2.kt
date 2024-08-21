fun main() {
    // Instâncias de Employee
    val joao = Employee("João", 30, 5000.0, 12, 15)

    // Cálculos e exibição de informações
    val annualGrossSalary = calculateAnnualGrossSalary(joao)
    val annualNetSalary = calculateAnnualNetSalary(joao, 3000.0)

    println("Nome: ${joao.name}")
    println("Idade: ${joao.age} anos")
    println("Salário Bruto Mensal: R$ ${joao.monthlyGrossSalary}")
    println("Meses Trabalhados: ${joao.monthsWorked}")
    println("Produtos Comprados: ${joao.productsPurchased}")
    println("Salário Bruto Anual: R$ $annualGrossSalary")
    println("Salário Anual Líquido: R$ $annualNetSalary")
    println(generateMessage(joao, annualNetSalary))
}

class Employee(
    var name: String,
    var age: Int,
    var monthlyGrossSalary: Double,
    var monthsWorked: Int,
    var productsPurchased: Int
)

fun calculateAnnualGrossSalary(employee: Employee): Double {
    return employee.monthlyGrossSalary * employee.monthsWorked
}

fun calculateAnnualNetSalary(employee: Employee, fixedDiscount: Double): Double {
    val annualGrossSalary = calculateAnnualGrossSalary(employee)
    return annualGrossSalary - fixedDiscount
}

fun generateMessage(employee: Employee, annualNetSalary: Double): String {
    return "O salário anual líquido de ${employee.name} é R$ $annualNetSalary."
}