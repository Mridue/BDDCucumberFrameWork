$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 7512823386,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login-feature;login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is in Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on login icon",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter invalid userID and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Unable to Login with Error Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_in_Homepage()"
});
formatter.result({
  "duration": 258767612,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_icon()"
});
formatter.result({
  "duration": 107198687,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_invalid_userID_and_Password()"
});
formatter.result({
  "duration": 547372582,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.unable_to_Login_with_Error_Message()"
});
formatter.result({
  "duration": 6586818162,
  "status": "passed"
});
formatter.after({
  "duration": 1464837278,
  "status": "passed"
});
formatter.before({
  "duration": 5585281649,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login with valid credentials",
  "description": "",
  "id": "login-feature;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is in Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User click on login icon",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter valid userID and Password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Unable to Login with Error Message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_in_Homepage()"
});
formatter.result({
  "duration": 12694101,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_icon()"
});
formatter.result({
  "duration": 241142685,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_userID_and_Password()"
});
formatter.result({
  "duration": 571059773,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.unable_to_Login_with_Error_Message()"
});
formatter.result({
  "duration": 6468504040,
  "status": "passed"
});
formatter.after({
  "duration": 981396310,
  "status": "passed"
});
});