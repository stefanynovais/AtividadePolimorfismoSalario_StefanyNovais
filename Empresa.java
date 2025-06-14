public class Empresa {
    public static void main(String[] args) {
        Funcionario v = new Vendedor(2000, 500); // Vendedor com salário base de 2000 e comissão de 500
        Funcionario f = new FreeLancer(20, 150); // Freelancer com 20 dias trabalhando a 150 cada
        Funcionario g = new Gerente(2000, 1000); // Gerente com salário base mais bônus fixo de 1000

        System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(v)); // Chama Vendedor
        System.out.println("Salário do FreeLancer: " + obterSalarioDoFuncionario(f)); // Chama Freelancer
        System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(g)); // Chama Gerente
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal(); // Polimorfismo em ação
    }
}
