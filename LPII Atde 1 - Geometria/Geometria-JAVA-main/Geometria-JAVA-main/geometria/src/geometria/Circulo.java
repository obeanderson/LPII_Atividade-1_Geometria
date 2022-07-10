package geometria;

public class Circulo{

	//Atributos
				private double pi;
				private double raio;
				
				//M�todos
				public void setPi(double pi) {
					if (pi > 0)
						{
						this.pi = pi;
						}
				}
				
				
				public void setRaio(double raio) {
					if (raio > 0)
						{
						this.raio = raio;
						}
				}
				
				public double calculaArea() {
					double area = pi * raio * raio;
					return area; 
				}
				
				public void desenhar() {
					for (int i = 0; i < raio; i++) {
						System.out.print(". ");
						
						for (int j = 0; j < pi; j++) {
							if (i == 0 || i + 1 >= raio) {
								System.out.print(". ");
							} else {
								System.out.print("  ");
							}
						}

					}
					
				}
	}