public class ColaboradorComissionado extends Colaborador
{

    public ColaboradorComissionado(String matricula, String nome, double salarioBase) {
        super(matricula, nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return 0;
    }

    @Override
    public double calcularAdicionais() {
        return 0;
    }

    @Override
    public String getTipo() {
        return null;
    }
}
