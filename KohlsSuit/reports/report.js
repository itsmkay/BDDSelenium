$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/KohlsFeature.feature");
formatter.feature({
  "name": "KohlsSuits",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "AddToCart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launches the kohls website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_launches_the_kohls_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the query and presses enter",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_enetrs_the_query_and_presses_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to the results page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_is_taken_to_the_results_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sorts the results by price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_sorts_the_results_by_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the first item",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_select_the_first_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_is_taken_to_the_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the size",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_select_the_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Add to Cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.user_clicks_on_Add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "item is added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepsToAddSuit.item_is_added_to_the_cart()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Product was added\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat com.cts.stepdefinition.StepsToAddSuit.item_is_added_to_the_cart(StepsToAddSuit.java:68)\r\n\tat ✽.item is added to the cart(file:///D:/Eclipse%20Workspace/KohlsSuit/./src/main/resources/Features/KohlsFeature.feature:12)\r\n",
  "status": "failed"
});
});