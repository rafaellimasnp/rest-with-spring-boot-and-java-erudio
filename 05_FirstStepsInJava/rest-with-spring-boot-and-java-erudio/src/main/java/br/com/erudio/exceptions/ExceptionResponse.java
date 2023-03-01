package br.com.erudio.exceptions;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String timestamp;
	private String message;
	private String datails;

	public ExceptionResponse(LocalDate Data, String message, String datails) {
		super();
		this.timestamp = Data.toString();
		this.message = message;
		this.datails = datails;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDatails() {
		return datails;
	}

}
