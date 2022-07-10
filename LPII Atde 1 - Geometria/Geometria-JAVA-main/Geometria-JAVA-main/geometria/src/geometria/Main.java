package geometria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teste da classe Quadrado
				Quadrado primeiroQuadrado = new Quadrado();
				primeiroQuadrado.setLado(6);
				
				double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
				System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
				
				System.out.println("Desenho quadrado: ");
				primeiroQuadrado.desenhar();
				
		//Teste da classe Retangulo
				
		        Retangulo primeiroRetangulo = new Retangulo();
		        primeiroRetangulo.setAltura(6);
		        primeiroRetangulo.setLado(12);

		        double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
		        System.out.println("Area Retangulo: "+ areaPrimeiroRetangulo);
		        //desenha retangulo
		        System.out.println("\nDesenho Retangulo: ");
		        primeiroRetangulo.desenhar();
		        
		     // Teste da classe do Triangulo
		        
				Triangulo primeiroTriangulo = new Triangulo();
				primeiroTriangulo.setAltura(5);
				primeiroTriangulo.setBase(8);
				
				
				double areaPrimeiroTriangulo = primeiroTriangulo.calculaArea();
				System.out.println("Area Triangulo: " + areaPrimeiroTriangulo);
				
				System.out.println("Desenho Triangulo: ");
				primeiroTriangulo.desenhar();
				
				
				// Teste da classe do Círculo
				
				Circulo primeiroCirculo = new Circulo();
				primeiroCirculo.setPi (3.14);
				primeiroCirculo.setRaio(2);
						
				double areaPrimeiroCirculo = primeiroCirculo.calculaArea();
				System.out.println("Area Círculo: " + areaPrimeiroCirculo);
						
				System.out.println("Desenho Círculo: ");
				primeiroCirculo.desenhar();
	 
	}

}