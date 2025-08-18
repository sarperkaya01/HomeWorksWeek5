package Enums;

public enum Days {

    MONDAY(true, 9, 17),
    TUESDAY(true, 9, 17),
    WEDNESDAY(true, 9, 17),
    THURSDAY(true, 9, 17),
    FRIDAY(true, 9, 17),
    SATURDAY(false, 0, 0),
    SUNDAY(false, 0, 0);
    private final boolean workingDay;
    private final int startHour;
    private final int endHour;

    Days(boolean workingDay, int startHour, int endHour) {
        this.workingDay = workingDay;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    @Override
    public String toString() {
        if (workingDay) {
            return name() + " \u2192 ( Yes Working: " + startHour + ":00 - " + endHour + ":00)";
        } else {
            return name() + " \u2192 ( No Working)";
        }
    }
}