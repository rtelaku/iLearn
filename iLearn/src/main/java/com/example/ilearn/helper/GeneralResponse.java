package com.example.ilearn.helper;


import java.io.Serializable;
import java.sql.Timestamp;

public class GeneralResponse<T>  implements Serializable {
    private T data;
    private String message;
    private Timestamp timestamp=new Timestamp(System.currentTimeMillis());
    private int status;
    private String error;
    //builder pattern

    public GeneralResponse(GeneralResponseBuilder generalResponseBuilder){
        this.data=(T)generalResponseBuilder.data;
        this.message=generalResponseBuilder.message;
        this.status=generalResponseBuilder.status;
        this.error=generalResponseBuilder.error;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    //fillimi i builder klases
    public static class GeneralResponseBuilder<T>{
        private T data;
        private String message;
        private int status;
        private String error;

        public GeneralResponseBuilder(int status){
            this.status=status;
        }

        public GeneralResponseBuilder setData(T data) {
            this.data = data;
            return this;
        }

        public GeneralResponseBuilder setMessage(String message) {
            this.message = message;
            return this;
        }

        public GeneralResponseBuilder setError(String error) {
            this.error = error;
            return this;
        }

        public GeneralResponse build(){
            return new GeneralResponse(this);
        }
    }
}
