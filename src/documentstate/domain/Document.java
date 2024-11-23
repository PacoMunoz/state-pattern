package documentstate.domain;

public class Document {
    private State state;
    private final String name;
    private String lastPushUser;

    public Document(String name, User user) {
        this.name = name;
        this.state = new Draft();
        this.lastPushUser = user.getName();
    }

    public void changeState(User user) {
        this.state = state.push();
        this.lastPushUser = user.getName();
    }

    public void printState() {
        System.out.println("Estado : " + this.state.getName());
        System.out.println("Publicado por : " + this.lastPushUser);
    }

    public String getName() {
        return this.name;
    }

}
