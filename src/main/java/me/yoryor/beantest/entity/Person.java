package me.yoryor.beantest.entity;

import lombok.Data;

@Data
public class Person {

  private String name;
  private int age;
  private Gender gender;

  public enum Gender {
    MALE, FEMALE;
  }
}
