package lambda.comparator.entities;

public class Players {

    private String name;
    private Float height;
    private String position;

    public Players(String name, Float height, String position) {
        this.name = name;
        this.height = height;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Use Comparable:
    /*    @Override
    public int compareTo(Players o) {
        return height.compareTo(o.getHeight());
    }*/

    @Override
    public String toString() {
        return name + " " + height + " " + position;
    }
}
