package geometria;

public class Triangulo{

	//Atributos
				private double base;
				private double altura;
				
				
				
				//Métodos
				public void setAltura(double altura) {
					if (altura > 0)
						{
						this.altura = altura;
						}
						}
				//Métodos
				public void setBase(double base) {
					if (base > 0)
						{
						this.base = base;
						}
				}
				
				public double calculaArea() {
					double area = base * altura / 2 ;
					return area; 
				}
				
	public void desenhar() {
					
					//int numeroLinhas = 10;
					for(double i=1 ; i<=altura; i++){
								
								for(double j= 1; j<=i; j++){

									System.out.print("*");
								}
						                System.out.println("");                    
							}
					for(double i= altura; i>=1; i--){
						
						for(double j= i; j>=1; j--){

							System.out.print("*");
						}
				                System.out.println("");                    
					}
			
	}
			
	}