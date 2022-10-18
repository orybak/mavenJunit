package com.jetbrains.mavendemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MavenDemoApplicationTests {

	@Test
	void contextLoads() {
		assertThat("foo").isEqualTo("bar");

	}

}
