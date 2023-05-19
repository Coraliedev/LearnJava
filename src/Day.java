public enum Day {
    MORNING(8, "It's time to get up"),
    NOON(12, "It's lunch time"),
    AFTERNOON(15, "It's time to work"),
    EVENING(22, "It's time to sleep"),
    NIGHT(2, "Have a good night");

    private final int hour;
    private final String message;

    Day(int hour, String message) {
        this.hour = hour;
        this.message = message;
    }

    public int getHour() {
        return hour;
    }

    public String getMessage() {
        return message;
    }
}
