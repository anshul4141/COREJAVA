package com.rays.exception.custom;

public class InsufficentFundException extends RuntimeException { // Custom unchecked exception

	public InsufficentFundException() {
		super("insufficent fund transfer");
	}

}
