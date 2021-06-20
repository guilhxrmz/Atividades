package TrabalhoED;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Workers implements Serializable {
    private Float Height;
    private Integer Weight,Age;
    private String classs;

    public Workers(Float Height, Integer Weight, Integer Age, String classs) {
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.classs = classs;

    }

    public Integer getWeight() {
        return Weight;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return ""+Height +
                "," + Weight +
                "," + Age +
                "," + classs ;
    }

    public Float getHeight() {
        return Height;
    }

    public void setHeight(Float height) {
        Height = height;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}



