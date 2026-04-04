package com.pengrad.telegrambot.model.request;

import java.io.Serializable;

public class KeyboardButtonRequestManagedBot implements Serializable {
    private final static long serialVersionUID = 0L;

    private Integer request_id;
    private String suggested_name;
    private String suggested_username;

    public KeyboardButtonRequestManagedBot(Integer requestId) {
        this.request_id = requestId;
    }

    public KeyboardButtonRequestManagedBot suggestedName(String suggestedName) {
        this.suggested_name = suggestedName;
        return this;
    }

    public KeyboardButtonRequestManagedBot suggestedUsername(String suggestedUsername) {
        this.suggested_username = suggestedUsername;
        return this;
    }

}
