public class Professor{

    private static int CODIGO = 1;

    private String nome;
    private int codigo;

    public Professor(String nome) {
        this.nome = nome;
        codigo = CODIGO++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
