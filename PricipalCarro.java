public class PricipalCarro {
    
    public static void main (String args[]) {

        Carro obj = new Carro();

        obj.setModelo("Gran Vitara");
        obj.setMotor("2.0");
        obj.setQtdPortas(4);
        obj.setPlaca("JIU-3520");
        obj.setCor("Preto");

        obj.getInformacoes();
        obj.acelerar();
        obj.parar();


    }
}