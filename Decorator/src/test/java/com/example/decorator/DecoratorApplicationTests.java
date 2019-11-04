package com.example.decorator;

import com.example.decorator.Component.HelloComponent;
import com.example.decorator.Decorator.HelloDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DecoratorApplicationTests {

	@Resource(name = "baseHello")
	HelloComponent baseHello;

	@Resource(name = "lowerHello")
	HelloDecorator lowerHello;

	@Resource(name = "upperHello")
	HelloDecorator upperHello;


	@Test
	void helloTests() {
		System.out.println(baseHello.hello());
		System.out.println(lowerHello.hello());
		System.out.println(upperHello.hello());

	}

}
