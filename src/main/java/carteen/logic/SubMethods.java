package carteen.logic;

import java.util.regex.Pattern;

/**
 * Дополнительный класс, в котром находятся методы-помощники
 */
public class SubMethods {
    private static Pattern intPattern = Pattern.compile("-?\\d+");

    public static boolean isInteger(String str) {
        return intPattern.matcher(str).matches();
    }
}
