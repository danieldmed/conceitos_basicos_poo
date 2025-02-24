public class Retangulo{
    Integer base;
    Integer altura;

    Double Calcularbase(){
        return (2 * altura)/base;
    }
    Double CalcularAltura(){
        return (base * altura)/2;
    }
    void exibirInformacoes(){
        System.out.println("a base do triangulo é: " + base);
        System.out.println("a base do triangulo é: " + altura);
        System.out.print("O valor do Perimetro é " + CalcularAltura());
        System.out.print("O valor da area é " + Calcularbase());

    }

}
