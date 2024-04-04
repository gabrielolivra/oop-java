public class TesteReferencia {
    public static void main(String[] args) {
      Conta primeiraConta =  new Conta();
      Conta segundaConta = new Conta();

      primeiraConta.depositar(1000);
      segundaConta.depositar(50);

      primeiraConta.transferir(450, segundaConta);

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);


    }
}
