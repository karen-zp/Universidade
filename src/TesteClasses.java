public class TesteClasses {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        universidade.nome = "UNICENTRO";
        universidade.cidade = "Guarapuava";
        universidade.estado = "PR";
        universidade.exibeDados();

        Aluno aluno = new Aluno();
        aluno.nome = "Karen";
        aluno.curso = "Matemática aplicada e computacional";
        aluno.exibeDados();
    }
}
