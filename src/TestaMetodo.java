public class TestaMetodo {
    public static void main(String[] args) {
        Conta testaMetodo = new Conta();
        testaMetodo.saldo = 1000.00;
        testaMetodo.titulo = "Gabriel";

        if(testaMetodo.sacar(900)){
            System.out.println("Voce efetuou um saque!");
        }
        else{
            System.out.println("Não foi possivel efetuar o saque! Valor maior que o saldo!");
        }

        System.out.println(testaMetodo.saldo);
    }
}
