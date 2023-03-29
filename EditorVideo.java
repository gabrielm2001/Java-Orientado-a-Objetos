public class EditorVideo extends Funcionario{

    // <Herdando o construtor da SuperClass>
    public EditorVideo(String nome, Cargo cargo){
        super(nome, cargo);
    }
    // <Herdando o construtor da SuperClass>

    // <Métodos da SuperClass>
    @Override
    public double calculaBonificacao(){
        return super.getSalario() * 0.1;
    };

    @Override
    public int calculaFerias(){
        return 35;
    };
    // <Métodos da SuperClass/>

}