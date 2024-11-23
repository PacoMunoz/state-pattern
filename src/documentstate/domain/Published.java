package documentstate.domain;

public class Published implements State{

    public static final String NAME = "Publish";

    @Override
    public State push() {
        return this;
    }

    public String getName() {
        return this.NAME;
    }
}
