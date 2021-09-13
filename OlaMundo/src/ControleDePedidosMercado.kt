/*
    Escrever um programa que recebe alguns produtos como argumento, - ok
    validar se eesses produtos estão na lsita de itens disponiveis do mercado - ok
    Caso esteja, avisar o usuario guais produtos tem - ok
    e quais não tem - ok
    e por ultimo, exibir a lista de produtos disponiveis ordenados por ordem alfabetica do mercado, para que o usuario possa pedir na proxima vez - ok
 */

fun main(argumentos : Array<String>) {

    //validar se vieram produtos nos argumentos
    if (argumentos.isEmpty()){
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade ")
        return
    }

    val produtosDisponiveis = arrayOf("PÃO", "BOLACHA", "QUEIJO", "ARROZ", "OVO", "FRANGO", "AZEITE", "ÓLEO")

    val produtosRequisitadosDisponiveis = argumentos.filter{produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado.toUpperCase())} //vai trazer somente os produtos que tem no mercado

    for (produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nós temos: $produtoRequisitadoDisponivel")
    }

    val produtosRequisitadosNaoDisponiveis = argumentos.filter { produtoRequisitado -> !produtosDisponiveis.contains(produtoRequisitado.toUpperCase()) }

    produtosRequisitadosNaoDisponiveis.forEach{ produtoNaoDisponivel -> println("Este produto nós não temos infelizmente: $produtoNaoDisponivel")}

    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }
}