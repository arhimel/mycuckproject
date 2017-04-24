$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/java/MyMaven/com/mycucumberproject/Mercuery.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "Register to a page",
  "description": "I want to go to mypage and regiter",
  "id": "register-to-a-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Positive Registration",
  "description": "",
  "id": "register-to-a-page;positive-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@MercuryRegtest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I go to \"mercuryUrl\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click the \"registration_Link\" Element",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"MD\" in \"firstname_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"Rasul\" in \"lastname_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"id\" in \"id_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"password\" in \"password_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Confirmpassword\" in \"Confirmpassword_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click the \"submit_Button\" Element",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I validate \"Register: Mercury Tours\" Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I validate Text \"Dear MD Rasul,\" on \"MercuryWellComeCusomer_Lavel\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "mercuryUrl",
      "offset": 9
    }
  ],
  "location": "commonsteps.i_go_to(String)"
});
formatter.result({
  "duration": 4262617831,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "registration_Link",
      "offset": 13
    }
  ],
  "location": "AllOtherSteps.i_click_the_Element(String)"
});
formatter.result({
  "duration": 6793810159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MD",
      "offset": 9
    },
    {
      "val": "firstname_inputBox",
      "offset": 17
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1224604781,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rasul",
      "offset": 9
    },
    {
      "val": "lastname_inputBox",
      "offset": 20
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1222197120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "id",
      "offset": 9
    },
    {
      "val": "id_inputBox",
      "offset": 17
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1193866645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    },
    {
      "val": "password_inputBox",
      "offset": 23
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1245237048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Confirmpassword",
      "offset": 9
    },
    {
      "val": "Confirmpassword_inputBox",
      "offset": 30
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1314033439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "submit_Button",
      "offset": 13
    }
  ],
  "location": "AllOtherSteps.i_click_the_Element(String)"
});
formatter.result({
  "duration": 7143066203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register: Mercury Tours",
      "offset": 12
    }
  ],
  "location": "AllOtherSteps.i_validate_Page_Title(String)"
});
formatter.result({
  "duration": 8954203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dear MD Rasul,",
      "offset": 17
    },
    {
      "val": "MercuryWellComeCusomer_Lavel",
      "offset": 37
    }
  ],
  "location": "AllOtherSteps.i_validate_Text(String,String)"
});
formatter.result({
  "duration": 48907155,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Positive Login",
  "description": "",
  "id": "register-to-a-page;positive-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@PositiveLogin"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I go to \"mercuryUrl\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I enter \"arhimel\" in \"userid_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter \"mayaaa\" in \"User_password_inputBox\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click the \"login_Button\" Element",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I validate \"Find a Flight: Mercury Tours:\" Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I validate Text \"Flight  Details\" on \"FlightDetails_Lavel\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "mercuryUrl",
      "offset": 9
    }
  ],
  "location": "commonsteps.i_go_to(String)"
});
formatter.result({
  "duration": 2150611454,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arhimel",
      "offset": 9
    },
    {
      "val": "userid_inputBox",
      "offset": 22
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1209034324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mayaaa",
      "offset": 9
    },
    {
      "val": "User_password_inputBox",
      "offset": 21
    }
  ],
  "location": "AllOtherSteps.i_enter_in(String,String)"
});
formatter.result({
  "duration": 1181367495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login_Button",
      "offset": 13
    }
  ],
  "location": "AllOtherSteps.i_click_the_Element(String)"
});
formatter.result({
  "duration": 7855960041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Flight: Mercury Tours:",
      "offset": 12
    }
  ],
  "location": "AllOtherSteps.i_validate_Page_Title(String)"
});
formatter.result({
  "duration": 7837730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flight  Details",
      "offset": 17
    },
    {
      "val": "FlightDetails_Lavel",
      "offset": 38
    }
  ],
  "location": "AllOtherSteps.i_validate_Text(String,String)"
});
formatter.result({
  "duration": 52066951,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat MyMaven.com.mycucumberproject.AllOtherSteps.i_validate_Text(AllOtherSteps.java:69)\n\tat ✽.And I validate Text \"Flight  Details\" on \"FlightDetails_Lavel\"(main/java/MyMaven/com/mycucumberproject/Mercuery.feature:27)\n",
  "status": "failed"
});
});