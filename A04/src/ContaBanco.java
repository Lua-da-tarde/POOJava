public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String dono){
        this.saldo = 0;
        this.status = false;
        this.dono = dono;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public void setdono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta(int numConta, String tipo){
        if(status==false){
            this.numConta = numConta;
            this.tipo = tipo;
            if(tipo=="poupanca"){
                this.saldo = 150;
            } else if(tipo=="corrente"){
                this.saldo = 50;
            }
            status = true;
            System.out.println("\nVOCÊ ABRIU UMA CONTA");
            estatus();
        }else{
            System.out.println("\nVocê já tem uma conta!");
        }
    }

    public void fecharConta(){
        if(status==true){
            this.saldo = 0;
            this.status = false;
            System.out.println("\nVOCÊ FECHOU SUA CONTA");
        }else{
            System.out.println(getDono() + ", você não possui nenhuma conta para fechar.");
        }
    }

    public void sacar(int valor){
        if(valor<saldo){
            this.saldo = saldo - valor;
            System.out.println("\nSaque de " + valor + " reais efetuado na conta de " + getDono());
        }else{
            System.out.println("Valor maior que o saldo!");
        }
    }

    public void depositar(int valor){
        this.saldo = saldo + valor;
        System.out.println("\nDepósito de " + valor + " reais efetuado na conta de " + getDono());
    }

    public void estatus(){
        if(status==true){
            System.out.println("\nNumero da Conta: " + getNumConta());
            System.out.println("Tipo: " + getTipo());
            System.out.println("Dono: " + getDono());
            System.out.println("Saldo: " + getSaldo());
            System.out.println("Status: " + getStatus());
        }else{
            System.out.println("\n" + getDono() +", você não possui uma conta para checar.");
        }
    }

}
