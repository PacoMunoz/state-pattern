package documentstate.domain;

public class Draft implements State {

    public static final String NAME = "Draft";

    @Override
    public State push() {
        return new Moderation();
    }

    public String getName() {
        return this.NAME;
    }

}
