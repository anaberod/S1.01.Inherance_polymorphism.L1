//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PercussionInstrument p1 = new PercussionInstrument("Drums", 435);
        PercussionInstrument p2 = new PercussionInstrument("Castañuelas", 8.5);

        StringInstrument s1 = new StringInstrument("Guitar", 444.95);
        StringInstrument s2 = new StringInstrument("Harp", 110);

        WindInstrument w1 = new WindInstrument("Flute", 8.99);
        WindInstrument w2 = new WindInstrument("Trumpet", 20.50);

        p1.playInstrument();
        p2.playInstrument();
        s1.playInstrument();
        s2.playInstrument();
        w1.playInstrument();
        w2.playInstrument();

        }
    }
