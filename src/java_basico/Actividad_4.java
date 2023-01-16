package java_basico;

public class Actividad_4 {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("Xiaomi","Redmi note 10S", "platateado", 5000, 6.7,"Android",6,128);
        System.out.println(celular);
        SmartWatch reloj = new SmartWatch("Samsung","Galaxy Watch", "Negro", 600, 2.1, true, 4);
        System.out.println(reloj);
    }
}
abstract class SmartDevice{
    String marca;
    String modelo;
    String color;
    int bateria;
    double display;
    public SmartDevice(){
    }
    public SmartDevice(String marca, String modelo ,String color, int bateria, double display ){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.bateria = bateria;
        this.display = display;
    }

}
class SmartPhone extends SmartDevice{
    String sistema= "";
    int memoriaRam= 0;
    int memoriaRom= 0;

    public SmartPhone(){
        super();
    }
    public SmartPhone(String marca, String modelo ,String color, int bateria, double display, String sistema, int memoriaRam, int memoriaRom){
        super(marca, modelo, color, bateria, display);
        this.sistema = sistema;
        this.memoriaRam = memoriaRam;
        this.memoriaRom = memoriaRom;
    }

    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", pulgadas=" + display +
                ", bateria=" + bateria+ "mA"+
                ", sistema operativo=" + sistema +
                ", almacenamiento=" +memoriaRom + "gb"+
                ", ram=" + memoriaRam + "gb";
    }
}

class SmartWatch extends SmartDevice{

    boolean gps ;
    int sensores=0;

    public SmartWatch(){
        super();
    }
    public SmartWatch(String marca, String modelo ,String color, int bateria, double display, boolean gps, int sensores){
        super(marca, modelo, color, bateria, display);
        this.gps = gps;
        this.sensores=sensores;
    }

    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", color=" + color +
                ", pulgadas=" + display +
                ", conectividad gps=" + gps +
                ", bateria=" + bateria+ "mA"+
                ", numero de sensores= " + sensores;
    }
}