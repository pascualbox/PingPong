
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BerlinToDigitalMinutesConverter {

    private String berlinMinutes;

    public BerlinToDigitalMinutesConverter(String minutes) {
        this.berlinMinutes = minutes;
    }

    @Override
    public String toString() {
        return getDigitalMinutes();
    }

    public String getDigitalMinutes() {
        int intMinutes = 0;
        String firstPart = berlinMinutes.substring(0, 11);
        String secondPart = berlinMinutes.substring(11, 15);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(firstPart.split("")));
        intMinutes = (11 - Collections.frequency(list, "O")) * 5;
        list = new ArrayList<String>(Arrays.asList(secondPart.split("")));
        intMinutes += 4 - Collections.frequency(list, "O");
        if (intMinutes < 10) {
            return "0" + intMinutes;
        }
        return "" + intMinutes;
    }
}
