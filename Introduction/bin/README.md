Notes from training

- Every object may not have an ID, className or name - Xpath and CSS preferred method as locators
- Alpha numeric id may vary on refresh. Verify before using
- Confirm the link object with anchor "a" tag
- Classes should not have spaces - You will get an error "Compound classes cannot be accepted
- Multiple values - Selenium identifies the first element it finds - Scans from top-left down
- Double quotes inside double quotes are not accepted
- Xpath/CSS can be defined in a nubmer of ways
- Rightclick copy on blue highlighted html code to generate xpath
- Firepath depricated from FireFox
- When Xpath starts with "html" (FireFox issue) - Switch to another browser to get correct Xpath
- There is no direct way to get CSS in chrome. you need to get it from the toolbar
- Degrade browser to less firefox 55 for Firepath
- Use $x("XpathInfo") to validate XPath . Use $("CSS Selector") to validate CSS.
- Place a " . " before a class name to change to CSS
	- You will need to remove the spaces in the code and replace them with " . "
- Place a " # " before an ID to change to css
	- You will need to remove the spaces in the code and replace them with " . "

- //tagName[@attribute='value'] <--Syntax to use for creating an Xpath
	- Regular expression syntax: //tagName[contains(@attribute,'value')] <-- If there are no unique identifiers
		- Example: //input[contains(@name, 'username')]
- tagName[attribute='value'] <--Syntax to use for creating CSS Selector
	- Regular expression syntax: tagName[Attribute*='value']
		- Example: input[name*='username']
	- Alternate Syntax for CSS Selector:
		- tagName#id
		- input#username
		- tagname.classname
		- #input

Example Inner HTML
"<" input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2" ">"

input = TagName
type = Attribute
value = "Log In"

name = Attribute
email = value

//input[@value='Log In'] <--"Log In" button

//input[@type='email'] <--"Email" input field

//*[@id='pass'] <--"Password" input field


- Parent/Child relationship
- Define xpath for parent/tagnames
	- Example:
		- //div[@class='1st-c']/div/div[2]/div/input

- Relative xPath does not depend on parent nodes
- Absolute xPath requires traversing from the parent node, to the targeted selector
- The biggest difference between xPath and CSS is that you can go backwards with xPath, but not with CSS
- Access element with text:  //*[text()=' Selenium ']
- Static Dropdown with Select Library
- Using Parent/Child Relationships for Dynamic Dropdowns with indexes
	- To NOT use indexes when identifying elements:
		- Locate the parent node
		- Get the id for the parent node
		- Locate the target element and get the xPath for it
		- Combine both in the code with a single space between them
			- Example: //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//td[@class='mapbg'] //a[@value='BLR']

- AutoSuggestive Dropdowns
- Radio Buttons
	- I was unable to use the xPath to find the element, but managed to use the CSS Selector to get the test to pass
	- See code for additional notes
- Alerts 
	- Use ".switch()" to switch from selecting HTML to Alert box elements
	- Use ".accept()" Accept, ok, done, yes
	- Use ".dismiss()" Decline, cancel, return, no
- Checkboxes
	- Utilized standard procedures to locate and click on check boxes (very similar to radio buttons)
- Assertions	
	- TestNG is one of the frameworks used with Selenium
- Synchronization in Selenium
	- Best way to utilize waits is to use both Implicit and Explicit in tests
	- Implicit Wait: Globally tells the test to wait for a number of seconds before throwing an exception
		- Example: driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //invoke implicit wait
	- Explicit Wait: Tells the test to wait for a number of seconds with specific conditions
		- Example: WebDriverWait d = new WebDriverWait(driver , 20); //invoke explicit wait
		- Example cont: d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Enter URL Link locator"))); //Direct Wait to target item
	- Thread.Sleep:	This is part of Java and not Selenium. It ignores all other instructions and will only halt execution of the code. Not used in Selenium testing
	- Fluent Wait

- Actions
	- Utilize the "Actions" method to gain access to more specific mouse and keyboard functions
	- such as Right-click, Double-click, AllCaps, etc.
		- This also allows you to access "on-hover" elements
	- MUST END WITH " .build().perform(); "! this will build the action and execute it

- Multiple Windows
	- See "MultipleWindows.java" for more detailed notes
	- Utilizing the "Set" method in Java allows you assign multiple windows to an array and 
	- access them via their key/value pairs

- Iframes
	- Iframes require you to switch from the parent window to the iframe using the "switch.frame()" method
	- then enter your selector code
	
- Calendars
	- With multiple attributes that have the same value, you need to go to the parent node and then traverse to 
	- the target element
- AutoSuggestiveDropdowns
	- One of the drawbacks of Selenium is that it cannot identify hidden elements. In order to do this
	- Javascript DOM is needed
	- Investigate the properteis of an object if it has hidden text
	- Utilize Selenium's "JavascriptExecutor" to identify selected hidden text
	- Example: JavascriptExecutor js = (JavascriptExecutor)driver;
			- String script = "return document.getElementById(\"fromPlaceName\").value;";
			- String text = (String) js.executeScript(script);
	- Alternative solution would be to use the " .getAttribute("value") " method to get the same result
	
	
	
	
	
	
	