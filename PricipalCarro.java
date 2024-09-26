public class PricipalCarro {
    
    public static void main (String args[]) {

        Carro obj = new Carro();

        obj.setModelo("Gran Vitara");
        obj.setMotor("2.0");
        obj.setQtdPortas(4);
        obj.setPlaca("JIU-3520");
        obj.setCor("Preto");

        System.out.println("Informações sobre o veículo:");
        System.out.println("Modelo: " + obj.getModelo());
        System.out.println("Motor: " + obj.getMotor());
        System.out.println("Quantidade Portas: " + obj.getQtdPortas());
        System.out.println("Placa: " + obj.getPlaca());
        System.out.println("Cor: " + obj.getCor());

        obj.acelerar();
        obj.parar();


    }
}