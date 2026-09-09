public abstract class Colaborador
{
    private String matricula;
    private String nome;
    private String tipo;
    private double salarioBase;

    public abstract double calcularSalarioFinal();
    public abstract double calcularAdicionais();
    public abstract String getTipo();



    public Colaborador(String matricula, String nome, double salarioBase)
    {
       this.nome = setNome(nome);
       this.salarioBase = setSalarioBase(salarioBase);
       this.matricula = setMatricula(matricula);
    }

    public String setNome(String nome)
    {
        if(nome == null || nome.isEmpty())
        {
            System.out.println("Nome inválido");
            //chama de volta o método do menu de cadastrar usuario
        }
        return nome;
    }

    public double setSalarioBase(double salarioBase)
    {
        if (salarioBase <= 0)
        {
            System.out.println("Valor invalido, deve ser maior que zero!");
            //chama de volta o método do menu de cadastrar salário
        }
        return salarioBase;
    }

    public String setMatricula(String matricula)
    {
        if(nome == null || nome.isEmpty())
        {
            System.out.println("Nome inválido");
            //chama de volta o método do menu de cadastrar matricula
        }
        return nome;
    }




}
