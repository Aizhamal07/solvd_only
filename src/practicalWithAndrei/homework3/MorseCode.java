package practicalWithAndrei.homework3;

public class MorseCode implements MilitaryCommunication {
    // .-.. .-.. -.-. .- .. .-. (All clear)
    private String msg;

    public MorseCode(String msg) {
        this.msg = msg;
    }
    public boolean isSecure() {
        for(int i=0;i<msg.length();i++){
            char c=msg.charAt(i);
            if((c==('.')) || ('-' == c)){
                System.out.println("Secure!");
                return true;
            }else{
                System.out.println("Not secure!Cancelled");
                return false;
        }
    }
        return false;
    }

    private String convertToMorseCode(String msg){//I need to give only "all clear" message.
        String morseCodeMessage = "";
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            switch (c) {
                case 'a':
                    morseCodeMessage += ".- ";
                    break;
                case 'l':
                    morseCodeMessage += ".-.. ";
                    break;
                case 'c':
                    morseCodeMessage += "-.-.";
                    break;
                case 'e':
                    morseCodeMessage += ".";
                    break;
                case 'r':
                    morseCodeMessage += ".-.";
                    break;
                // I added only few letters.all letters and symbols need to be added when there is more time.
                default:
                    break;
            }
        }
        return "";
    }

    @Override
    public void send(String msg) {
        if(isSecure()==true){
        System.out.println("Sending a message \"" +msg+"\"!");
        }else{
            System.out.println("Not sent!");

        }

    }

    @Override
    public String receive() {
        System.out.println("Received a new message: ");
        return msg;
    }



}
