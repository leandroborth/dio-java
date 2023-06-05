public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
        System.out.println("A TV está ligada.");
    }
    public void desligar(){
        ligada = false;
        System.out.println("A TV está desligada.");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando canal para: " + canal);
    }
}
