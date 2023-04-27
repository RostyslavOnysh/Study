package MateAcademy.PatternAndRecursion.StrategyPattern;

public class BikeRouteService implements RouteService{
    @Override
    public double calculateRouteTime(int startPoint, int endPoint) {
        return (double) (endPoint - startPoint) / 20;
        /*
        віднімаємо від кінцевої початкову точку та ділимо на швидкість руху велосипеду
         */
    }
}
