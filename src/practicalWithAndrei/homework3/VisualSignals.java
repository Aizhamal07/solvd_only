package practicalWithAndrei.homework3;

public class VisualSignals implements MilitaryCommunication{
    private final String message;

    public VisualSignals(String message){
        this.message=message;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message "+message+" using visual signals");
    }

    @Override
    public String receive() {
        System.out.println("Receiving message using visual signals");
        return message;
    }

    @Override
    public boolean isSecure() {//I didn't want to use this method that's why it's body is empty
        return false;
    }


}
