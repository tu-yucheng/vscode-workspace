package cn.tuyucheng.taketoday;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class VscodeSpringbootSampleApplicationTests {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void contextLoads() {
  }

  @Test
  void givenPathValue_whenGreetingIsCalled_thenReturnCorrect() throws Exception {
    mockMvc.perform(get("/{name}", "tuyucheng"))
        .andExpect(status().isOk())
        .andExpect(content().string("hello tuyucheng"))
        .andDo(MockMvcResultHandlers.print());
  }

  @Test
  @DisplayName("whenGivenTrue_thenAssert")
  void whenGivenTrue_thenAssert() {
    String value = "Hello";
    assertTrue(value instanceof String);
  }
}