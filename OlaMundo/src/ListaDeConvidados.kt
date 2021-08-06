fun main() {
    println("Favor informar o nome do convidado:")
    val nome = readLine();

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado não é válido")
        return
    }

    println("Favor informar a idade do convidado:")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0){
        println("A idade informadada não é válida")
        return
    }

    var estaConvidado = false
    estaConvidado = when(nome){
        "Kaique" -> true
        "Ale" -> true
        "Ricardo" -> true
        "Alan" -> true
        "Aldo" -> true
        else -> false
    }

    if (estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin Devaria 2021")
    }else if (!estaConvidado){
        println("Você não está convidado, verifique com a pessoa que o convidou")
    }
    else
    {
        println("Você não tem 18 anos para entrar na festa")
    }

}