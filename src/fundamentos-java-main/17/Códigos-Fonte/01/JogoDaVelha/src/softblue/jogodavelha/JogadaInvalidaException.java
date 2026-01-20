/**
 * Exce��o que representa uma jogada inv�lida realizada pelo jogador
 */
public class JogadaInvalidaException extends JogoDaVelhaException {

	/**
	 * @see JogoDaVelhaException#JogoDaVelhaException(String)
	 */
	public JogadaInvalidaException(String message) {
		super(message);
	}
}
