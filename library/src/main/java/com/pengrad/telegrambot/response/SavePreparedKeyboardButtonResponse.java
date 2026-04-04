package com.pengrad.telegrambot.response;

import com.pengrad.telegrambot.model.PreparedKeyboardButton;

public class SavePreparedKeyboardButtonResponse extends BaseResponse {

    private PreparedKeyboardButton result;

    public PreparedKeyboardButton result() {
        return result;
    }

    @Override
    public String toString() {
        return "SavePreparedKeyboardButtonResponse{" +
                "result=" + result +
                ", base=" + super.toString() +
                '}';
    }
}
