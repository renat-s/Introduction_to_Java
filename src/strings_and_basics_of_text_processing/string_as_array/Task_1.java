package strings_and_basics_of_text_processing.string_as_array;

public class Task_1 {
    public static void main(String[] args) {
        String[] camelCase = new String[]{"stringBuffer", "stringBuilder", "camelCase", "snakeCase", "number"};
        String[] snakeCase = snakeCase(camelCase);

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }

    public static String[] snakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    sb.append(letter);
                } else {
                    sb.append("_");
                    sb.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = sb.toString();
        }

        return snakeCase;
    }
}

