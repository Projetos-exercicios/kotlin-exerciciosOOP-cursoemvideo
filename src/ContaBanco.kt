//Jubileu CP 300
//Creuza  CC 500 -100
//numeroconta tipo saldo status
//abrir fechar conta depositar sacar pagarMensal
//cc +50 cp +150 mensalidade CP 20 CC 12
//não pode deixar divida ou dinheiro para fechar
fun main() {
    var conta1 = ContaBanco(111,"CP","Jubileu")
    println("Conta número ${conta1.numConta}")
    println("O dono se chama ${conta1.getDono()}")
    println("O tipo da conta é ${conta1.getTipoConta()}")
    println("O saldo da conta é ${conta1.getSaldo()}")
    println("A conta está ${conta1.getStatus()}")
    conta1.abrirConta();
    println("A conta está ${conta1.getStatus()}")
    println("O saldo da conta é ${conta1.getSaldo()}")
    conta1.depositar(300);
    println("O saldo da conta é ${conta1.getSaldo()}")
    //conta1.sacar(1000)
    println("O saldo da conta é ${conta1.getSaldo()}")
    conta1.pagarMensal()
    println("O saldo da conta é ${conta1.getSaldo()}")
    conta1.fecharConta()
    println("A conta está ${conta1.getStatus()}")
    println("-------*------")
    var conta2 = ContaBanco(222,"CC","Creuza")
    println("Conta número ${conta2.numConta}")
    println("O dono é  ${conta2.getDono()}")
    println("O tipo da conta é ${conta1.getTipoConta()}")
    println("O saldo da conta é ${conta2.getSaldo()}")
    println("A conta está ${conta2.getStatus()}")
    conta2.abrirConta()
    println("A conta está ${conta2.getStatus()}")
    println("O saldo da conta é ${conta2.getSaldo()}")
    conta2.depositar(500)
    println("O saldo da conta é ${conta2.getSaldo()}")
    conta2.sacar(100)
    println("O saldo da conta é ${conta2.getSaldo()}")
    conta2.pagarMensal()
    println("O saldo da conta é ${conta2.getSaldo()}")
    conta1.fecharConta()
    println("A conta está ${conta2.getStatus()}")
}

class ContaBanco(var numConta:Int,private var tipoConta:String,private var dono:String){
    private var status:Boolean = false
    private var saldo:Int = 0

    constructor(numConta:Int,tipoConta:String,dono:String,status:Boolean):this(numConta,tipoConta,dono){
        this.saldo = 0
        this.status = false
    }
    //Getters and setters funcionam diferente no kotlin esses saão apenas exemplos meus. Aguardar aula professor
    fun setDono(d:String){
        this.dono = d
    }

    fun getDono():String = this.dono
    //fun getDono(){  return this.dono   }

    fun setSaldo(s:Int){
        this.saldo += s
    }
    fun getSaldo():Int{
        return this.saldo
    }
    fun setTipoConta(t:String){
        this.tipoConta = t
    }
    //fun getSaldo():Int = this.saldo

    fun getTipoConta():String{
        return this.tipoConta
    }
    fun getStatus():Boolean = this.status
    fun abrirConta(){
        this.status = true
        if(tipoConta == "CC") this.saldo += 50 else if(tipoConta == "CP" )this.saldo += 150
    }
    fun depositar(qtdDeposito:Int){
        if(this.status) {
            this.saldo += qtdDeposito
        }else{
            println("Voce ainda não tem uma conta aberta")
        }
    }
    fun sacar(qtdeSaque: Int){
        if(this.status) {
            if(this.saldo <qtdeSaque ){
                println("Saldo Insuficiente")
            }else{
                this.saldo -= qtdeSaque
                println("Saque efetuado")
            }
        }else{
            println("Voce ainda não tem uma conta  aberta")
        }
    }
    fun pagarMensal(){
        if(this.status) {
          if (tipoConta=="CC") {
                this.saldo -= 12
            }else if(tipoConta=="CP") {
                this.saldo -= 20
            }
        }else{
            println("Voce ainda não tem uma conta  aberta")
        }
    }
    fun fecharConta() {
        if (this.saldo > 0) {
            println("Conta com ${this.saldo}. Não é possível fechar contas com saldo")
        } else if (this.saldo < 0) {
            println("Conta deve ${this.saldo}. Não é possível fechar contas com dívidas")
        }else{
            println("Conta fechada com sucesso")
            this.status = false
        }
    }

   /*
   constructor(status:Boolean,saldo:Int):this(){
    class ContaBanco(){
    private var status:Boolean = false
    var numConta:Int = 0
    protected var tipoConta:String = ""
    private var dono:String = ""
    private var saldo:Int=0
   * */
}