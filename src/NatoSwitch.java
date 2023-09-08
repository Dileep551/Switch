public class NatoSwitch {

    public static void main(String[] args) {

        char value = 'B';

        switch (value){
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is BAKER");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Not valid NATO word");
        }
    }
}
