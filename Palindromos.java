public class Palindromos{
	public static void main(String[] args){
		String palabra = "";
		int cantLetras;
		int cantidadPalabras = args.length;
		for(int i = 0; i<args.length;i++){
			cantLetras = args[i].length();
			for(int j=cantLetras;j>0;j--){
				palabra = palabra + args[i].substring(j-1,j);
			}
			if(palabra.equals(args[i])){
				System.out.println("Si es palindromo: " + palabra);
				palabra = "";
			}else{
				System.out.println("No es palindromo: " + args[i]);
				palabra = "";
			}
		}
	}
}