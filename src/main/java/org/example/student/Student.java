package org.example.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

  Student(String name) {
    this.name = name;
  }

  private final String name;
  private List<Lesson> lessons = new ArrayList<>();

  public String getName() {
    return this.name;
  }

  public List<Lesson> getLessons() {
    return this.lessons;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }

  public void addLesson(Lesson lesson) {
    lessons.add(lesson);
  }

}
