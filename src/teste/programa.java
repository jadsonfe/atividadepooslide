/*package teste;

import java.util.Scanner;

public class programa {

	public static void main(String args[]) {  
		
		
		/*
		System.out.println("Aperte 1 para fazer seu IMC, 2 para calcular o seu metabolismo ou 3 para sair");
		
		int escolha;
		Scanner sc0 = new Scanner(System.in);
		escolha = sc0.nextInt();
		switch(escolha) {
		case 1:
			String nome;
			Scanner sc = new Scanner(System.in);
		      System.out.println("Digite seu nome:");     
		      nome = sc.next();
		      //System.out.println("seu nome eh:"+nome);
		      
		    Float peso;
		    Scanner sc2 = new Scanner(System.in);
		    System.out.println("Digite seu peso:");     
		      peso = sc.nextFloat();
		      //System.out.println("seu nome eh:"+peso);
		      
		      Float altura;
			    Scanner sc3 = new Scanner(System.in);
			    System.out.println("Digite seu altura:");     
			      altura = sc.nextFloat();
			      //System.out.println("seu nome eh:"+altura);
			     
			   Float IMC;
			    IMC = peso / (altura*altura);
			    if(IMC < 19) {
			    	System.out.println("ola "+nome+" voce esta "+" Abaixo do peso");
			    }
			    if(IMC >= 19 && IMC < 25) {
			    	System.out.println("ola "+nome+" voce esta "+" com peso normal");
			    }
			    if(IMC >= 25 && IMC < 30) {
			    	System.out.println("ola "+nome+" voce esta "+"com sobrepeso");
			    }
			    if(IMC >= 30 && IMC < 40) {
			    	System.out.println("ola "+nome+" voce esta "+" com obesidade tipo 1");
			    }
			    if(IMC >= 40) {
			    	System.out.println("ola "+nome+" voce esta "+" com obesidade Morbida");
			    }
			break;
			
		case 2:
			int genero;
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Se mulher digite 1, se homem digite 2 ");
			genero = sc5.nextInt();
			
			int idade;
			 Scanner sc4 = new Scanner(System.in);
			 System.out.println("Digite sua idade:");     
			  idade = sc4.nextInt();
			  
			  float peso2;
			    Scanner sc6 = new Scanner(System.in);
			    System.out.println("Digite seu peso:");     
			      peso2 = sc6.nextFloat();
			      
			   float meta;
			      
			  if(genero == 1) {
				  if(idade  > 17 && idade < 30) {
					meta = 14.7f*peso2+486.6f; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");
				  }
				  if(idade > 29 && idade < 60) {
					meta = 8.7f*peso2+829; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				  }
				  if(idade > 60) {
					meta = 10.5f*peso2+596; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				  }
				  
			  }
			  if(genero == 2) {
				  if(idade  > 17 && idade < 30) {
						meta = 15.057f*peso2+679; 
						System.out.println("Seu metabolismo esta em "+meta+"Kcal");
					  }
					  if(idade > 29 && idade < 60) {
						meta = 11.6f*peso2+879; 
						System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
					  }
					  if(idade > 60) {
						meta = 13.5f*peso2+487; 
						System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
					  }
			  }
			break;
			
		case 3:
			break;
		}
		System.out.println("saiu");
		*/
		/*String nome;
		Scanner sc = new Scanner(System.in);
	      System.out.println("Digite seu nome:");     
	      nome = sc.next();
	      //System.out.println("seu nome eh:"+nome);
	      
	    Float peso;
	    Scanner sc2 = new Scanner(System.in);
	    System.out.println("Digite seu peso:");     
	      peso = sc.nextFloat();
	      //System.out.println("seu nome eh:"+peso);
	      
	      Float altura;
		    Scanner sc3 = new Scanner(System.in);
		    System.out.println("Digite seu altura:");     
		      altura = sc.nextFloat();
		      //System.out.println("seu nome eh:"+altura);
		     
		   int idade;
			 Scanner sc4 = new Scanner(System.in);
			 System.out.println("Digite sua idade:");     
			  idade = sc.nextInt();
			  //System.out.println("seu nome eh:"+idade);
			  
	   
		   Float IMC;
		    IMC = peso / (altura*altura);
		    if(IMC < 19) {
		    	System.out.println("ola "+nome+" voce esta "+" Abaixo do peso");
		    }
		    if(IMC >= 19 && IMC < 25) {
		    	System.out.println("ola "+nome+" voce esta "+" com peso normal");
		    }
		    if(IMC >= 25 && IMC < 30) {
		    	System.out.println("ola "+nome+" voce esta "+"com sobrepeso");
		    }
		    if(IMC >= 30 && IMC < 40) {
		    	System.out.println("ola "+nome+" voce esta "+" com obesidade tipo 1");
		    }
		    if(IMC >= 40) {
		    	System.out.println("ola "+nome+" voce esta "+" com obesidade Morbida");
		    }*/
		    
	   }  
	

	
	
	
}
 
*/
package teste;

import java.util.Scanner;

public class programa {

	public static void main(String args[]) {  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Aperte 1 para fazer seu IMC, 2 para calcular o seu metabolismo ou 3 para sair");
		
		int escolha = sc.nextInt();
		switch(escolha) {
		case 1:
		      System.out.println("Digite seu nome:");     
		      String nome = sc.next();
		      
		      System.out.println("Digite seu peso:");     
		      Float peso = sc.nextFloat();
		      
		      System.out.println("Digite seu altura:");     
		      Float altura = sc.nextFloat();
			     
			   Float IMC = peso / (altura*altura);
			    if(IMC < 19) {
			    	System.out.println("ola "+nome+" voce esta "+" Abaixo do peso");
			    }
			    if(IMC >= 19 && IMC < 25) {
			    	System.out.println("ola "+nome+" voce esta "+" com peso normal");
			    }
			    if(IMC >= 25 && IMC < 30) {
			    	System.out.println("ola "+nome+" voce esta "+"com sobrepeso");
			    }
			    if(IMC >= 30 && IMC < 40) {
			    	System.out.println("ola "+nome+" voce esta "+" com obesidade tipo 1");
			    }
			    if(IMC >= 40) {
			    	System.out.println("ola "+nome+" voce esta "+" com obesidade Morbida");
			    }
			break;
			
		case 2:
			System.out.println("Se mulher digite 1, se homem digite 2 ");
			int genero = sc.nextInt();
			
			System.out.println("Digite sua idade:");     
			int idade = sc.nextInt();
			  
			System.out.println("Digite seu peso:");     
			float peso2 = sc.nextFloat();
			      
			float meta;
			      
			if(genero == 1) {
				if(idade  > 17 && idade < 30) {
					meta = 14.7f*peso2+486.6f; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");
				}
				if(idade > 29 && idade < 60) {
					meta = 8.7f*peso2+829; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				}
				if(idade > 60) {
					meta = 10.5f*peso2+596; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				}
				  
			}
			if(genero == 2) {
				if(idade  > 17 && idade < 30) {
					meta = 15.057f*peso2+679; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");
				}
				if(idade > 29 && idade < 60) {
					meta = 11.6f*peso2+879; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				}
				if(idade > 60) {
					meta = 13.5f*peso2+487; 
					System.out.println("Seu metabolismo esta em "+meta+"Kcal");  
				}
			}
			break;
			
		case 3:
			break;
		}
		System.out.println("saiu");
		sc.close();
	}
}

	