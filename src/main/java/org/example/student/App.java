package org.example.student;

public class App {

  public static void main(String[] args) {
    Lesson lesson = new Lesson();
    lesson.type = "matematik";
    lesson.vize1 = 100;
    lesson.vize2 = 43;
    lesson.finalNotu = 54;
    lesson.hesapla();
    Lesson lesson1 = new Lesson("Türkçe",40,70,80);

    Student student = new Student("İsmail");
    student.addLesson(lesson);
    student.addLesson(lesson1);

    studentPoints("yeşim", "100");
    lessonsPoints("yeşim", 100, 54, 89, 90);
    lesson ("Yeşim", lesson1.type, lesson1.ortalama);
    lesson ("Yeşim", lesson);
    lesson(student);

  }

  public static void studentPoints(String name, String point) {
    System.out.println(name + " sınavdan " + point + " puan aldınız");
    // name + " asdfasd" + + "sadfdsfgsdfg"
  }

  public static void lessonsPoints(String name, int mathsPoints, int physicsPoints,
      int chemistryPoints, int turkishPoints) {
    System.out.println(
        "Sn " + name + " matematik sınavından " + mathsPoints + " fizik sınavından " + physicsPoints
            + " kimya sınavından " + chemistryPoints + " türkçe sınavından " + turkishPoints
            + " puan aldınız");

  }
  public static void lesson(String name, String type, double ortalama){
    System.out.println("Sn " +name+" "+ type +  " dersinden "+ ortalama+ " puan aldınız." );
  }

  public static void lesson(String name, Lesson lesson){
    System.out.println("Sn " +name+" "+ lesson.type +  " dersinden "+ lesson.ortalama+ " puan aldınız." );
  }

  public static void lesson(Student student){
    String result = "Sn " +student.getName()+" ";
    for (Lesson lesson: student.getLessons()) {
      result = result + lesson.type + " dersinden " + lesson.ortalama + " puan aldınız.";
    }

    System.out.println(result);
  }
}

