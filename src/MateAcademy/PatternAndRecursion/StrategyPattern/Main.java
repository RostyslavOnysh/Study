package MateAcademy.PatternAndRecursion.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        /*
        Calculate the travel time between two points.
        Usually the point on map could be described in following format : 50.443508 : 30.519013
        The trip can be made:
        - By bike --> speed = 20;
        -In foot --> 10;
        -By Car --> 50;
        -By public transport --> 35;
         */

        RouteStrategy strategy = new RouteStrategy();
        RouteService routeService = strategy.getRouteService("car");
        double time = routeService.calculateRouteTime(0, 50);
        System.out.println(time);

    }
}
