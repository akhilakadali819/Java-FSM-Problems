import java.util.*;

public class Problem4StateHistoryTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String history = "START";

        List<String> outputs = new ArrayList<>();

        while (sc.hasNextLine()) {

            String input = sc.nextLine().trim();

            if (input.isEmpty())
                break;

            history += "->" + input;

            outputs.add("{\"key\":[\"" + history + "\"]}");
        }

        System.out.print("[");

        for (int i = 0; i < outputs.size(); i++) {

            System.out.print(outputs.get(i));

            if (i != outputs.size() - 1)
                System.out.print(",");
        }

        System.out.println("]");
        sc.close();
    }
}
