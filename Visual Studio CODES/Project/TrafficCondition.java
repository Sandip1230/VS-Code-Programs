import java.util.*;

abstract class TrafficCondition {
    private String conditionName;

    public TrafficCondition(String conditionName) {
        this.conditionName = conditionName;
    }

    public String getConditionName() {
        return conditionName;
    }

    public abstract String handleCondition();
}

class LightTraffic extends TrafficCondition {
    private int weatherConditions;

    public LightTraffic(int weatherConditions) {
        super("Light traffic");
        this.weatherConditions = weatherConditions;
    }

    public String handleCondition() {
        String recommendation;
        switch (weatherConditions) {
            case 1:
                recommendation = "you can follow the normal traffic rules."; // return
                break;
            case 2:
                recommendation = "drive cautiously and maintain a safe distance from other vehicles.";
                break;
            case 3:
                recommendation = "drive at a slower speed and use fog lights if necessary.";
                break;
            default:
                recommendation = "Invalid input ! Try again next time ";
        }
        return recommendation;
    }
}

class ModerateTraffic extends TrafficCondition {
    private int timeOfDay;

    public ModerateTraffic(int timeOfDay) {
        super("Moderate traffic");
        this.timeOfDay = timeOfDay;
    }

    public String handleCondition() {
        String recommendation;
        switch (timeOfDay) {
            case 1:
                recommendation = "consider taking alternate routes if available to avoid heavy traffic.";
                break;
            case 2:
                recommendation = "plan your travel in advance and allow extra time for delays.";
                break;
            case 3:
                recommendation = "avoid unnecessary travel during peak congestion hours.";
                break;
            default:
                recommendation = "Invalid input ! Please try again later.";
        }
        return recommendation;
    }
}

class HeavyTraffic extends TrafficCondition {
    private int roadConditions;

    public HeavyTraffic(int roadConditions) {
        super("Heavy traffic");
        this.roadConditions = roadConditions;
    }

    public String handleCondition() {
        String recommendation;
        switch (roadConditions) {
            case 1:
                recommendation = "to be patient and maintain a safe distance from other vehicles.";
                break;
            case 2:
                recommendation = "to follow the directions of traffic controllers and be cautious of construction zones.";
                break;
            case 3:
                recommendation = "to seek alternative routes and stay updated with traffic information.";
                break;
            default:
                recommendation = "Invalid input ! Please try again later.";
        }
        return recommendation;
    }
}

class TrafficManagementExpertSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the current traffic conditions:");
        System.out.println("[1] Light traffic");
        System.out.println("[2] Moderate traffic");
        System.out.println("[3] Heavy traffic");
        System.out.println("Enter your choice : ");
        int trafficConditions = sc.nextInt();

        TrafficCondition condition;

        // Process the input using expert system rules
        switch (trafficConditions) {
            case 1:
                condition = createLightTraffic(sc);
                break;
            case 2:
                condition = createModerateTraffic(sc);
                break;
            case 3:
                condition = createHeavyTraffic(sc);
                break;
            default:
                condition = null;
                System.out.println("Invalid input ! Please try again later.");
        }

        // Provide the recommendation
        if (condition != null) {
            System.out.println("Traffic condition is : " + condition.getConditionName());
            String recommendation = condition.handleCondition();
            System.out.println("It is recommended that " + recommendation);
        }

        sc.close();
    }

    // Create LightTraffic object and prompt for weather conditions
    private static TrafficCondition createLightTraffic(Scanner sc) {
        System.out.println("Enter the current weather conditions :");
        System.out.println("1 ] -  Weather is clear");
        System.out.println("2 ] -  Weather is rainy ");
        System.out.println("3 ] -  Weather is foggy ");
        System.out.println("Enter your choice : ");

        int weatherConditions = sc.nextInt();

        return new LightTraffic(weatherConditions);
    }

    // Create ModerateTraffic object and prompt for time of day
    private static TrafficCondition createModerateTraffic(Scanner sc) {
        System.out.println("Enter the time of day :");
        System.out.println("1 ] - Morning   rush hour");
        System.out.println("2 ] - Afternoon rush hour");
        System.out.println("3 ] - Evening   congestion");
        System.out.println("Enter your choice : ");

        int timeOfDay = sc.nextInt();

        return new ModerateTraffic(timeOfDay);
    }

    // Create HeavyTraffic object and prompt for road conditions
    private static TrafficCondition createHeavyTraffic(Scanner sc) {
        System.out.println("Enter the current condition of the road :");
        System.out.println("1 ] - Road condition is normal ");
        System.out.println("2 ] - Ongoing construction work near road ");
        System.out.println("3 ] - There's accident or a road closure");
        System.out.println("Enter your choice : ");

        int roadConditions = sc.nextInt();

        return new HeavyTraffic(roadConditions);
    }
}