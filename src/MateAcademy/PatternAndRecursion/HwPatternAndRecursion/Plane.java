package MateAcademy.PatternAndRecursion.HwPatternAndRecursion;

public class Plane {
    private String model;
    private String color;
    private int size;
    private int passanger;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.size = builder.size;
        this.passanger = builder.passanger;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Plane{"
                +
                "model='" + model + '\''
                +
                ", color='" + color + '\''
                +
                ", size=" + size
                +
                ", passanger=" + passanger
                +
                ", year=" + year
                +
                '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int size;
        private int passanger;
        private int year;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setPassanger(int passanger) {
            this.passanger = passanger;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
