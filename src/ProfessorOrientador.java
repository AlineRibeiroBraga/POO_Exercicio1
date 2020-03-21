public class ProfessorOrientador extends ProfessorMensalistas {

    private int trabalhosOrientados;

    public ProfessorOrientador(String nome, Double salarioBase, Double valorDaHoraAtividade,int trabalhosOrientados) {
        super(nome, salarioBase, valorDaHoraAtividade);
        this.trabalhosOrientados = trabalhosOrientados;
    }

    public int getTrabalhosOrientados() {
        return trabalhosOrientados;
    }

    public void setTrabalhosOrientados(int trabalhosOrientados) {
        this.trabalhosOrientados = trabalhosOrientados;
    }

    public Double calcularSalario(int numeroDeAulas, int valorPorTrabalhoOrientado){
        return super.calcularSalario() + numeroDeAulas * getValorDaHoraAtividade() * trabalhosOrientados/valorPorTrabalhoOrientado;
    }
}
