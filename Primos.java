public class Primos{  
	public static void main(String[] args) {  
		int a=0,numero;  
		numero = Integer.parseInt(args[0].toString());  
		String cadena = "";
		for(int z = 0;z<=numero;z++){	
			for(int i=1;i<=z;i++){  
				if(z%i==0){  
					a++;  
				}
			}  
			if(a==2){  
				cadena = cadena + z + " ";
				a = 0;
			}else{
				a = 0;
			}
		}
		System.out.println(cadena);
	}  
}  