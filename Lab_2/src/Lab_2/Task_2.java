package Lab_2;

public class Task_2 {
    public static void main(String[] args) {
        String text = "Test text for lab work 2. One... Two... Three... Check.";
        System.out.println(text) ;

        String[] words = text.split("[\\s,.!?;]+");

        for(int i = 0; i< words.length; i++){
            System.out.println(words[i]) ;
        }
    }
}
