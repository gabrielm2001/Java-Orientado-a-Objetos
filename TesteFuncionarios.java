public class TesteFuncionarios {
    
    public static void main(String[] args) {

        // <Teste do Editor>
        EditorVideo Ed = new EditorVideo("boudica", new Cargo());
        Ed.setSalario(5000);
        System.out.println(Ed.calculaBonificacao());

        Ed.cargo.setPosicao("Editor");

        System.out.println(Ed.cargo.getPosicao());
        // <Teste do Editor/>

        // <Teste do Gerente>
        Gerente G = new Gerente("Boudica", new Cargo());
        G.setSenha(444);
        G.setSalario(6400);
        System.out.println(G.calculaBonificacao());

        System.out.println(G.autentica(444));

        // <Teste do Gerente>


        // <Teste do SistemaInterno>
        SistemaInterno SI = new SistemaInterno();

        SI.autenticacao(G.getSenha());
        // <Teste do SistemaInterno/>
    }

}
