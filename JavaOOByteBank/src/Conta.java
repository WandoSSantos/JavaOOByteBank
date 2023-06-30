public class Conta {

        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        
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
            this.numero = numero;
        }

        public int getAgencia() {
            return this.agencia;
        }
        
        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }

        
}

