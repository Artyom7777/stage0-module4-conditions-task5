package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {

        public void isLeapYear ( int year){
        boolean leapyear = (year > 1584 && ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0)));
        if (leapyear)
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
}

