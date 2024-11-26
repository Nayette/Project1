package com.example.project1.exception;

public class CommandException extends Exception {

    private final CommandError error;
    private final String message;

    public CommandException(CommandError commandError) {
        this.error = commandError;
        this.message = commandError.message;
    }

    public CommandError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public enum CommandError {
        COMMAND_NOT_FOUND("Command not found", 404);

        private final String message;
        private final int code;

        CommandError(String message, int code) {
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
