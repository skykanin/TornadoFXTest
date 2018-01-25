package com.example.app

import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val wrapper by cssclass()
        val row by cssclass()
    }

    init {
        val flat = mixin {
            backgroundInsets += box(0.px)
        }

        s(wrapper) {
            s(label) {
                minWidth = 100.px
            }

            padding = box(15.px)

            s(row) {
                padding = box(5.px, 5.px)
            }
        }

        s(button, textInput) {
            +flat
        }
    }

}