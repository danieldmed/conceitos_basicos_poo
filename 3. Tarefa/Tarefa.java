public class Tarefa {
    String tarefa;
    String descricao;
    String prazo;
    Boolean conclusao;
    
    void cadastrarTarefaFinalizada() {
        conclusao = true;
    }
    void cadastrarTarefaNaoFinalizada() {
        conclusao = false;
    }
    void exibirInformacoes() {
        System.out.println("Nome da tarefa: " + tarefa);
        System.out.println("Descrição da tarefa: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Status: " + conclusao);
    }
}