package com.spring;

public class MensajeService {
	
	private MensajeDao mensajeDao;

	public MensajeDao getMnesajeDao() {
		return mensajeDao;
	}

	public MensajeDao getMensajeDao() {
		return mensajeDao;
	}

	public void setMensajeDao(MensajeDao mensajeDao) {
		this.mensajeDao = mensajeDao;
	}

	
	public void insertarMensaje(Mensaje men) {
		mensajeDao.insertarMensaje(men);
	}
	
}
