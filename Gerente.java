public class Gerente extends Funcionario{
    private double salarioBase;
    private double bonusFixo;

    public Gerente(double salarioBase, double bonusFixo) {
        this.salarioBase = salarioBase;
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonusFixo;
    }
}
