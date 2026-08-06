import java.util.*;

public class Problem3TrafficLight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String state = "RED";
        List<String> result = new ArrayList<>();

        while (sc.hasNextLine()) {

            String input = sc.nextLine().trim();

            if (input.isEmpty())
                break;

            if (input.equals("NEXT")) {

                if (state.equals("RED"))
                    state = "GREEN";
                else if (state.equals("GREEN"))
                    state = "YELLOW";
                else if (state.equals("YELLOW"))
                    state = "RED";

                result.add("{\"key\":[\"" + state + "\"]}");
            }
        }

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {

            System.out.print(result.get(i));

            if (i != result.size() - 1)
                System.out.print(",");
        }

        System.out.println("]");
        sc.close();
    }
}
