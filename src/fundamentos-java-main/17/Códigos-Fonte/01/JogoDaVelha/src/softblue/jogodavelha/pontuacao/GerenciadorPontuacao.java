/**
 * Interface utilizada para gerenciar a pontua��o. Classes que implementam esta interface 
 * devem implementar a l�gica de como gravar e ler a pontua��o.
 */
public interface GerenciadorPontuacao {

	/**
	 * Obt�m a pontua��o de determinado jogador.
	 * @param nome Nome do jogador para procurar a pontua��o
	 * @return A pontua��o do jogador ou null caso a pontua��o n�o seja encontrada 
	 */
	public Integer getPontuacao(String nome);
	
	/**
	 * Incrementa em um a pontua��o do jogador.
	 * @param nome Nome do jogador para procurar a pontua��o
	 * @throws PontuacaoException Lan�ada caso ocorra algum problema ao gravar a pontua��o
	 */
	public void gravarPontuacao(String nome) throws PontuacaoException;
}
