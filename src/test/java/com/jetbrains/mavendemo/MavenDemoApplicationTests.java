package com.jetbrains.mavendemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "foo=bar")
class MavenDemoApplicationTests {
  @Value("${foo}")
  String foo;
	@Test
	void contextLoads() {
		assertThat(foo).isEqualTo("bar");

	}

}
