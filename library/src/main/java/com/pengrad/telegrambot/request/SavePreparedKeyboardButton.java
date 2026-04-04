package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.response.SavePreparedKeyboardButtonResponse;

public class SavePreparedKeyboardButton extends BaseRequest<SavePreparedKeyboardButton, SavePreparedKeyboardButtonResponse> {

    public SavePreparedKeyboardButton(long userId, KeyboardButton button) {
        super(SavePreparedKeyboardButtonResponse.class);
        add("user_id", userId);
        add("button", button);
    }
}
