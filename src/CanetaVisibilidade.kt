/*fun main() {
    val c1 = Caneta("Bic cristal","azul");
    //c1.ponta = 3.5f
    //c1.tampada = false
    c1.destampar()
    println(c1.rabiscar())
    //println("O objeto caneta c1 é ${c1.modelo} e tem cor ${c1.cor} e está tampada = ${c1.tampada}")
    println("O objeto caneta c1 é ${c1.modelo} e tem cor ${c1.cor} ")

//    val c2 = Caneta("Bic","verde")
//    c2.ponta = 0.4f
//    c2.tampar()
//    println("O objeto caneta c2 é ${c2.modelo} e tem cor ${c2.cor} e está tampada = ${c2.tampada} ")

}
class Caneta(public var modelo:String,public var cor:String){
    private var ponta:Float = 0.0f
    protected var carga:String = ""
    protected var tampada:Boolean = true


    public fun rabiscar() = if(this.tampada) {
        println("ERRO! Não posso rabiscar!")
    }else{
        println("Estou rabiscando...")
    }
   public fun tampar(){
        tampada = true
    }
    public fun destampar(){
        tampada = false
    }
}*/