public class NewSwitch {

    public static void main(String[] args) {
        int number = 4;

        switch (number){
            case 1 -> System.out.println("Number is 1");
            case 2 -> System.out.println("Number is 2");
            case 3, 4, 5 -> {
                System.out.println("Number is of 3 or 4 or 5");
                System.out.println("Actual number value is "+ number);
            }
            default -> System.out.println("Number is not 1, 2, 3, 4, 5");

        }

        System.out.println(getQuarter("JANUARY"));
    }


    public static String getQuarter(String month){

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "not valid month";
        };

    }




}
