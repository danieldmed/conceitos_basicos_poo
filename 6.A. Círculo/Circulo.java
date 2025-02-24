public class Circulo{
    Integer raio;

    Double CalcularPerimetro(){
        return 2 * Math.PI * raio;
    }
    Double CalcularArea(){
        return Math.PI*Math.pow(raio,2);
    }
    void exibirInformacoes(){
        System.out.println("o raio do circulo é: " + raio);
        System.out.print("O valor do Perimetro é " + CalcularPerimetro());
        System.out.print("O valor da area é " + CalcularArea());

    }

}


