
public class BerlinToDigitalConverter {

    private String berlinTime;
    private BerlinToDigitalHoursConverter berlinHours;
    private BerlinToDigitalMinutesConverter berlinMinutes;

    public BerlinToDigitalConverter(String berlinTime) {
        if (berlinTime.matches("(^[OY][OR]{8}([YO]{2}[RO]){3}[YO]{6})") && (!berlinTime.substring(1, berlinTime.length()).equals("RRRRRRRRYYRYYRYYRYYYYYY"))) {
            this.berlinTime = berlinTime;
            this.berlinHours = new BerlinToDigitalHoursConverter(berlinTime.substring(1, 9));
            this.berlinMinutes = new BerlinToDigitalMinutesConverter(berlinTime.substring(9, 24));
        } else {
            System.out.println("INVALID FORMAT");
        }

    }

    @Override
    public String toString() {
        if (berlinTime != null) {
            return berlinTime + " = " + convertToDigital();
        } else {
            return "NOTHING TO RETURN";
        }
    }

    public String convertToDigital() {
        return "" + berlinHours + ":" + berlinMinutes;
    }

}
