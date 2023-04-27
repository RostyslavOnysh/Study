package MateAcademy.PatternAndRecursion.StrategyPattern;

public class PublicTransportRouteService implements RouteService{
    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 35;
    }
}
