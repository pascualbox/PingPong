package DigitalToBerlin;


public class DigitalToBerlinHoursConverter {

    private int hours;

    public DigitalToBerlinHoursConverter(String hours) {
        this.hours = Integer.parseInt(hours);
    }

    @Override
    public String toString() {
        return getFiveHoursRow() + getSingleHoursRow();
    }

    private String getSingleHoursRow() {
        String result = "";
        int hoursToRepresent = hours % 5;
        for (int i = 0; i < 4; i++) {
            if (i < hoursToRepresent) {
                result += "R";
            } else {
                result += "O";
            }
        }
        return result;
    }

    private String getFiveHoursRow() {
        String result = "";
        int hoursToRepresent = (hours - (hours % 5)) / 5;
        for (int i = 0; i < 4; i++) {
            if (i < hoursToRepresent) {
                result += "R";
            } else {
                result += "O";
            }
        }
        return result;
    }
}
