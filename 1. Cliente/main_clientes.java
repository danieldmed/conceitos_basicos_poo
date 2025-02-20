public class main_clientes {
    public static void main (String[] args) {
        
        Clientes cliente1 = new Clientes();
        cliente1.nome = "Daniel";
        cliente1.email = "duartedaniel.contato@gmail.com";
        cliente1.telefone = "11 1234-5678";

        cliente1.produto1 = 13.90;
        cliente1.produto2 = 4.75;
        cliente1.produto3 = 9.99;

        cliente1.exibirInformacoes();
    }
}