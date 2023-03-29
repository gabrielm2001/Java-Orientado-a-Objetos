public abstract class Funcionario{

    // <Atributos>
    private double salario;
    private String cpf;
    private String nome;
    // <Atributos/>

    // <Métodos>
    public abstract double calculaBonificacao();
    public abstract int calculaFerias();
    // <Métodos>

    // <Getters>
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    // <Getters/>


    // <Setters>
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // <Setters/>


}

