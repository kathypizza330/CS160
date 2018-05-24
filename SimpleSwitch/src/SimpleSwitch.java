
// Simple switch statement example

public class SimpleSwitch {

    // Enumeration
    enum DayofWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        DayofWeek day = DayofWeek.MONDAY;
//
//        System.out.println("MONDAY = " + DayofWeek.MONDAY.ordinal());
//        System.out.println("TUESDAY = " + DayofWeek.TUESDAY.ordinal());
//        System.out.println("WEDNESDAY = " + DayofWeek.WEDNESDAY.ordinal());
//        System.out.println("THURSDAY = " + DayofWeek.THURSDAY.ordinal());
//        System.out.println("FRIDAY = " + DayofWeek.FRIDAY.ordinal());
//        System.out.println("SATURDAY = " + DayofWeek.SATURDAY.ordinal());
//        System.out.println("SUNDAY = " + DayofWeek.SUNDAY.ordinal());
        
        // Switch statement
        switch (day) {
        case MONDAY:
        case TUESDAY:
        case WEDNESDAY:
        case THURSDAY:
            System.out.println("Hours on " + day + " are 8:00am to 6:00pm");
            break;
        case FRIDAY:
            System.out.println("Hours on " + day + " are 8:00am to 9:00pm");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Hours on " + day + " are 10:00am to 6:00pm");
            break;
        }
    }
}
