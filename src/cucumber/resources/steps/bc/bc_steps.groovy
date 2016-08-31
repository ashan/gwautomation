package steps.bc

import pages.bc.BCLoginPage
import pages.bc.BCAdministrationPage
import static cucumber.api.groovy.EN.*


Given(~/^I am on the BillingCenter login page$/) { ->

    to BCLoginPage
}

When(~/^I enter '(.*)' as the username$/) { String username ->
    page.usernameField = username
}

When(~/^'(.*)' as the password$/) { String password ->
    page.passwordField = password
}

When(~/^click on Login button$/) { ->
    page.loginButton.click()
}

Then(~/^I should be logged in to BillingCenter$/) { ->
    at BCAdministrationPage
}

Then(~/^I should receive an error message$/) { ->
    assert page.errorLabel.text().contains('invalid')
}




