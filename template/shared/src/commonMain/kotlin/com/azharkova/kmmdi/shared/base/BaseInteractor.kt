package com.azharkova.kmmdi.shared.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseInteractor<T : IView>(private val coroutineContext: CoroutineContext) {
    protected lateinit var scope: ModuleCoroutineScope

    fun attachView() {
        scope = ModuleCoroutineScope(coroutineContext)
    }

    fun detachView() {
        scope.viewDetached()
    }
}

class ModuleCoroutineScope(
    context: CoroutineContext
) : CoroutineScope {

    private var onViewDetachJob = Job()
    override val coroutineContext: CoroutineContext = context + onViewDetachJob

    fun viewDetached() {
        onViewDetachJob.cancel()
    }
}
