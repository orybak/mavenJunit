package com.jetbrains.mavendemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenDemoApplicationTests {
String foo;
	foo = "foo";
	@Test
	void contextLoads() {
		assertThat(foo).isEqualTo("bar");

	}

}
