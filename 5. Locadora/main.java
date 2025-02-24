public class main {
    public static void main(String[] args) {
        
        Locadora locacao1 = new Locadora();
        locacao1.modelo = "Renegade";
        locacao1.valor = 115.70;
        locacao1.dias = 5;

        locacao1.exibirInformacoes();
    }
}