
public class BerlinToDigitalSecondsConverter {

    private int seconds;

    public BerlinToDigitalSecondsConverter(String seconds) {
        this.seconds = Integer.parseInt(seconds);
    }

    @Override
    public String toString() {
        if (seconds % 2 == 0) {
            return "Y";
        } else {
            return "O";
        }

    }

}
