package com.example.app

import javafx.scene.layout.VBox
import tornadofx.*

class LoginScreen : View() {
    override val root = VBox()

    init {
        title = "Login"

        with(root){
            addClass(Styles.wrapper)
            hbox {
                label("Username")
                textfield()
            }

            hbox {
                label("Password")
                passwordfield()
            }

            hbox {
                button("Login")
            }

            children.addClass(Styles.row)
        }
    }
}