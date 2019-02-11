package com.github.insanusmokrassar.TelegramBotAPI.types.InlineQueries.InlineQueryResult.abstracts.results.audio

import com.github.insanusmokrassar.TelegramBotAPI.CommonAbstracts.Performerable
import com.github.insanusmokrassar.TelegramBotAPI.types.InlineQueries.InlineQueryResult.abstracts.*

interface InlineQueryResultAudio : InlineQueryResultAudioCommon, UrlInlineQueryResult, DuratedInlineResultQuery, Performerable, TitledInlineQueryResult