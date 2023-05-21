# facebookLoginAndSearchAppium
POC for test scenarios regarding facebook mobile app login and search features

In these test cases, we use the Appium Java client to interact with the elements on the Facebook app. We locate the elements using their IDs or text and perform actions such as entering text, clicking buttons, and verifying the expected results.

In the testLogin() test case, we click the "Continue as [Name]" button on the welcome screen, enter the email and password, and click the login button. We then verify that the News Feed screen is displayed after the login is completed.

In the testSearch() test case, we click the search button, enter a search query, and verify that the search results are displayed.

In the testPost() test case, we click the "What's on your mind?" box, enter a post, and click the post button. We then wait for the post to be published and verify that it's displayed on the News Feed screen.

Note that these test cases are just examples and you may need to modify them further to suit your specific testing needs. Also, make sure to provide valid login credentials in the testLogin() test case to ensure that the login is successful instead of the added POC example.
