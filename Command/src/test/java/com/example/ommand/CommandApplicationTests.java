package com.example.ommand;

import com.example.ommand.Invoker.SwitchInvoker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommandApplicationTests {

	@Autowired
	private SwitchInvoker switchInvoker;

	@Test
	public void switchInvokerTest(){
		switchInvoker.invoke("lightOn");
		switchInvoker.invoke("lightOff");
	}

}
