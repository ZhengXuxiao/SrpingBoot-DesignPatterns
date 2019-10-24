package com.example.strategy;

import com.example.strategy.Strategy.HelloStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StrategyResourceTest {

	@Resource(name = "ChineseHelloStrategy")
	HelloStrategy chineseHelloStrategy;

	@Resource(name = "EnglishHelloStrategy")
	HelloStrategy englishHelloStrategy;

	@Test
	public void helloStrategyTest(){
		System.out.println(chineseHelloStrategy.hello());
		System.out.println(englishHelloStrategy.hello());
	}

}
