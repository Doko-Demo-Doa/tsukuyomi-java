package com.clipsub.tsukuyomi.exception;

public class BaseException extends RuntimeException {
    private int errorCode;

    public BaseException() {}

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
