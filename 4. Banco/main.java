public class main {
    public static void main(String[] args) {
        
        Banco banco1 = new Banco();
        banco1.cliente = "Daniel";
        banco1.conta = "1235678-9";
        banco1.saque = 50.00;
        banco1.deposito = 750.00;
        banco1.transferencia = 33.90;

        banco1.exibirInformacoes();
    }
}