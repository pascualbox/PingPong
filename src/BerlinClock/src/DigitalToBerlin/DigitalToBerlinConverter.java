package DigitalToBerlin;

public class DigitalToBerlinConverter {

    private String digital;
    private DigitalToBerlinHoursConverter hours;
    private DigitalToBerlinMinutesConverter minutes;
    private DigitalToBerlinSecondsConverter seconds;

    public DigitalToBerlinConverter(String string) {
        if (string.matches("^(((([0-1][0-9])|(2[0-3])):?[0-5][0-9]:?[0-5][0-9]$))")) {
            digital = string;
            splitString(string);
        } else {
            System.out.println("INVALID TIME FORMAT, PLEASE USE HH:MM:SS FORMAT");
        }
    }

    @Override
    public String toString() {
        if (digital != null) {
            return digital + " = " + seconds + hours + minutes;
        } else {
            return "NOTHING TO RETURN";
        }
    }

    private void splitString(String string) {
        String[] array = string.split(":");
        hours = new DigitalToBerlinHoursConverter(array[0]);
        minutes = new DigitalToBerlinMinutesConverter(array[1]);
        seconds = new DigitalToBerlinSecondsConverter(array[2]);
    }
}
