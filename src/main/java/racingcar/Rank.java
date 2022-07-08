package racingcar;

public class Rank implements Comparable<Rank> {

    private String name;
    private int point;

    public Rank(String name, String location) {
        this.name = name;
        this.point = location.length();
    }

    @Override
    public int compareTo(Rank o) {
        return o.point - this.point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
