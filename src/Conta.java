public class Conta {
  int agencia;
  int numero;
  String titulo;
  double saldo;

  void depositar(double valor){
    saldo += valor;

  }

  boolean sacar(double valor){
    if (saldo >= valor){
      saldo -= valor;
      return  true;
    }
    else{
      return  false;
    }
  }

}
