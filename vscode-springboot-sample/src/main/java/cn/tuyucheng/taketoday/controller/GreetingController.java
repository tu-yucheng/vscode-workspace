package cn.tuyucheng.taketoday.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GreetingController {

  @GetMapping(value = "/{name}")
  public String greeting(@PathVariable String name) {
    System.out.println("hello world");
    return "hello " + name;
  }
}