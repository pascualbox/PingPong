package DigitalToBerlin;


public class DigitalToBerlinSecondsConverter {

    private int seconds;

    public DigitalToBerlinSecondsConverter(String seconds) {
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
