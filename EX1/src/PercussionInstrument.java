public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void playInstrument() {
        System.out.println ("A percussion instrument is being played");
    }


}
