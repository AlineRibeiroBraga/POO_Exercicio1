public class ProfessorIC extends ProfessorOrientador {

    private final static int NUMERO_DE_AULAS = 4;
    private final static int NUMERO_DE_ALUNO_POR_TRABALHO_ORIENTADO = 1;

    public ProfessorIC(String nome, Double salarioBase, Double valorDaHoraAtividade, int trabalhosOrientados) {
        super(nome, salarioBase, valorDaHoraAtividade, trabalhosOrientados);
    }

    public Double calcularSalario(){
        return super.calcularSalario(NUMERO_DE_AULAS,NUMERO_DE_ALUNO_POR_TRABALHO_ORIENTADO);
    }
}
