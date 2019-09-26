package com.cpp.bibleuniversity.demo.Exceptions.Response;

public class DatabaseNotFoundExceptionResponse {
    private String DatabaseNotFound;

    public DatabaseNotFoundExceptionResponse(String databaseNotFound) {
        DatabaseNotFound = databaseNotFound;
    }

    public String getDatabaseNotFound() {
        return DatabaseNotFound;
    }

    public void setDatabaseNotFound(String databaseNotFound) {
        DatabaseNotFound = databaseNotFound;
    }
}
