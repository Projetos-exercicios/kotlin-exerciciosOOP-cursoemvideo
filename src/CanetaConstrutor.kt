/*fun main() {
    //val c1 = Caneta()
    val c1 = Caneta("Bic","Vermelha", 0.6f)

    println("O modelo da caneta é ${c1.getModelo()}")
    println("A cor da caneta é ${c1.getCor()}")
    println("A ponta da caneta é ${c1.getPonta()}")


}
//(1)
class Caneta (){
    private var modelo: String = ""
    private var ponta:Float = 0.0f
    private var tampada:Boolean = false
    private var cor:String = ""

    //initializer block
   init {
       println("Eu sou um initializer block $cor")
   }

    //Metodo Construtor Simples
    //(2)
    /*constructor(cor:String = "Azul",):this(){
        this.cor = cor
        this.tampar();
    }*/

    //Metodo Construtor parametro
    constructor(m:String,c:String,p:Float):this(){
        this.modelo = m
        this.cor = c
        this.ponta = p
        this.tampar()


    }

    fun tampar(){
        this.tampada = true
    }

    fun getCor(): String = this.cor

    fun setCor(c:String){
        this.cor = c
    }
    fun getPonta(): Float = this.ponta

    fun setPonta(p:Float){
        this.ponta = p
    }

    fun getModelo(): String = this.modelo

    fun setModelo(m:String){
        this.modelo = m
    }
}
/*
    (1). A class in Kotlin can have a primary constructor and one or more secondary constructors.
    The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
    Portanto, é necessário que sejam referenciados no constructor secundario que vem logo abaixo
    (2). :this() faz "chamar" o primario, se houvessem parametros dentro da class Caneta eles
    teriam que ser referenciados dentro do this. Neste caso como não tem ele é colocado vazio
* */