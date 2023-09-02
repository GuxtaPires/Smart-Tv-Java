public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new  SmartTv();

        System.out.println("tv Ligada: " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.proximoCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.canalAnterior();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.escolherCanal (13);
        System.out.println("Canal: " + smartTv.canal);
    }
}
