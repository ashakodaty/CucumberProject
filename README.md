# CucumberProject
This project is developed in Cucumber Framework and Cucumber is tool that supports Behavior Driven Development.
Project Structure:
The Type of Framework I used is BDD with Cucumber by using Page Object Model Design Pattern. It’s a maven project and we configure all the dependencies in Pom.xml file.
As our project is based on cucumber, we maintain a separate folder for Features where we have feature file for every page. In this feature file we have all the scenarios related to every functionality
And we maintain separate package for Step Definitions in src/main/java folder and in this package we maintain separate class file for every page to add the logic for every step that is defined in feature file.
As per the page object model we maintained a class for every webpage. Each webpage has a separate class, and the class holds the locators and corresponding action methods. All these class files are maintained in a specific package called Page objects.
For Example: HomePage, Login Page etc
Next, we have base Class called TestBase which has all reusable methods and also, we initialize the WebDriver in this class.
And we have separate Utility Class that handles the methods which are reusable like capturing screenshots, excel utils, reading excel data and wait methods etc 
Next, we maintain separate package under src/test/java folder for Runner classes. In this runner class we add cucumber options like 
Features= Feature folder name
Glue= test definition package name
Plugin = pretty (Which is used to read the report in console)
Tags= @tagname (which is used to run the scenarios which is having the tag name.
Monochrome=True (Which is used to read the console output properly)
Test data is maintained in Examples in feature files.
And the source code is managed in Github.
We use Jenkins job to run the code every day.
