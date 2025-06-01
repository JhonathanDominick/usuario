package com.javanauta.aprendendo_spring.infrastructure.exceptions;

public class ConflitException extends RuntimeException{

    public ConflitException(String mensagem){

        super(mensagem);
    }

    public ConflitException(String mesagem, Throwable throwable){

        super(mesagem);
    }
}
