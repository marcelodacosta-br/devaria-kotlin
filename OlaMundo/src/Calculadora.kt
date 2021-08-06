import java.math.BigDecimal

fun calculaOperacao(primeiroNumero : BigDecimal, operador : String, segundoNumero : BigDecimal) : BigDecimal{
    when(operador){
        "+" -> return primeiroNumero + segundoNumero
        "-" -> return primeiroNumero - segundoNumero
        "*" -> return primeiroNumero * segundoNumero
        "/" -> return primeiroNumero / segundoNumero
        "%" -> return primeiroNumero % segundoNumero
        else -> return BigDecimal.ZERO
    }
}
fun main (){
    println("Digite um número válido:")
    val primeiroNumero = readLine()?.toBigDecimalOrNull()

    if (primeiroNumero == null){
        println("Primeiro número informado não é válido")
        return
    }

    println("digite um operador válido (+, -, *, /, %")
    val operador = readLine()

    if (operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != null && operador != "+" && operador != "-" && operador != "*" && operador != "/" && operador != "%")){
        println("Operador inválido")
        return
    }

    println("Digite um segundo válido:")
    val segundoNumero = readLine()?.toBigDecimalOrNull()

    if (segundoNumero == null){
        println("segundo número informado não é válido")
        return
    }

    val resultado = calculaOperacao(primeiroNumero, operador, segundoNumero)
    println("o resultado da sua operacao foi: $resultado")

}