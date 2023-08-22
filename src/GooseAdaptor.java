public class GooseAdaptor implements Quackable{
    private Goose goose;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}
