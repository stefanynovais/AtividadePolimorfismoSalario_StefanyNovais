public abstract class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato quqe será implementado pelas classes filhas
    public abstract double calcularSalarioFinal();
}