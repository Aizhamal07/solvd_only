package practicalWithAndrei.homework2;

public class MorseCode implements MilitaryCommunication {

    private String msg;

    @Override
    public void send(String msg) {
        this.msg=msg;
        System.out.println("Sending message "+msg+" using morse code");
    }
    @Override
    public String receive() {
        System.out.println("Receiving message using morse code");
        return msg;
    }
}
