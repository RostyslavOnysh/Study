package MateAcademy.EqualsAndHashcodeAndClone.HW.SecondTask;


import java.util.Objects;

public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;
        return (width == rectangle.width || width != null && width.equals(rectangle.width))
                && (length == rectangle.length || length != null && length.equals(rectangle.length))
                && (color == rectangle.color || color != null && color.equals(rectangle.color));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((color == null) ? 0 : color.hashCode());
        result = 31 * result + ((width == null) ? 0 : width.hashCode());
        result = 31 * result + ((length == null) ? 0 : length.hashCode());
        return result;
    }
}
