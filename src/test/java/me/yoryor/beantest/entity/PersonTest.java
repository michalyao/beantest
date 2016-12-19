package me.yoryor.beantest.entity;

import org.junit.Test;
import org.meanbean.factories.equivalent.EquivalentEnumFactory;
import org.meanbean.test.BeanTester;
import org.meanbean.test.EqualsMethodTester;

import static org.junit.Assert.*;

public class PersonTest {

  @Test
  public void beanTest() {
    BeanTester beanTester = new BeanTester();
    beanTester.testBean(Person.class);
    assertTrue(true);
  }
}
