package pages.bc

import pages.bc.gebextensions.BCBasePage

class BCAdministrationPage extends BCBasePage {
    static at = {defaultSelectedMenu.text() == "Administration" }
    static content = {
        defaultSelectedMenu(wait: true) { $("a", class: "gw-top-menu-selected") }
    }
}
