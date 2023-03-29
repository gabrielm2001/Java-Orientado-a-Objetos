public abstract class Funcionario{

    public Funcionario(String nome, Cargo cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    // <Atributos>
    private double salario;
    private String cpf;
    private String nome;
    protected Cargo cargo;
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
    public Cargo getCargo() {
        return cargo;
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
    // public void setCargo(Cargo cargo) {
    //     this.cargo = cargo;
    // }
    // <Setters/>


}

