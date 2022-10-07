package task1;

public class Ball {
    private String colour;

    public Ball(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colour='" + colour + '\'' +
                '}';
    }
}