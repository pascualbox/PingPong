
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BerlinToDigitalHoursConverter {

    private String berlinMinutes;

    public BerlinToDigitalHoursConverter(String minutes) {
        this.berlinMinutes = minutes;
    }

    @Override
    public String toString() {
        return getDigitalHours();
    }

    public String getDigitalHours() {
        int intHours = 0;
        String firstHalf = berlinMinutes.substring(0, 4);
        String secondHalf = berlinMinutes.substring(4, 8);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(firstHalf.split("")));
        intHours = (4 - Collections.frequency(list, "O")) * 5;
        list = new ArrayList<String>(Arrays.asList(secondHalf.split("")));
        intHours += 4 - Collections.frequency(list, "O");
        if (intHours < 10) {
            return "0" + intHours;
        }
        return "" + intHours;
    }
}
