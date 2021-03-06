package me.yoryor.beantest.entity;

import java.util.Objects;

public class Item {
  private String name;
  private double price;
  private int store;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStore() {
    return store;
  }

  public void setStore(int store) {
    this.store = store;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Item item = (Item) o;
    return Double.compare(item.price, price) == 0 && store == item.store
        && Objects.equals(name, item.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, store);
  }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + ", price=" + price + ", store=" + store + '}';
  }
}
