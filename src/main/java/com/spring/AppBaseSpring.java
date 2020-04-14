package com.spring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBaseSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		Mensaje mensaje = context.getBean("mensajeComun", Mensaje.class);
//		// verificar si es el cumplea�os, Navidad u otro dia y mostrar mensaje
//		Date hoy = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
//		if (sdf.format(hoy).equals("12-25")) {
//			mensaje = context.getBean("mensajeNavidad", Mensaje.class);
//		}
//		System.out.println(mensaje.getTexto());
//
//		MensajeService ms = context.getBean("mensajeService", MensajeService.class);
//		ms.insertarMensaje(mensaje);
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - LARGA DISTANCIA    2 - CORTA DISTANCIA");
		int opc = sc.nextInt();
		Mensaje valor = context.getBean("cortaDistancia", Mensaje.class);
		if (opc == 1) {
			MensajeService ms = context.getBean("mensajeService", MensajeService.class);
			valor= context.getBean("largaDistancia", Mensaje.class);
			ms.insertarMensaje(valor);
//			Mensaje mensajeValor = context.getBean("largaDistancia", Mensaje.class);
//			System.out.println("VALOR DE ENVIO: " + valor.getValorEnvio() );
		}else {
			MensajeService ms = context.getBean("mensajeService", MensajeService.class);
			valor= context.getBean("cortaDistancia", Mensaje.class);
			ms.insertarMensaje(valor);
		}
		
		
	}

}
