package view;

import controller.SerieController;

public class Principal {
	
	public static void main(String[] args) {
		SerieController sc = new SerieController();
		
		int n = 7;
		
		System.out.println(sc.somatoria(n));
	}
}