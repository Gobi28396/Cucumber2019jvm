$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/search.feature");
formatter.feature({
  "name": "to validate search functionality of kogan site",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user in kogan home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefine.user_in_kogan_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "to verify search with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enters \"iphone7\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefine.user_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.user_clicks_search_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.steps.StepDefine.user_clicks_search_button(StepDefine.java:32)\r\n\tat ✽.user clicks search button(src/test/resources/features/search.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});