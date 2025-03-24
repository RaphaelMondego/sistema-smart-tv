public class Usuario {
    public static void main(String[] args) throws Exception {

        //Nossa classe (SmartTv)
        SmartTv smartTv = new SmartTv(); // criando uma nova smartTv, ou seja, uma nova classe para ilustrar a iteração dos metodos e atributos

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status TV ligada? " + smartTv.ligada);
    }
}
