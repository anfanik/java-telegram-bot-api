package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

/**
 * Stas Parshin
 * 07 May 2016
 */
public class AnswerCallbackQuery extends BaseRequest<AnswerCallbackQuery> {

    public AnswerCallbackQuery(String callbackQueryId) {
        super(BaseResponse.class);
        add("callback_query_id", callbackQueryId);
    }

    public AnswerCallbackQuery text(String text) {
        return add("text", text);
    }

    public AnswerCallbackQuery showAlert(boolean showAlert) {
        return add("show_alert", showAlert);
    }

}