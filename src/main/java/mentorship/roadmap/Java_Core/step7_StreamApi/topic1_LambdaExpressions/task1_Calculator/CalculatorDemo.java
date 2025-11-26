package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Calculator s = (x,y) -> a + b;

        int ans = s.operator(a, b);
        System.out.println(ans);


    }

}
