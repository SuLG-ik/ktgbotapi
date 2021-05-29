package dev.inmo.tgbotapi.extensions.api.send.polls

import dev.inmo.tgbotapi.bot.TelegramBot
import dev.inmo.tgbotapi.requests.send.polls.SendQuizPoll
import dev.inmo.tgbotapi.requests.send.polls.SendRegularPoll
import dev.inmo.tgbotapi.types.ChatIdentifier
import dev.inmo.tgbotapi.types.MessageIdentifier
import dev.inmo.tgbotapi.types.ParseMode.ParseMode
import dev.inmo.tgbotapi.types.buttons.KeyboardMarkup
import dev.inmo.tgbotapi.types.chat.abstracts.Chat
import dev.inmo.tgbotapi.types.message.abstracts.Message
import dev.inmo.tgbotapi.types.polls.*

suspend fun TelegramBot.sendRegularPoll(
    chatId: ChatIdentifier,
    question: String,
    options: List<String>,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    allowMultipleAnswers: Boolean = false,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = execute(
    SendRegularPoll(
        chatId, question, options, isAnonymous, isClosed, allowMultipleAnswers, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
    )
)
suspend fun TelegramBot.sendRegularPoll(
    chatId: ChatIdentifier,
    poll: RegularPoll,
    isClosed: Boolean = false,
    question: String = poll.question,
    options: List<String> = poll.options.map { it.text },
    isAnonymous: Boolean = poll.isAnonymous,
    allowMultipleAnswers: Boolean = poll.allowMultipleAnswers,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendRegularPoll(chatId, question, options, isAnonymous, isClosed, allowMultipleAnswers, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup)

suspend fun TelegramBot.sendRegularPoll(
    chat: Chat,
    question: String,
    options: List<String>,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    allowMultipleAnswers: Boolean = false,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendRegularPoll(
    chat.id, question, options, isAnonymous, isClosed, allowMultipleAnswers, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend fun TelegramBot.sendRegularPoll(
    chat: Chat,
    poll: RegularPoll,
    isClosed: Boolean = false,
    question: String = poll.question,
    options: List<String> = poll.options.map { it.text },
    isAnonymous: Boolean = poll.isAnonymous,
    allowMultipleAnswers: Boolean = poll.allowMultipleAnswers,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendRegularPoll(
    chat.id, question, options, isAnonymous, isClosed, allowMultipleAnswers, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)


suspend fun TelegramBot.sendQuizPoll(
    chatId: ChatIdentifier,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = execute(
    SendQuizPoll(
        chatId, question, options, correctOptionId, isAnonymous, isClosed, explanation, parseMode, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
    )
)

suspend fun TelegramBot.sendQuizPoll(
    chat: Chat,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chat.id, question, options, correctOptionId, isAnonymous, isClosed, explanation, parseMode, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend fun TelegramBot.sendQuizPoll(
    chatId: ChatIdentifier,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chatId, question, options, correctOptionId, isAnonymous, isClosed, explanation, parseMode, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend fun TelegramBot.sendQuizPoll(
    chat: Chat,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chat.id, question, options, correctOptionId, isAnonymous, isClosed, explanation, parseMode, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)


suspend inline fun TelegramBot.sendQuizPoll(
    chatId: ChatIdentifier,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = execute(
    SendQuizPoll(
        chatId, question, options, correctOptionId, isAnonymous, isClosed, entities, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
    )
)

suspend inline fun TelegramBot.sendQuizPoll(
    chat: Chat,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chat.id, question, options, correctOptionId, isAnonymous, isClosed, entities, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend inline fun TelegramBot.sendQuizPoll(
    chatId: ChatIdentifier,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chatId, question, options, correctOptionId, isAnonymous, isClosed, entities, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend inline fun TelegramBot.sendQuizPoll(
    chat: Chat,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    replyToMessageId: MessageIdentifier? = null,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(
    chat.id, question, options, correctOptionId, isAnonymous, isClosed, entities, closeInfo, disableNotification, replyToMessageId, allowSendingWithoutReply, replyMarkup
)

suspend inline fun TelegramBot.replyWithRegularPoll(
    to: Message,
    question: String,
    options: List<String>,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    allowMultipleAnswers: Boolean = false,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendRegularPoll(to.chat, question, options, isAnonymous, isClosed, allowMultipleAnswers, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)

suspend inline fun TelegramBot.replyWithRegularPoll(
    to: Message,
    poll: RegularPoll,
    isClosed: Boolean = false,
    question: String = poll.question,
    options: List<String> = poll.options.map { it.text },
    isAnonymous: Boolean = poll.isAnonymous,
    allowMultipleAnswers: Boolean = poll.allowMultipleAnswers,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendRegularPoll(to.chat, poll, isClosed, question, options, isAnonymous, allowMultipleAnswers, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)

suspend inline fun TelegramBot.replyWithQuizPoll(
    to: Message,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(to.chat, question, options, correctOptionId, isAnonymous, isClosed, explanation, parseMode, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)

suspend inline fun TelegramBot.replyWithQuizPoll(
    to: Message,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    explanation: String? = null,
    parseMode: ParseMode? = null,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(to.chat, isClosed, quizPoll, question, options, correctOptionId, isAnonymous, explanation, parseMode, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)

suspend inline fun TelegramBot.replyWithQuizPoll(
    to: Message,
    question: String,
    options: List<String>,
    correctOptionId: Int,
    isAnonymous: Boolean = true,
    isClosed: Boolean = false,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(to.chat, question, options, correctOptionId, isAnonymous, isClosed, entities, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)

suspend inline fun TelegramBot.replyWithQuizPoll(
    to: Message,
    isClosed: Boolean = false,
    quizPoll: QuizPoll,
    question: String = quizPoll.question,
    options: List<String> = quizPoll.options.map { it.text },
    correctOptionId: Int = quizPoll.correctOptionId ?: error("Correct option ID must be provided by income QuizPoll or by developer"),
    isAnonymous: Boolean = quizPoll.isAnonymous,
    entities: List<dev.inmo.tgbotapi.types.MessageEntity.textsources.TextSource>,
    closeInfo: ScheduledCloseInfo? = null,
    disableNotification: Boolean = false,
    allowSendingWithoutReply: Boolean? = null,
    replyMarkup: KeyboardMarkup? = null
) = sendQuizPoll(to.chat, isClosed, quizPoll, question, options, correctOptionId, isAnonymous, entities, closeInfo, disableNotification, to.messageId, allowSendingWithoutReply, replyMarkup)
