public class Pitagoras{
    public double calcularHipotenusa(int catetoA, int catetoB){
        double squareRoot = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        return squareRoot;
    }
}