public class Guitar implements WoodenObject, MusicalInstrument {

    @Override
    public void play() {
        System.out.println("Playing guitar");
    }

    @Override
    public void burn() {
        System.out.println("Burning guitar");
    }
}
