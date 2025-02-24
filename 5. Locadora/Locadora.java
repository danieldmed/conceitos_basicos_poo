public class Locadora {
    
    String modelo;
    Double valor;
    Integer dias;

    Double calcularLocacao(){
        return (valor * dias);
    }

    void exibirInformacoes() {
        System.out.println("O valor total da locação do carro " + modelo + ", alugado durante " + dias + " dias, é de: R$ " + calcularLocacao());
    }
}