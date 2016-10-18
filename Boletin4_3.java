
package boletin4_3;


public class Boletin4_3 {

    
    public static void main(String[] args) {
        Circulo circulo1= new Circulo();
        circulo1.setradio(28);
        double area=circulo1.calcularArea();
        double lonxitude=circulo1.calcularLOnxitude();
        circulo1.visualizar(area, lonxitude);
          
    }
    
}
