package cn.tuyucheng.taketoday;

import java.util.List;

/**
 * sample application to print username.
 */
public class App {
  public static void main(String[] args) {
    List<String> list = List.of("Doe", "Maria", "Tuyucheng");
    list.forEach(System.out::println);
  }
}