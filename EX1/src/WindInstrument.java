public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void playInstrument() {
        System.out.println("A wind instrument is being played");
    }


}
