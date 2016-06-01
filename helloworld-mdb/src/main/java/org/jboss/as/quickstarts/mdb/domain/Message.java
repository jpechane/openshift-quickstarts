package org.jboss.as.quickstarts.mdb.domain;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String header;
	private final String payload;
	
	public Message(String header, String payload) {
		super();
		this.header = header;
		this.payload = payload;
	}

	public String getHeader() {
		return header;
	}

	public String getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		return "Message [header=" + header + ", payload=" + payload + "]";
	}	
}
