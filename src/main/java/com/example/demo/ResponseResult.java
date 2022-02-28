package com.example.demo;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;

    private boolean success;

    private String message;

    private T value;
}



