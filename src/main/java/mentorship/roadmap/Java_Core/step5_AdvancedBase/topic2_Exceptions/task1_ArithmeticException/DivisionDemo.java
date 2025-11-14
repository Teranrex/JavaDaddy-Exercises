package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

public class DivisionDemo {
    public static void main(String[] args) {
        int i = 10;
        int j = 1;
        int result = 0;
        try{
            result = i / j;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
