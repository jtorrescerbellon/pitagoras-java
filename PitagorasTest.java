public class PitagorasTest{
    public static void main(String[] args){
        Pitagoras c = new Pitagoras();

        int a = 5;
        int b = 4;
        double hipotenusa = c.calcularHipotenusa(a, b);
        System.out.println(hipotenusa);
    }
}