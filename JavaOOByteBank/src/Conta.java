public class Conta {

        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int total;
        
        public Conta( int agencia, int numero) { 
        Conta.total ++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Foi cria a conta de nº: " + Conta.total + "Com o número nº " + this.numero + "agência nº: " + this.agencia);
        }

        public void deposita(double valor){
            this.saldo += valor;
        }

        public double getSaldo(){
            return this.saldo;
        }

        public boolean saca(double valor){
                if(this.saldo>=valor){
                    this.saldo -= valor;
                    System.out.println("Saque realizado com sucesso, novo saldo = " + this.saldo);
                    return true;
                } else {
                    System.out.println("Saldo insuficiente para saque");
                    return false;
                }      
            }

        public boolean transfere(double valor, Conta destino) {
                if(this.saldo >= valor){
                    this.saldo -= valor;
                    destino.deposita(valor);
                    System.out.println("Transferencia realizada com sucesso, novo saldo: "+ this.saldo);
                    return true;
                } else{
                    System.out.println("Saldo insuficiente para realizar a transferencia.");
                    return false;
                }
        }

        public int getNumero() { 
        return this.numero;
        }

        public void setNumero(int numero) {
            if(numero <= 0){
                System.out.println("O numero da conta não pode ser negativo");
            }
            this.numero = numero;
        }

        public int getAgencia() {
            return this.agencia;
        }
        
        public void setAgencia(int agencia) {
            if(agencia <= 0){
                System.out.println("O numero da agência não pode ser negativo");
            }
            this.agencia = agencia;
        }

        public void setTitular(Cliente titular) {
            this.titular = titular;
        }

        public Cliente getTitular() {
            return titular;
        }
}

