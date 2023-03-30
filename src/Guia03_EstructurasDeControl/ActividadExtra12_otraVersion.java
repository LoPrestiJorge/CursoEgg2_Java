
package Guia03_EstructurasDeControl;

public class ActividadExtra12_otraVersion{
    
public static void main(String[] args) {
        for(int i = 0; i <= 9; i++) {
            for(int j = 0; j <= 9; j++) {
                for(int k = 0; k <= 9; k++) {
                    String numero = i + "-" + j + "-" + k;
                    if(Integer.toString(i).equals("3") || Integer.toString(j).equals("3") || Integer.toString(k).equals("3")) {
                        numero = numero.replace("3", "E");
                    }
                    System.out.println(numero);
                }
            }
        }
    }
}
