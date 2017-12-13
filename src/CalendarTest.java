class CalendarTest {

    public static void main(String[] args) {


        for (int i =1 ; i<=7; i++) {
            String x;
            if (i == 1){ x ="st";}
            else if (i == 2) { x = "nd";}
            else if (i ==3) { x = "rd";}
            else x = "th";

            System.out.println("The " + i + x + " day of the week is " + CalendarConverter.convertDayToString(i));

        }

    }
}
