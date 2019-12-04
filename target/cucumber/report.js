$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google.feature");
formatter.feature({
  "name": "Google Title verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@back"
    }
  ]
});
formatter.background({
  "name": "Login to Google",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google page",
  "keyword": "When "
});
formatter.match({
  "location": "Google_Steps.user_is_on_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Google Title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back"
    },
    {
      "name": "@googleTitle"
    }
  ]
});
formatter.step({
  "name": "User searches for apples",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_Steps.user_searches_for_apples()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see apples inside of the title",
  "keyword": "And "
});
formatter.match({
  "location": "Google_Steps.user_should_see_apples_inside_of_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Login to Google",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google page",
  "keyword": "When "
});
formatter.match({
  "location": "Google_Steps.user_is_on_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Google title verification with preferred data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back"
    },
    {
      "name": "@new"
    }
  ]
});
formatter.step({
  "name": "User searches for a word \"iphone\"",
  "keyword": "And "
});
formatter.match({
  "location": "Google_Steps.user_searches_for_a_word(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see a word \"iphone\" inside of the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_Steps.user_should_see_a_word_inside_of_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Login to Google",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google page",
  "keyword": "When "
});
formatter.match({
  "location": "Google_Steps.user_is_on_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Google Title Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@back"
    },
    {
      "name": "@dataType"
    }
  ]
});
formatter.step({
  "name": "User tests with words \"apple\" \"pen\" \"paper\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Google_Steps.user_tests_with_words(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks numbers 12 and 55",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_Steps.user_checks_numbers_and(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});