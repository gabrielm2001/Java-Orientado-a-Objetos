public interface Autenticavel {
    // Classe criada para forçar os que o implementam a assinar o "Contrato" e serem autentcados

    public abstract boolean autentica(int senha);
}
