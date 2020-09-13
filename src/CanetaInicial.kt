/*fun main() {
    val c1 = Caneta("Bic","azul");
    c1.tampada = false
    c1.destampar()
    println(c1.rabiscar())
    println("O objeto caneta c1 é ${c1.modelo} e tem cor ${c1.cor} e está tampada = ${c1.tampada}")

    val c2 = Caneta("Bic","verde")
    c2.ponta = 0.4f
    c2.tampar()
    println("O objeto caneta c2 é ${c2.modelo} e tem cor ${c2.cor} e está tampada = ${c2.tampada} ")

}
class Caneta(var modelo:String,var cor:String){
    //(1)
    var ponta:Float = 0.0f
    var carga:String = ""
    var tampada:Boolean = true

    //(2)(3)
    fun rabiscar() = if(this.tampada) {
        println("ERRO! Não posso rabiscar!")
    }else{
        println("Estou rabiscando...")
    }
    fun tampar(){
         tampada = true
    }
    fun destampar(){
        tampada = false
    }
}*/
/*
(1). Atributos sem usar construtores
     Contendo atributos obrigatórios e facultativos
     Os atributos devem ser sempre inicializados, podendo ter inferência automática

 (2).  Expression body  do modelo abaixo
        fun rabiscar(){
        if(this.tampada) {
          println("Estou rabiscando...")
        }else{
           println("ERRO! Não posso rabiscar!")
        }
    }
  (3). if(this.tampada==true) { modelo mais extenso
* */