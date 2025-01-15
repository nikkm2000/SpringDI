package ConstructorDI_Annotation.Beans;

import java.util.List;

public class Subject {

private List<String> subjects;

public Subject(List<String> subjects){
    this.subjects=subjects;
}

    @Override
    public String toString() {
        return subjects.toString();
    }
}
