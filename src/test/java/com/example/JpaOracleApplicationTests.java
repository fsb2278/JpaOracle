package com.example;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.model.Rueck;
import com.example.repository.RueckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaOracleApplication.class)
public class JpaOracleApplicationTests {

	@Autowired
	private RueckRepository rueckRepository;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testJpaAnd() {
		List<Rueck> ruecks = rueckRepository.findAll();
		assertNotNull(ruecks);
	}

}
