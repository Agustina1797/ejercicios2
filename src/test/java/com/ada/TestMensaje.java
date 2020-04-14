package com.ada;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Mensaje;

import junit.framework.TestCase;

public class TestMensaje extends TestCase{

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public void testCumple() {
		Mensaje mCumple = context.getBean("mensajeCumple", Mensaje.class);
		String diaCumple = mCumple.getTexto();
		assertTrue(diaCumple.equals("Feliz cumple!"));
	}
}
