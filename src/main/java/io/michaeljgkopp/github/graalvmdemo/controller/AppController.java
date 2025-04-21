package io.michaeljgkopp.github.graalvmdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping
  public String hello() {
    return "Hello, GraalVM!";
  }

}
