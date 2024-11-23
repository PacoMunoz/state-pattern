package documentstate.domain;

public class Moderation implements State{

    public static final String NAME = "Moderation";

    @Override
    public State push() {
        return new Published();
    }

    public String getName() {
        return this.NAME;
    }
}
