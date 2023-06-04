public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = -numero; // virou negativo
        System.out.println(numero);

        numero = numero * -1; // voltou a ser positovo
        System.out.println(numero);

        System.out.println(++ numero);
        System.out.println(numero);
        System.out.println(--numero);

        // repetição

        numero = 10;

        System.out.println(++ numero); // somar 1
        System.out.println(-- numero); // subtrair 1

        boolean variavel = true;
        System.out.println(!variavel); // passou a ser false
        variavel = !variavel; // passou a ser false
        System.out.println(variavel);
    }
}
