
package boletin4_3;


public class Circulo {
    //atributos
    private double radio;
    private static double pi=3.14;
    //constructores
    public Circulo(double R){
        radio=R;
        
    }
    public Circulo(){
        radio=0;
       
    }
    //métodos de acceso
    public void setradio(double R){
        radio=R;
    }
    public double getradio (){
        return radio;
    }
    public double calcularArea (){
        double auxiliar=Math.pow(radio, 2);
        return pi*auxiliar;
       
    }
    public double calcularLOnxitude(){
        return 2*pi*radio;
    }
    public void visualizar(double area, double lonxitude){
        System.out.println("Area = " + area + "Perímetro = " + lonxitude);
    }
}
