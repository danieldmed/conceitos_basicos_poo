public class Banco {

    String cliente;
    String conta;
    Double saque;
    Double deposito;
    Double transferencia;

    Double calcularSaldo(){
        return (deposito - saque - transferencia);
    }

    void exibirInformacoes(){
        System.out.println("Olá " + cliente + ", Conta: " + conta);
        System.out.println("Você fez um depósito de R$" + deposito + ", um saque de R$" + saque + " e uma transferência de R$" + transferencia + ".");
        System.out.println("Saldo restante: R$" + calcularSaldo());
    }
}
