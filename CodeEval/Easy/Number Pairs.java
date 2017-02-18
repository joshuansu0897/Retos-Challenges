

class pares{

  public static void main(String[] args) {
    String line = "2,4,5,6,9,11,15;20";
    String separacion[] = line.split(";");
    String listaNumStr[] = separacion[0].split(",");

    int listaNumInt[] = la_conve(listaNumStr);

    String imprimirEsto = checar(listaNumInt, Integer.parseInt(separacion[1]));

    if (!imprimirEsto.equals("")) {
      System.out.println(imprimirEsto.substring(0, imprimirEsto.length()-1));
    }else{
      System.out.println("NULL");
    }
  }

  public static int[] la_conve(String lista[]){
    int listaN[] = new int [lista.length];
    for (int i = 0; i < lista.length ; i++) {
      listaN[i] = Integer.parseInt(lista[i]);
    }

    return listaN;
  }

  public static String checar (int lista[], int num){
    String acumu = "";
    for (int i=0; i < lista.length; i++) {
      for (int j=i; j < lista.length; j++ ) {
        if ( lista[j] + lista[i] == num) {
          acumu += lista[i]+","+lista[j]+";";
        }
      }
    }
    return acumu;
  }
}
