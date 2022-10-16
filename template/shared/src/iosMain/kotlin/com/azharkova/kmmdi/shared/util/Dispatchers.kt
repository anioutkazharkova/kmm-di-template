package com.azharkova.kmmdi.shared.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue
import kotlin.coroutines.CoroutineContext
import kotlin.native.concurrent.freeze

actual val uiDispatcher: CoroutineContext = Dispatchers.Main
actual val ioDispatcher: CoroutineContext = Dispatchers.Default