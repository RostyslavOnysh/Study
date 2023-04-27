package MateAcademy.PatternAndRecursion.Builder.SecondExample;

import java.util.Arrays;

public class Country {
    private String name;
    private int population;
    private Country[] neighbours;
    private String[] region;
    private String[] previousName;

    public Country(Builder builder) {
        this.name = builder.name;
        this.population = builder.population;
        this.neighbours = builder.neighbours;
        this.region = builder.region;
        this.previousName = builder.previousName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", neighbours=" + Arrays.toString(neighbours) +
                ", region=" + Arrays.toString(region) +
                ", previousName=" + Arrays.toString(previousName) +
                '}';
    }

    public static class Builder {
        private String name;
        private int population;
        private Country[] neighbours;
        private String[] region;
        private String[] previousName;

        public Builder(String name, int population) {
            this.name = name;
            this.population = population;
        }

        public Builder setNeighbours(Country[] neighbours) {
            this.neighbours = neighbours;
            return this;
        }

        public Builder setRegion(String[] region) {
            this.region = region;
            return this;
        }

        public Builder setPreviousName(String[] previousName) {
            this.previousName = previousName;
            return this;
        }

        public Country build() {
            /*
            білдер дозволяє робити валідацію данних.Перевірку за допомогою If statment
            Example :
             */
            if (this.population <= 0) {
                throw new RuntimeException("Can`t create Country Object." + "Population cannot be less then 0");
            }
            return new Country(this);
        }
    }
}
