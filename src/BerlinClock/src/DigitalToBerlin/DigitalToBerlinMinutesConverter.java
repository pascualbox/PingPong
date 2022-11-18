package DigitalToBerlin;


public class DigitalToBerlinMinutesConverter {

    private int minutes;

    public DigitalToBerlinMinutesConverter(String minutes) {
        this.minutes = Integer.parseInt(minutes);
    }

    @Override
    public String toString() {
        return getFiveMinutesRow() + getSingleMinutesRow();
    }

    private String getSingleMinutesRow() {
        String result = "";
        int minutesToRepresent = this.minutes % 5;
        for (int i = 0; i < 4; i++) {
            if (i < minutesToRepresent) {
                result += "Y";
            } else {
                result += "O";
            }
        }
        return result;
    }

    private String getFiveMinutesRow() {
        String result = "";
        int minutesToRepresent = (minutes - (minutes % 5)) / 5;
        for (int i = 1; i < 12; i++) {
            if (i <= minutesToRepresent) {
                if (i % 3 == 0) {
                    result += "R";
                } else {
                    result += "Y";
                }
            } else {
                result += "O";
            }
        }
        return result;
    }
}
