package documentstate.domain;

public interface State {
    State push();
    String getName();
}
