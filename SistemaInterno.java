public class SistemaInterno {

    private int senha = 444;  
    
    public boolean autenticacao(int senha){
        return this.senha == senha;
    }

}
