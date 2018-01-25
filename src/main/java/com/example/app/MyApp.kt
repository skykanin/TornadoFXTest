package com.example.app

import tornadofx.App
import tornadofx.importStylesheet
import tornadofx.reloadStylesheetsOnFocus

class MyApp: App() {
    override val primaryView = LoginScreen::class

    init {
        importStylesheet(Styles::class)
        reloadStylesheetsOnFocus()
    }
}