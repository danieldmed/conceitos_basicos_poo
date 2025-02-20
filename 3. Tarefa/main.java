public class main {
    public static void main (String[]args) {

        Tarefa tarefa1 = new Tarefa();
        tarefa1.tarefa = "Revisão";
        tarefa1.descricao = "Revisar todas as linhas de código em Java.";
        tarefa1.prazo = "10 dias";

        tarefa1.cadastrarTarefaNaoFinalizada();
        tarefa1.cadastrarTarefaFinalizada();
        tarefa1.exibirInformacoes();
    }
}
