import java.util.*;

public class Problem1LightSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String state = "OFF";
        List<String> outputs = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine().trim();

            if (input.isEmpty())
                break;

            if (input.equals("TOGGLE")) {
                state = state.equals("OFF") ? "ON" : "OFF";
                outputs.add("{\"key\":[\"" + state + "\"]}");
            }
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
