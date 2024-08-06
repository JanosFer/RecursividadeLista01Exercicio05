package controller;

public class SerieController {

	public SerieController() {
		super();
	}
	
	public double somatoria(int n) {
		//Condição de Parada: Se n chega 1, a recursiva é encerrada.
		if(n == 1) {
			return 1;
		}else {
			
			//Chamada dos Passos: Retorna-se 1 dividido pelo valor de n atual e soma com função recursiva enviando n decrementado em 1 como parametro.
			
			return (double) 1/n + somatoria(n-1);
		}
	}
}
