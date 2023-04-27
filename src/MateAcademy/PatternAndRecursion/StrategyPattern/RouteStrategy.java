package MateAcademy.PatternAndRecursion.StrategyPattern;

public class RouteStrategy {
    public RouteService getRouteService(String transportType) {
        switch (transportType) {
            case "bike":
                return new BikeRouteService();
            case "public transport":
                return new PublicTransportRouteService();
            case "walk":
                return new WalkingRouteService();
            default:
                return new CarRouteService();
        }

    }
}
