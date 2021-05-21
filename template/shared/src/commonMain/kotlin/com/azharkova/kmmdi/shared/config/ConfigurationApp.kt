package com.azharkova.kmmdi.shared.config

import com.azharkova.kmmdi.shared.di.DIManager

class ConfigurationApp {
    val appContainer: DIManager = DIManager()

    init {
        setup()
    }

    fun setup() {
        // TODO: add here your dependencies
    }
}
