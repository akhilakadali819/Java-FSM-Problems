import java.util.*;

public class Problem5GuardedTransitions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String state = "IDLE";

        List<String> outputs = new ArrayList<>();

        while (sc.hasNextLine()) {

            String event = sc.nextLine().trim();

            if (event.isEmpty())
                break;

            if (!state.equals("ERROR")) {

                if (state.equals("IDLE")) {

                    if (event.equals("RUN"))
                        state = "ACTIVE";
                    else
                        state = "ERROR";

                } else if (state.equals("ACTIVE")) {

                    if (event.equals("STOP"))
                        state = "IDLE";
                    else
                        state = "ERROR";
                }
            }

            outputs.add("{\"key\":[\"" + state + "\"]}");
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
