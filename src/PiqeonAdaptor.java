public class PiqeonAdaptor implements Quackable{
    private Pigeon pigeon;

    public PiqeonAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
