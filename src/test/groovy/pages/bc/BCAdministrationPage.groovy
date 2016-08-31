package pages.bc

import geb.Page
import pages.gebextensions.BCBasePage

class BCAdministrationPage extends BCBasePage {
    static at = {defaultSelectedMenu.text() == "Administration" }
    static content = {
        defaultSelectedMenu(wait: true) { $("a", class: "gw-top-menu-selected") }
    }
}
