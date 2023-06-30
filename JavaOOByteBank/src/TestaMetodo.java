public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta =new Conta(1234, 6352);
        conta.deposita(100);
        conta.deposita(50);

        System.out.println(conta.getSaldo());

        conta.saca(20);

        Conta conta2 = new Conta(1223, 9856);
        conta2.deposita(1000); 

        conta2.transfere(300, conta);

        

    }
}
