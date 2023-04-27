package MateAcademy.PatternAndRecursion.StrategyPattern;

public class WalkingRouteService implements RouteService{
    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 10;
    }
}
