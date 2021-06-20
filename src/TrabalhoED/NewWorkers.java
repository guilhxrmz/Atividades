package TrabalhoED;

public class NewWorkers {
    private Float Distance;
    private Float Height;
    private Integer Weight,Age;
    private String classs;

    public Float getDistance() {
        return Distance;
    }

    public Float getHeight() {
        return Height;
    }

    public Integer getWeight() {
        return Weight;
    }

    public Integer getAge() {
        return Age;
    }

    public String getClasss() {
        return classs;
    }

    @Override
    public String toString() {
        return      Distance +
                "," + Height +
                "," + Weight +
                "," + Age +
                "," + classs;
    }

    public NewWorkers(Float Distance,Float Height, Integer Weight, Integer Age, String classs) {
        this.Distance = Distance;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.classs = classs;

    }
}
