import java.text.DecimalFormat

fun main() {
    val product = Product("Notebook", 3500.0, 3)
    val taxRate = 0.15
    val desiredProfitMargin = 0.20

    val totalWithoutTax = calculateTotalWithoutTax(product)
    val taxAmount = calculateTaxAmount(totalWithoutTax, taxRate)
    val totalWithTax = calculateTotalWithTax(totalWithoutTax, taxAmount)
    val sellingPrice = calculateSellingPrice(totalWithTax, desiredProfitMargin)

    val df = DecimalFormat("R$ #,##0.00")
    val formattedTotalWithTax = df.format(totalWithTax)
    val formattedSellingPrice = df.format(sellingPrice)

    displayProductInfo(product, taxRate, desiredProfitMargin, totalWithoutTax, taxAmount, formattedTotalWithTax, formattedSellingPrice, df)
}

class Product(
    var name: String,
    var unitPrice: Double,
    var quantityPurchased: Int
)

fun calculateTotalWithoutTax(product: Product): Double {
    return product.unitPrice * product.quantityPurchased
}

fun calculateTaxAmount(totalWithoutTax: Double, taxRate: Double): Double {
    return totalWithoutTax * taxRate
}

fun calculateTotalWithTax(totalWithoutTax: Double, taxAmount: Double): Double {
    return totalWithoutTax + taxAmount
}

fun calculateSellingPrice(totalWithTax: Double, profitMargin: Double): Double {
    return totalWithTax * (1 + profitMargin)
}

fun displayProductInfo(
    product: Product,
    taxRate: Double,
    profitMargin: Double,
    totalWithoutTax: Double,
    taxAmount: Double,
    formattedTotalWithTax: String,
    formattedSellingPrice: String,
    df: DecimalFormat
) {
    println("Nome do Produto: ${product.name}")
    println("Preço Unitário: ${df.format(product.unitPrice)}")
    println("Quantidade Comprada: ${product.quantityPurchased}")
    println("Taxa de Imposto: ${taxRate * 100}%")
    println("Margem de Lucro Desejada: ${profitMargin * 100}%")
    println("Total Sem Impostos: ${df.format(totalWithoutTax)}")
    println("Valor do Imposto: ${df.format(taxAmount)}")
    println("Total com Impostos: $formattedTotalWithTax")
    println("Preço de Venda Necessário: $formattedSellingPrice")
    println("\nProduto: ${product.name}\nTotal com Impostos: $formattedTotalWithTax\nPreço de Venda Sugerido: $formattedSellingPrice")
}
