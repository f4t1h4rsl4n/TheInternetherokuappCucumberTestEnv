$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/artem/IdeaProjects/theinternetherokuappTestProject/src/main/java/features/fate.feature");
formatter.feature({
  "line": 1,
  "name": "Checkboxes in the checkbox page",
  "description": "",
  "id": "checkboxes-in-the-checkbox-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing checkboxes functionality",
  "description": "",
  "id": "checkboxes-in-the-checkbox-page;testing-checkboxes-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks to the Checkboxes link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user sees the Checkboxes text",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks to the first check box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "checkbox will be checked",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks to the second check box",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "checkbox will be unchecked",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user quits the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CheckboxTests.userIshomepage()"
});
formatter.result({
  "duration": 6259268700,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.userClicksToTheCheckboxesLink()"
});
formatter.result({
  "duration": 183003300,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.userSeesTheCheckboxesText()"
});
formatter.result({
  "duration": 30264400,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.userClicksToTheFirstCheckBox()"
});
formatter.result({
  "duration": 61043600,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.isCheckbox1Checked()"
});
formatter.result({
  "duration": 15220100,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.userClicksToTheSecondCheckbox()"
});
formatter.result({
  "duration": 46088600,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.isCheckbox2Checked()"
});
formatter.result({
  "duration": 12035800,
  "status": "passed"
});
formatter.match({
  "location": "CheckboxTests.userQuitsTheBrowser()"
});
formatter.result({
  "duration": 611424800,
  "status": "passed"
});
});