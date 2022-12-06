public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanals() {
        canal--;
    }

    public void alterarCanal(int canalSelecionado) {
        canal = canalSelecionado;
    }

}