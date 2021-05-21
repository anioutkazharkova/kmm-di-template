package com.azharkova.kmmdi.shared.factory

import com.azharkova.kmmdi.shared.base.IInteractor
import com.azharkova.kmmdi.shared.base.IView

interface IConfigurator {
    fun create(view: IView): IInteractor?
}

class ModuleConfig {
    companion object {
        val instance = ModuleConfig()
    }

    fun config(view: IView): IInteractor? {
        return null
    }
}
