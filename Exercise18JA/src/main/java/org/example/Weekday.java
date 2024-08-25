package org.example;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWeekDay;

    Weekday(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    public boolean isHoliday() {
        return !isWeekDay;
    }

    public void whichIsGreater(Weekday day) {
        int comparison = this.compareTo(day);
        if (comparison > 0) {
            System.out.println(day + " is the predecessor of " + this);
        } else if (comparison < 0) {
            System.out.println(day + " is the successor of " + this);
        } else {
            System.out.println("Both days are the same");
        }
    }
}
