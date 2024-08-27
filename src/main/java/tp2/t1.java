package tp2;

public class t1 {
    private int a;
    private int b;

    public int t1(int a, int b) {
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        System.out.println("Donner les perimetres d'un rectangle :");
        t1 t1 = new t1();
        t1.setA(12);
        t1.setB(12);
        System.out.println(t1.t1(t1.getA(),t1.getB()));

    }
}
