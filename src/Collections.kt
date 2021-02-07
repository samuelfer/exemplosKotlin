
fun main(args : Array<String>) {
    val numeros = mutableListOf("Um", "Dois", "Três")
    numeros.add("Quatro")   // Eh possivel alterar uma collection mutavel
//    numbers = mutableListOf("Um", "Dois", "Três") //Não é possível reatribuir uma colecao
    println(numeros)
    println("##########################")
    collectionFiltrosTamanhoString()
    println("##########################")
    collectionTipoElemento()
    println("##########################")
    excluiOsDoisPrimeirosItens()
    println("##########################")
    excluiOsDoisUltimosItens()
    println("##########################")
    collectionfilterEquals("Diogo")
}

fun collectionFiltrosTamanhoString() {
    val numeros = listOf("Um", "Dois", "Três")
    val tamanhoStringMaiorQue3 = numeros.filter { it.length > 3 } //Filtra onde tamanho da string eh maior que 3
    println(tamanhoStringMaiorQue3)

}

/**
 * Retorna elementos do tipo escolhido
 */
fun collectionTipoElemento() {
    val numeros = listOf(null, 1, "dois", 3.0, "quatro")

    numeros.filterIsInstance<String>().forEach {//Tipo de elemento escolhido string
        println(it.toUpperCase())//Transforma string em maiusculas
    }
}

fun excluiOsDoisPrimeirosItens() {
    val array = arrayOf(1, 2, 3, 4)
    val result = array.drop(2)

    println("Result da exclusão dos 2 primeiros itens do array "+result)
}

fun excluiOsDoisUltimosItens() {
    val array = arrayOf(1, 2, 3, 4)
    val result = array.dropLast(2)

    println("Result da exclusão dos 2 últimos itens do array "+result)
}

fun collectionfilterEquals(string: String) {
    val mapOriginal = mapOf("nome1" to "Diogo", "nome2" to "Ihago", "nome3" to "Ricardo")
    val mapFiltrado = mapOriginal.filter { it.value.equals(string) }
    println("Resultado "+mapFiltrado)
}