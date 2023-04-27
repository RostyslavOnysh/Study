package MateAcademy.PatternAndRecursion.Builder.SecondExample;

public class Main {
    public static void main(String[] args) {
        Country vatican = new Country.Builder("Vatican", 1000).build();
        Country Ukraine = new Country.Builder("Ukraine", 36_000_000)
                .setRegion(new String[]{"Kyiv", "Cherkasy", "Kharkiv"})
                .setPreviousName(new String[]{"Kyiv Rus"})
                .setNeighbours(new Country[]{/* TODO add countries*/})
                .build();

        Country Australia = new Country.Builder("Australia", 50_000_000)
                .setRegion(new String[]{"Viktoria"})
                .build();

    }
}
