package dev.yonkeu.models;

import javax.persistence.*;

@Entity
@Table(name = "grade_format")
public class grade_format {

   // Instance variables
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private String letter_grade;
   private boolean result;

   //Constructors
    public grade_format(){
    }

    public grade_format(String letter_grade, boolean result) {
        this.letter_grade = letter_grade;
        this.result = result;
    }

    //Getters and Setters

    public String getLetter_grade() {
        return letter_grade;
    }

    public void setLetter_grade(String letter_grade) {
        this.letter_grade = letter_grade;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "grade_format{" +
                "letter_grade='" + letter_grade + '\'' +
                ", result=" + result +
                '}';
    }
}

