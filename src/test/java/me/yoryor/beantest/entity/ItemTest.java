package me.yoryor.beantest.entity;

import org.junit.Test;
import org.meanbean.lang.EquivalentFactory;
import org.meanbean.test.BeanTester;
import org.meanbean.test.EqualsMethodTester;
import org.meanbean.test.HashCodeMethodTester;

import static org.junit.Assert.*;

public class ItemTest {

  @Test
  public void beanTest() {
    BeanTester beanTester = new BeanTester();
    EqualsMethodTester equalsMethodTester = new EqualsMethodTester();
    HashCodeMethodTester hashCodeMethodTester = new HashCodeMethodTester();
    // 1. getter and setter
    beanTester.testBean(Item.class);
    // 2. equals
    equalsMethodTester.testEqualsMethod(new ItemFactory());
    // 3. hashCode
    hashCodeMethodTester.testHashCodeMethod(new ItemFactory());
    assertTrue(true);
    // 4. toString
    assertTrue(new Item().toString() != null);
  }

  private class ItemFactory implements EquivalentFactory<Item> {

    @Override
    public Item create() {
      Item item = new Item();
      item.setName("bar");
      item.setPrice(30.5);
      item.setStore(20);
      return item;
    }
  }
}
