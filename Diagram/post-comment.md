

### Software Requirements Specification (SRS) for Home Page

**Project Title**: IDiscovery App — Home Page

---

#### 1. Introduction

1.1 **Purpose**  
The purpose of this document is to outline the requirements for the Home Page of the City Exploration App. This includes functional and non-functional requirements, user interface designs, and system interactions.

1.2 **Scope**  
The Home Page serves as the main entry point for users to access various features, including login, search functionalities, and the exploration of the latest spots.

---

#### 2. Overall Description

2.1 **Product Perspective**  
The Home Page will be part of a larger system designed for city exploration, providing users with easy access to features enhancing their exploration experience.

2.2 **User Classes and Characteristics**  
- **Guest Users**: Users who have not logged in and have limited access.
- **Registered Users**: Logged-in users with personalized experiences.

2.3 **Operating Environment**  
The application will be available on web and mobile platforms.

---

#### 3. Functional Requirements

3.1 **Login Functionality**  
- Users must be able to log in to access personalized features.
- The system must validate user credentials and provide appropriate feedback.

3.2 **Menu and Navigation**  
- Display a menu bar with options: Home, City Guide, Profile, Settings.

3.3 **Search Bar**  
- Users should be able to input search queries to find activities or spots.
- Display the relevant search results based on user input.

3.4 **Discover Latest Spots**  
- A section on the Home Page where users can view the latest recommended spots.

---

#### 4. Non-Functional Requirements

4.1 **Performance Requirements**  
- The Home Page must load within 3 seconds on standard connections.

4.2 **Usability Requirements**  
- The UI must be intuitive and easy to navigate for all user classes.
- Ensure accessibility for users with disabilities.

---


#### 5. User Interface Requirements

5.1 **Mockups**  
- Provide visual representations of the Home Page, showing elements such as the login option, menu bar, search bar, and latest spots section.


5.2 **Wireframes**  
- Include wireframes that illustrate the layout and placement of each element on the Home Page.
- 
![5jh9NSLQbcYtmDKqGGiguR](https://github.com/user-attachments/assets/3ea5d62c-ea05-45c6-a999-b83891f2aec6)

5.3 **Activity Diagrams**  
- Attach simplified activity diagrams that depict user interactions with the Home Page and corresponding system responses.
![image](https://github.com/user-attachments/assets/e0e33136-b0ad-4335-88d7-2d6f0fd238b9)

https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1#G1WS32qrNiiJdSnXCLWzZzRrRmUw4NtVmT

---

### Mockups and Wireframes
**[Include your mockups and wireframes here]**
- You can either build them directly in Figma and export as images or provide links to the files in the Figma community.

![image](https://github.com/user-attachments/assets/8ad2632a-fee1-4bfb-9343-61bda62aa5c5)

[https://www.figma.com/proto/PbcDTfh1rJfSHkRPgnJqgP/IDiscovery?node-id=45-981&t=JUhs8gbZvqJWzHAD-1

![image](https://github.com/Ehsangood1/IDiscovery/blob/388ff60481ccf2a80e4afdf86d0def71cfade96d/UseCases/Ehsan.drawio.svg)
  
---

### Activity Diagrams
**[Include the activity diagram here]**
- Provide a clear visual representation of user actions versus system activities, either as an image or as links to the diagrams created in your preferred diagramming tool.

---

#### 6. User Story: Create a New Account

**As a** visitor to the site  
**I want** to create a new account  
**In order to** access the application's features  

**Background:**  
- **Given** I am on the homepage  

**Scenarios:**

- **Scenario: Open Account Creation Page**  
  - **Given** I am on the homepage  
  - **When** I click the "Register" button  
  - **Then** I am redirected to the "Create Account" page  

- **Scenario: Enter Valid Data and Create an Account**  
  - **Given** I am on the "Create Account" page  
  - **When** I enter "myusername" in the "Username" field  
  - **And** I enter "myemail@example.com" in the "Email" field  
  - **And** I enter "mypassword" in the "Password" field  
  - **And** I press the "Create Account" button  
  - **Then** I am redirected to the "My Account" page  
  - **And** I receive a "Success" message  

- **Scenario: Enter Invalid Data and Receive Error Message**  
  - **Given** I am on the "Create Account" page  
  - **When** I enter "myusername" in the "Username" field  
  - **And** I enter "invalid-email" in the "Email" field  
  - **And** I enter "short" in the "Password" field  
  - **And** I press the "Create Account" button  
  - **Then** I remain on the "Create Account" page  
  - **And** I receive an "Error" message  

---

#### 7. CRUD Operations for Home Page

**7.1 Create**

- **User Account Creation**  
  - **Functionality**: Users can create a new account to access personalized features.
  - **Process**: Users enter their username, email, and password and submit the form to create the account.

- **Comments/Reviews**  
  - **Functionality**: Users can submit comments or reviews on attractions or places they have visited.
  - **Process**: After selecting an activity or restaurant, users fill out a comment box and submit it.

**7.2 Read**

- **View Home Page**  
  - **Functionality**: Users can view the Home Page at any time, which contains a welcome message, navigation links, and featured content.

- **Display User Profile Information**  
  - **Functionality**: If logged in, users can view their profile details like username and preferences from the Home Page.

- **View Latest Spots**  
  - **Functionality**: Users can see a dynamic list of latest attractions or activities based on their location.

- **View Search Results**  
  - **Functionality**: When users perform a search using the search bar, relevant results for activities, attractions, and restaurants are displayed.

**7.3 Update**

- **Update Profile Information**  
  - **Functionality**: Users can modify their profile information such as email or password.
  - **Process**: Users access their profile section, make changes, and save updates.

- **Edit Comments/Reviews**  
  - **Functionality**: Users can edit their previously submitted comments or reviews.
  - **Process**: After locating their comment, users select an "Edit" option, modify the text, and resubmit.

**7.4 Delete**

- **Delete User Account**  
  - **Functionality**: Users can delete their account, which removes their data from the app.
  - **Process**: Users navigate to account settings and select the option to delete their account, usually confirmed with a prompt.

- **Delete Comments/Reviews**  
  - **Functionality**: Users can delete their comments or reviews.
  - **Process**: Users find their comment or review and select a "Delete" option, usually confirmed with a prompt.

---

#### Summary of CRUD Operations for Home Page

| **Operation** | **Functionality**                 | **Description**                                                      |
|---------------|-----------------------------------|----------------------------------------------------------------------|
| Create        | User Account Creation             | User registers to create a new account.                              |
|               | Comments/Reviews                  | User submits comments or reviews for activities/restaurants.         |
| Read          | View Home Page                    | User accesses the Home Page and its features.                        |
|               | Display User Profile Information  | User views profile details if logged in.                             |
|               | View Latest Spots                 | User sees a dynamic list of latest attractions or activities.        |
|               | View Search Results               | User checks results from the search conducted using the search bar.  |
| Update        | Update Profile Information        | User modifies their profile details.                                 |
|               | Edit Comments/Reviews             | User revises previously submitted comments or reviews.               |
| Delete        | Delete User Account               | User deletes their account, removing all associated data.            |
|               | Delete Comments/Reviews           | User removes their own comments or reviews from the system.          |

#### 7. References

- Figma mockups and wireframes
- Activity diagrams created in [Your Diagram Tool]
- **Balsamiq**: For wireframes [Share Link](https://share.balsamiq.com/c/5jh9NSLQbcYtmDKqGGiguR.jpg)



