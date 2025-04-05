package main;

public class TimeFormatter {

    private static final int SECONDS_IN_A_YEAR = 31_536_000;
    private static final int SECONDS_IN_A_DAY = 86_400;
    private static final int SECONDS_IN_AN_HOUR = 3_600;
    private static final int SECONDS_IN_A_MINUTE = 60;
    private static final String UNIT_YEAR = "year";
    private static final String UNIT_DAY = "day";
    private static final String UNIT_HOUR = "hour";
    private static final String UNIT_MINUTE = "minute";
    private static final String UNIT_SECOND = "second";
    public static final String SEPARATOR_COMMA = ", ";
    public static final String SEPARATOR_AND = " and ";

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        StringBuilder time = new StringBuilder();

        seconds = calculateTimeUnit(seconds, UNIT_YEAR, SECONDS_IN_A_YEAR, time);
        seconds = calculateTimeUnit(seconds, UNIT_DAY, SECONDS_IN_A_DAY, time);
        seconds = calculateTimeUnit(seconds, UNIT_HOUR, SECONDS_IN_AN_HOUR, time);
        seconds = calculateTimeUnit(seconds, UNIT_MINUTE, SECONDS_IN_A_MINUTE, time);
        calculateTimeUnit(seconds, UNIT_SECOND, 1, time);
        formatWithAnd(time);

        return time.toString();
    }

    private static int calculateTimeUnit(int seconds, String timeUnit, int secondsPerUnit,
                                         StringBuilder stringBuilder) {
        int result = seconds / secondsPerUnit;
        if (result > 0) {
            generateTimeMessage(timeUnit, stringBuilder, result);
        }
        return seconds % secondsPerUnit;
    }

    private static void generateTimeMessage(String timeUnit, StringBuilder sb, int result) {
        if (!sb.isEmpty()) {
            sb.append(", ");
        }
        sb.append(result).append(" ").append(timeUnit).append(result > 1 ? "s" : "");
    }

    private static void formatWithAnd(StringBuilder sb) {
        int lastCommaIndex = sb.lastIndexOf(SEPARATOR_COMMA);
        if (lastCommaIndex != -1) {
            sb.replace(lastCommaIndex, lastCommaIndex + 2, SEPARATOR_AND);
        }
    }

    public static void main(String[] args) {

    }

}
