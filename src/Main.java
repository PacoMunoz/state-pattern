import documentstate.domain.Document;
import documentstate.domain.Draft;
import documentstate.domain.User;

public class Main {
    public static void main(String[] args) throws Exception {

        final var user = new User("Paco", "ADMIN");

        final var document = new Document("test.txt", user);
        document.printState();
        document.changeState(user);
        document.printState();
        document.changeState(user);
        document.printState();
        document.changeState(user);
        document.printState();
    }


}