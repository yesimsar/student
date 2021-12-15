package org.example.student;

public class Lesson {

  Lesson(String type, int vize1,int vize2,int finalNotu) {
    this.type = type;
    this.vize1 = vize1;
    this.vize2 = vize2;
    this.finalNotu = finalNotu;
    hesapla();
  }

  Lesson() {

  }

  String type;
  int vize1;
  int vize2;
  int finalNotu;
  double ortalama;

  public void hesapla (){
     double vize1Katilan= this.vize1 * 0.2;
     double vize2Katilan= this.vize2 * 0.2;
     double finalNotuKatilan = this.finalNotu * 0.6;
     this.ortalama= vize1Katilan + vize2Katilan + finalNotuKatilan;
  }
}
