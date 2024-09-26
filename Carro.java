public class Carro {
    
    private String modelo;
    private String motor;
    private int qtdPortas;
    private String placa;
    private String cor;

    private boolean acelerando = false;

    public Carro(String modelo, String motor, String placa ) {
        this.modelo = modelo;
        this.motor = motor;
        this.placa = placa;
    }

    public Carro() {

    }

    public void acelerar() {
        acelerando = true;
        System.out.println("Acelerando com motor: " + motor);
    }

    public void parar() {
        this.ligarLuzFreio();
        this.desacelerar();
        System.out.println("O carro está parado.");
    }

    public void desacelerar() {
        if (acelerando == true) {
            System.out.println("Desacelerando...");
        }
        acelerando = false;
    }

    public void ligarLuzFreio() {
        System.out.println("Luzes de freio ligadas");
    }

    public void getInformacoes() {
        System.out.println("Informações sobre o veículo:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Motor: " + getMotor());
        System.out.println("Quantidade Portas: " + getQtdPortas());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Cor: " + getCor());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}