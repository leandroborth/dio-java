public class Relacionais {
    public static void main(String[] args) {
        String nomeUm = "Leandro";
        String nomeDois = "Leandro";
        System.out.println(nomeUm == nomeDois);

        nomeDois = new String ("Leandro");
        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois)); // compara conteúdo de objetos
    }
}
