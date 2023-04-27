package MateAcademy.PatternAndRecursion.StrategyPattern;

public class CarRouteService implements RouteService {
    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 50;
    }
}
