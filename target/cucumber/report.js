$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/amazon.feature");
formatter.feature({
  "name": "Amazon verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Amazon title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_Steps.user_is_on_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Amazon in title",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_Steps.user_should_see_Amazon_in_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for something",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_Steps.user_searches_for_something()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.fail(Assert.java:95)\n\tat steps.Amazon_Steps.user_searches_for_something(Amazon_Steps.java:25)\n\tat ✽.User searches for something(src/test/resources/features/amazon.feature:7)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Amazon search verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_Steps.user_is_on_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/etsySearch.feature");
formatter.feature({
  "name": "Etsy search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Etsy title verification using search feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etsy Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Etsy_Steps.user_is_on_Etsy_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Wooden Spoon\" in the search box",
  "keyword": "When "
});
formatter.match({
  "location": "Etsy_Steps.user_types_in_the_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "Etsy_Steps.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Wooden Spoon\" is in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Etsy_Steps.user_sees_is_in_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/google.feature");
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
formatter.uri("src/test/resources/features/multipleData.feature");
formatter.feature({
  "name": "Testing with multiple data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@multiple"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes to amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "MultipleData_Steps.user_goes_to_amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies following search departments",
  "rows": [
    {
      "cells": [
        "Alexa Skills"
      ]
    },
    {
      "cells": [
        "Computers"
      ]
    },
    {
      "cells": [
        "Digital Music"
      ]
    },
    {
      "cells": [
        "Courses"
      ]
    },
    {
      "cells": [
        "Baby"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MultipleData_Steps.user_verifies_following_search_departments(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the amazon",
  "keyword": "Then "
});
formatter.match({
  "location": "MultipleData_Steps.user_closes_the_amazon()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat steps.MultipleData_Steps.user_closes_the_amazon(MultipleData_Steps.java:24)\n\tat ✽.User closes the amazon(src/test/resources/features/multipleData.feature:11)\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/mvnrepository.feature");
formatter.feature({
  "name": "Cucumber Java in MVN Repository verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cucumber Java verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@java"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User goes to mvnrepository",
  "keyword": "Given "
});
formatter.match({
  "location": "MVN_Steps.user_goes_to_mvnrepository()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for a word_ \"cucumber java\"",
  "keyword": "And "
});
formatter.match({
  "location": "MVN_Steps.user_searches_for_a_word_(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/wikipedia.feature");
formatter.feature({
  "name": "Wikipedia search feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.background({
  "name": "User searched for given text",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wikipedia search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wikipedia_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wikipedia search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wikipedia_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Title Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the wikipedia title",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_wikipedia_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User searched for given text",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wikipedia search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wikipedia_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wikipedia search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wikipedia_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia header verification using search feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the main header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_main_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User searched for given text",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wikipedia_Steps.user_is_on_Wikipedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Steve Jobs\" in the wikipedia search box",
  "keyword": "When "
});
formatter.match({
  "location": "Wikipedia_Steps.user_types_in_the_wikipedia_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks wikipedia search button",
  "keyword": "And "
});
formatter.match({
  "location": "Wikipedia_Steps.user_clicks_wikipedia_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wikipedia"
    }
  ]
});
formatter.step({
  "name": "User sees \"Steve Jobs\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "Wikipedia_Steps.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});