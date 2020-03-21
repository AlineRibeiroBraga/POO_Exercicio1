public class ProfessorHorista extends Professor{

    private final double SEMANAS_TRABALHADAS = 4.25;

    private int quantidadeDeAulas;
    private double valorDaAula;
    private Double valorDaHoraAtividade;

    public ProfessorHorista(String nome, int quantidadeDeAulas, double valorDaAula, Double valorDaHoraAtividade) {
        super(nome);
        this.quantidadeDeAulas = quantidadeDeAulas;
        this.valorDaAula = valorDaAula;
        this.valorDaHoraAtividade = valorDaHoraAtividade;
    }

    public Double calcularSalario(){
        return quantidadeDeAulas * valorDaAula * SEMANAS_TRABALHADAS + valorDaHoraAtividade;
    }
}
