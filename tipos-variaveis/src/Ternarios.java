public class Ternarios {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        String resultado2 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado2);
        int resultado3 = a==b ? 1 : 2;
        System.out.println(resultado3);

    }
}
