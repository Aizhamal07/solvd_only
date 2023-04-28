package practicalWithAndrei.homework2;

public class VisualSignals implements MilitaryCommunication {

    private String message;

    @Override
    public void send(String message) {
        this.message=message;

    }
    @Override
    public String receive() {
        System.out.println("Receiving message using visual signals");
        return message;
    }
}
