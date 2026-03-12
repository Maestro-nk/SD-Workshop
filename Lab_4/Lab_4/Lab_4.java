public class Lab_4{
    public static void main(String[] args){
        java.nio.file.Path filePath = java.nio.file.Path.of("input.txt");

        try {
            String content = java.nio.file.Files.readString(filePath);

            System.out.println("File contents");
            System.out.println(content);

            String[] words = content.split(" ");

            StringBuilder resultText = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                if (word.length() > 3) {
                    char firstChar = word.charAt(0);
                    char lastChar = word.charAt(word.length() - 1);

                    String middle = word.substring(1, word.length() - 1);

                    word = lastChar + middle + firstChar;
                }

                resultText.append(word).append(" ");
            }

            System.out.println("\n--- Modified text ---");
            System.out.println(resultText.toString().trim());

            java.nio.file.Path outputPath = java.nio.file.Path.of("output.txt");
            
            java.nio.file.Files.writeString(outputPath, resultText.toString().trim());

            System.out.println("\nУспешно сохранено в output.txt!");

        } catch (java.io.IOException e) {
            System.out.println("An error occurred while reading the file!");
        }
    }
}
