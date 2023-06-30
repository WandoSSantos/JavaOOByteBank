public class TestaGetESet {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1234, 6543);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente(); 
        paulo.setNome("Ramiro");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Fisioterapeuta"); 
            //agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Fisioterapeuta");

        System.out.println(titularDaConta); 
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}
