package pages.bc

import geb.Page
import pages.gebextensions.BCBasePage

class BCLoginPage extends BCBasePage{
    static at = {loginButton != null}
    static content = {
        loginButton(wait:true)  {$("a", id: "Login:LoginScreen:LoginDV:submit")}
        usernameField(wait:true) {$("input", id:"Login:LoginScreen:LoginDV:username-inputEl")}
        passwordField(wait:true) {$("input", id:"Login:LoginScreen:LoginDV:password-inputEl")}
        errorLabel(wait:true){$("label", id:"Login:LoginScreen:0")}
    }
}
