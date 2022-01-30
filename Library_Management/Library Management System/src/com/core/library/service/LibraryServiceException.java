package com.core.library.service;

public class LibraryServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public LibraryServiceException() {
		super();
	}

	public LibraryServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LibraryServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public LibraryServiceException(String message) {
		super(message);
	}

	public LibraryServiceException(Throwable cause) {
		super(cause);
	}
}
