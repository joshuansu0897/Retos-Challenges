//esta madre me da los primeros N numeros primeros

class Primor{
	public static void main (String[] args) {
		String line = "12";
        int contador = 0;
        int cantidad = 2;
        int suma = 0;
        //String concatena = "";
        while (contador <= Integer.parseInt(line)) {
            if (esprimo(cantidad) && cantidad !=4) {
            	//concatena += cantidad+",";
            	System.out.println(cantidad);
            	suma += cantidad;
                contador++;
            }
            cantidad++;
        }
        //System.out.println(concatena);
        System.out.println("la suma de todo es: "+suma);
    }

	static boolean esprimo(int n) {
    	boolean primo = true;
    	for (int i = 2; i < ((n - 1)/2)+1; i++) {
        	if (n % i == 0) {
            	primo = false;
            	break;
        	}
    	}
        return primo;
    }
}