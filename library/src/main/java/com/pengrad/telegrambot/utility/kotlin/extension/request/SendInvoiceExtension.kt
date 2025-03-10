package com.pengrad.telegrambot.utility.kotlin.extension.request

import com.pengrad.telegrambot.TelegramAware
import com.pengrad.telegrambot.model.request.LabeledPrice
import com.pengrad.telegrambot.request.SendInvoice
import com.pengrad.telegrambot.utility.kotlin.extension.execute

fun TelegramAware.sendInvoice(
    chatId: Long,
    title: String,
    description: String,
    payload: String,
    currency: String,
    items: List<LabeledPrice>,
    modifier: SendInvoice.() -> Unit = {}
) = this.execute(SendInvoice(
    chatId = chatId,
    title = title,
    description = description,
    payload = payload,
    currency = currency,
    prices = items
), modifier)

fun TelegramAware.sendInvoice(
    chatId: Long,
    title: String,
    description: String,
    payload: String,
    currency: String,
    vararg items: LabeledPrice,
    modifier: SendInvoice.() -> Unit = {}
) = this.sendInvoice(
    chatId = chatId,
    title = title,
    description = description,
    payload = payload,
    currency = currency,
    items = items.toList(),
    modifier = modifier
)