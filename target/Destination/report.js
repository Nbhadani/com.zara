$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/compare.feature");
formatter.feature({
  "name": "User should be able to compare two different products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to compare two different products successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@compare"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Book category",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_click_on_Book_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Add to Compare for product Fahrenheit by Ray Bradbury",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_Click_on_Add_to_Compare_for_product_Fahrenheit_by_Ray_Bradbury()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Book category",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_click_on_Book_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Add to Compare for product First Prize Pies",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_Click_on_Add_to_Compare_for_product_First_Prize_Pies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Product comparision on Popup Bar",
  "keyword": "And "
});
formatter.match({
  "location": "org.example.CompareStepDefs.user_Click_on_Product_comparision_on_Popup_Bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Compare Products message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.CompareStepDefs.compare_Products_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});