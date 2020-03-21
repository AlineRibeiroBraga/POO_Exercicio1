public class ProfessorMensalistas extends Professor {

    private Double salarioBase;
    private Double valorDaHoraAtividade;

    public ProfessorMensalistas(String nome, Double salarioBase, Double valorDaHoraAtividade) {
        super(nome);
        this.salarioBase = salarioBase;
        this.valorDaHoraAtividade = valorDaHoraAtividade;
    }

    public double getValorDaHoraAtividade(){
        return valorDaHoraAtividade;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setValorDaHoraAtividade(Double valorDaHoraAtividade) {
        this.valorDaHoraAtividade = valorDaHoraAtividade;
    }

    public Double calcularSalario(){
        return salarioBase + valorDaHoraAtividade;
    }
}
