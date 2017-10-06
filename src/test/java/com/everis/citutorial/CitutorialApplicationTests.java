package com.everis.citutorial;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitutorialApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
    public void pruebaFallo() {
        Assert.assertEquals(2, 2);
    }

}
