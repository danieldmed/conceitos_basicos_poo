public class Clientes {
    String nome;
    String email;
    String telefone;
    double produto1, produto2, produto3;

    double calcularCompras(){
        return (produto1 + produto2 + produto3);
    }

    void exibirInformacoes(){
        System.out.println("Nome do cliente: " + nome + ". Email do cliente: " + email + ". Telefone do cliente: " + telefone + ".");
        System.out.println("O valor total das compras de " + nome + " foi: " + calcularCompras());
    }
}
