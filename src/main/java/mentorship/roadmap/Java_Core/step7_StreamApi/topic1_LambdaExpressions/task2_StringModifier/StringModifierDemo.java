package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier;

public class StringModifierDemo {
    public static void main(String[] args) {
        String str = "koshka";
        StringModifier stringModifier = (x) -> x.toUpperCase() + "!";
        System.out.println(stringModifier.modify(str));
    }
}
