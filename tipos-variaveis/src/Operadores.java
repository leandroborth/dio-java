public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        System.out.printf(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.printf(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.printf(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.printf(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.printf(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.printf(concatenacao);
    }
}
