fun main() {
//    val pessoa = Pessoa() Instanciando uma classe

    val marhashi : Pessoa = Pessoa("Marhashi", 7, "Masculino")
    marhashi.exibeInformacoesDaPessoa()
    println(marhashi.nome);//Acessando um determinado atributo
}

//Class com construtor primario, propriedades mutaveis
//propriedade peso com valor default

//Ao declarar um parâmetro com o modificador var dentro do construtor primário,
//o compilador de Kotlin gera os acessadores
//de propriedade: getter e setter. Se usarmos o val, gerará apenas o getter.
//Uma mesma classe pode ter os dois tipos de construtores, secundario e primario
//Podemos ter varios construtores secundarios dentro de uma classe
class Pessoa(var nome: String, var idade: Int, var sexo: String, var peso: Int = 20) {

    fun exibeInformacoesDaPessoa() {
//        Template string
//        Podemos usar apenas o $ seguido pelo nome da variável
//        Devemos usar o $ com {} e a variável com as funções dentro.
//        Se quisermos usar a tipagem implícita devemos atribuir algum valor para variável

        println("Olá meu nome é ${this.nome}, tenho ${this.idade} anos e " +
                "sou do sexo ${this.sexo.toLowerCase()} "+ " peso ${this.peso} quilos");
    }
}