import java.util.ArrayList;
class nombre{

  static ArrayList<String> Nombres = new ArrayList<String>();

  public static void main(String[] args) {
    String line = "John Tom Mary | 5";
    line = line.replace(" | ", "#");
    String separacion[] = line.split("#");
    String nombre[] = separacion[0].split(" ");
    Nombres.clear();
    llenar(nombre);
    borrar(Integer.parseInt(separacion[1])-1, Nombres.size());
    System.out.println(Nombres.get(0));
  }

  public static void borrar(int num, int tama){
    if (tama > 1 && num < tama){
      Nombres.remove(num);
      tama = tama-1;
      borrar(num, tama);
    }else if(tama >1){
      borrar(menor(num, tama), tama);
    }
  }

  public static int menor(int num, int tama){
    int n = 0;
    if (tama <= num) {
      n = menor(num-tama,tama);
    }
    return n;
  }

  public static void llenar(String []arg){
    for (int i = 0; i < arg.length; i++) {
      Nombres.add(arg[i]);
    }
  }
}
