public class StringInstrument extends Instrument{

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void playInstrument() {
        System.out.println("A string instrument is being played");
    }


}
