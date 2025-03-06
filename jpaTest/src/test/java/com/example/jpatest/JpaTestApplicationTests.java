package com.example.jpatest;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaTestApplicationTests {
	@Autowired
	private PersonRepository personRepository;

	@Test
	void test() {
		System.out.println("成功执行");
//		Person person = new Person();
//		person.setName("第五个");
//		personRepository.save(person);
		Person person2 = personRepository.findById(5);
		person2.setName("d");
		System.out.println(person2.getName());
	}

	@Test
	void test2() {
		User user = new User();
		user.setName("a");
		user.setAge(20);
		System.out.println(user.getName());
	}

}
