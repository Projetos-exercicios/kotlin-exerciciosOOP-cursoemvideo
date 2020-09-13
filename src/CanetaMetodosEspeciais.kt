/*fun main() {
    val c1 = Caneta()

    //c1.modelo = "Cristal"
    c1.setMyModelo("Cristalina ponta fina")
    println("O modelo da caneta é ${c1.modelo}")

    c1.setPonta(5.5f)
    println("A ponta da caneta é ${c1.getPonta()}")
    //println("A ponta da caneta é ${c1.ponta}")
}
//(2)
class Caneta (){
    var modelo: String = ""
    private var ponta:Float = 0.0f

    //(1)
    fun getPonta(): Float = this.ponta

    fun setPonta(p:Float){
      this.ponta = p
    }
    //(2)
    fun setMyModelo(m:String){
      this.modelo = m
    }
}*/
/*
    (1). Modelo completo
    public fun getModelo(){
        return this.modelo
    }
    (2). Em uma declaração de classe, os parâmetros nas declarações do construtor são frequentemente mais do que apenas
    parâmetros. Usando val ou var, você está realmente declarando membros de propriedade (não apenas parâmetros).
    E junto com os membros da propriedade vêm "getters" automáticos (e "setters" no caso de var). O getter automático,
     no caso do OP, é chamado getContext (), mas a classe base já possui um getContext () (mesma assinatura)
     No caso do PHP vc criaria funções getters e  setters para acessá-las, porém em kotlin vc acessa usando inside acessors
     Isso ocorre quando a var ou val é publica, se privada o problema não ocorrera.
     É possivel criar um com o nome diferente

    (3). Ao deixar em branco os parametros assim como em php eu não envio nenhum valor para a classe <Não Esquecer>
    (4). A visibilidade public não precisa ser colocada, ela já é o padrão

* */