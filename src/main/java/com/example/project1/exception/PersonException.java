package com.example.project1.exception;

public class PersonException extends Exception{

    private final PersonError error;
    private final String message;

    public PersonException(PersonError error) {
        this.error = error;
        this.message = error.message;
    }

    public PersonError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public enum PersonError {
        PERSON_NOT_FOUND("Person not found", 404);

        private final String message;
        private final int code;

        PersonError(String message, int code) {
            this.message = message;
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public int getCode() {
            return code;
        }
    }
}
