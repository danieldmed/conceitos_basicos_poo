public class Hospede {
    String nome;
    Integer dias;
    Integer quarto;

    Integer calcularDias(){
        return (dias * quarto);
    }

    void exibirInformacoes() {
        System.out.println("Nome do hospede: " + nome + ".");
        System.out.println("Quantidade de dias hospedado: " + dias + " dias.");
        System.out.println("Valor total a ser pago: R$" + calcularDias() + ".");
    }
}