public class Gerente extends Funcionario implements Autenticavel{

    // <Herdando o construtor da SuperClass>
    public Gerente(String nome, Cargo cargo) {
        super(nome, cargo);
    }
    // <Herdando o construtor da SuperClass/>



    // <Atributos>
    private int senha;
    // <Atributos/>

    // <Métodos da SuperClass>
    @Override
    public double calculaBonificacao() {
        return (super.getSalario() + 300);
    }

    @Override
    public int calculaFerias() {
        return 40;
    }
    // <Métodos da SuperClass/>

    // <Getters>
    public int getSenha() {
        return senha;
    }
    // <Getters/>
    
    // <Setters>
    public void setSenha(int senha) {
        this.senha = senha;
    }
    // <Setters>


    // <Métodos do contrato "Autenticável">
    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
    // <Métodos do contrato "Autenticável">
}
