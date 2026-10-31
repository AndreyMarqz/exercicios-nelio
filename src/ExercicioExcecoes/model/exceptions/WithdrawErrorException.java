package ExercicioExcecoes.model.exceptions;

public class WithdrawErrorException extends RuntimeException {
    public WithdrawErrorException(String mensagem) {
        super(mensagem);
    }
}
