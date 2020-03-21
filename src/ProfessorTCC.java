public class ProfessorTCC extends ProfessorOrientador {

    private final static int NUMERO_DE_AULAS = 3;
    private final static int NUMERO_DE_ALUNO_POR_TRABALHO_ORIENTADO = 2;

    public ProfessorTCC(String nome, Double salarioBase, Double valorDaHoraAtividade, int trabalhosOrientados) {
        super(nome, salarioBase, valorDaHoraAtividade, trabalhosOrientados);
    }

    public Double calcularSalario(){
        return super.calcularSalario(NUMERO_DE_AULAS,NUMERO_DE_ALUNO_POR_TRABALHO_ORIENTADO);
    }
}
