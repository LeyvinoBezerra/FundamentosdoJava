

/*
 * Representa uma figura complexa, isto �, � composta por outras figuras.
 * Repare que a pr�pria figura complexa � tamb�m uma figura.
 * Al�m de ela SER uma figura (heran�a), ela TEM figuras (composi��o)
 */
public class FiguraComplexa extends Figura {

	/* Figuras que comp�em a figura complexa */
	private Figura[] figuras;
	
	/* Construtor que recebe o array de figuras */
	public FiguraComplexa(Figura[] figuras) {
		this.figuras = figuras;
	}
	
	/* M�todo sobrescrito para calcular a �rea total da figura.
	 * A �rea total � a soma das �reas de todas as figuras.
	 */
	public double calcularArea() {
		double areaTotal = 0.0;
		
		for (int i = 0; i < figuras.length; i++) {
			areaTotal += figuras[i].calcularArea();
		}
		
		return areaTotal;
	}
}
