# IDiscovery Project 🍓
--------------------------------------------------
Software Requirement Specification
--------------------------------------------------

### Goals

1. **User-Centric Design:** Develop an application that prioritizes user experience and intuitive navigation.
2. **Sustainable Practices:** Incorporate eco-friendly practices in project development and operations.
3. **Collaborative Innovation:** Partner with creative minds and organizations to enhance the project's offerings.

### Get Involved

Join us in our mission to inspire and explore! Whether you're a developer, designer, or enthusiast, there are many ways to contribute to the IDiscovery Project.

- **Collaborate:** Work with us on exciting projects.
- **Share Ideas:** Contribute your thoughts and suggestions.
- **Follow Our Journey:** Stay updated on our progress and upcoming events.

### Let's Create Together!

Together, we can inspire a generation of explorers and creators. Join us on this exciting journey with the IDiscovery Project!


# Common Playground - Software Requirements Specification 

## Table of contents
- [Table of contents](#table-of-contents)
- [Introduction](#1-introduction)
    - [Purpose](#11-purpose)
    - [Scope](#12-scope)
    - [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [References](#14-references)
    - [Overview](#15-overview)
- [Overall Description](#2-overall-description)
    - [Vision](#21-vision)
    - [Use Case Diagram](#22-use-case-diagram)
	- [Technology Stack](#23-technology-stack)
- [Specific Requirements](#3-specific-requirements)
    - [Functionality](#31-functionality)
    - [Usability](#32-usability)
    - [Reliability](#33-reliability)
    - [Performance](#34-performance)
    - [Supportability](#35-supportability)
    - [Design Constraints](#36-design-constraints)
    - [Online User Documentation and Help System Requirements](#37-on-line-user-documentation-and-help-system-requirements)
    - [Purchased Components](#purchased-components)
    - [Interfaces](#39-interfaces)
    - [Licensing Requirements](#310-licensing-requirements)
    - [Legal, Copyright And Other Notices](#311-legal-copyright-and-other-notices)
    - [Applicable Standards](#312-applicable-standards)
- [Supporting Information](#4-supporting-information)

## 1. Introduction
Discover a world of adventure with our app, designed to turn everyday routines into exciting, memorable experiences!

### 1.1 Purpose
This document outlines the requirements for the City Exploration Application, which provides users with an interactive platform to explore their city through personalized adventures based on selected transportation methods, durations, and tour types.

### 1.2 Scope
The City Exploration Application will cater to a wide audience, including tourists, locals, families, and groups looking for engaging city experiences. Key functionalities will include:
- Transportation method selection (bicycle, walking, public transport)
- Adventure duration selection (1, 2, 3, or 6 hours)
- Tour-type options (normal or game city exploration)
- An interactive city guide featuring dining, sightseeing, and local events
- User profiles for tracking adventure history and achievements


### 1.3 Definitions, Acronyms and Abbreviations
| Abbreviation | Explanation                            |
| ----------- | -------------------------------------- |
| SRS         | Software Requirements Specification    |
| UC          | Use Case                               |
| n/a         | not applicable                         |
| tbd         | to be determined                       |
| UCD         | overall Use Case Diagram               |
| FAQ         | Frequently asked Questions             |

### 1.4 References

| Title                                                                         | Date       | Publishing Organization   |
| ------------------------------------------------------------------------------ |:----------:| ------------------------- |
| City Discovery App Blog                                                       |    -       | wordpress.com              |
| IDiscovery GitHub                                                              |    -       |GitHub                     |
| Project Management                                                             |    -       | YouTrack                  |
| Unified Modeling Language (UML)                                                |    -       | UML Diagrams              |
| Mind Map                                                                      |    -       | Lucidchart                 |
| App Design and Colors                                                         |    -       | Figma                      |
| Gradients Application (used for creating appealing colour schemes for design) |    -       | Gradients                   |
| Use Case Diagram (UCD)                                                       |    -       |    draw.io                  |


### 1.5 Overview

This document outlines both functional and non-functional requirements for the City Exploration Application. It describes the application's operation, key features, and user interactions. Additionally, it details the development environment, project management tools, and testing frameworks that will be utilized to ensure the successful implementation of the application. By providing this structured approach, the SRS aims to serve as a guide for developers and stakeholders throughout the development lifecycle.

    
## 2. Overall Description

### 2.1 Vision

- **Empower Exploration:** Encourage users to discover new places and experiences through engaging technology.
- **Inspire Creativity:** Provide tools and resources that spark creativity and innovation in every individual.
- **Foster Community:** Build a supportive community that shares knowledge, experiences, and inspiration.

### 2.2 Use Case Diagram


![UCD drawio (1)](https://github.com/user-attachments/assets/8189df5b-dc20-469a-8848-099430f5b405)


- Green:  3rd Semester
- Yellow: 4th semester

### 2.3 Technology Stack
The technology we use is:

![WhatsApp Image 2024-09-29 at 13 54 27](https://github.com/user-attachments/assets/3edc7228-b56d-4e5a-9530-41207abf5a09)

## 1. Development Environment

### 1.1 Backend Development

#### Java Development Kit (JDK)
- **Purpose**: Provides the Java compiler and runtime environment for developing Java applications.
- **Download**: [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [OpenJDK](https://openjdk.java.net/install/).

#### Version Control
- **Git**: A distributed version control system to manage source code changes.
  - **Tools**: Git can be used via command line or with GUI tools like GitHub Desktop, and Sourcetree, or integrated directly into IDEs.

#### Database
- **SQLite**: A lightweight database for storing data locally within the app.
  - **Usage**: Can be accessed directly through the Android framework.

#### Testing Frameworks
- **JUnit**: A framework for unit testing Java applications.
  - **Usage**: For writing and running tests on your Java code.
- **Espresso**: Used for writing UI tests for Android applications.
  - **Usage**: Ensures the application’s UI behaves as intended.

#### Documentation Tools
- **Javadoc**: A tool for generating API documentation from comments in your source code.
  - **Usage**: Helps users understand how to use various components of your app.

### 1.2 Frontend Development

#### Integrated Development Environment (IDE)
- **Recommended IDE**: 
  - **Android Studio**: The official IDE for Android development, which includes a built-in emulator and access to Google APIs.
  - **Eclipse**: An open-source IDE option for Java development.
  - **IntelliJ IDEA**: Popular for its intelligent code completion and support for multiple languages.

#### Google APIs
- **Google Maps API**: Provides services for displaying maps, routing, and adding location-based features to your app.
  - **Setup**: Requires an API key through the Google Cloud Console.
- **Google Play Services**: Provides access to location services and other APIs.
  - **Usage**: Include relevant dependencies in your `build.gradle` file.

#### Additional Libraries (Optional)
- **Glide or Picasso**: Libraries for loading and caching images efficiently in Android applications.
  - **Usage**: Useful if your app displays lots of images (e.g., attraction photos).
- **Room Database**: Part of Android Architecture Components, it provides an abstraction layer over SQLite for easier database management.
  - **Usage**: Helps manage local data storage in a more structured way.

### 1.3 API Development

#### Project Management and Build Tool
- **Gradle**: A build automation tool for Android projects that manages dependencies and compiles the app.
  - **Usage**: Included with Android Studio; ensure to configure your project’s `build.gradle` file.

#### API Development and Testing Tools
- **Postman**: A tool for testing APIs, aiding in development and debugging.
  - **Usage**: Can simulate requests and responses when integrating back-end services.

#### Communication and Collaboration Tools
- **Slack or Microsoft Teams**: For team communication and collaboration, sharing ideas, and daily updates.
- **Trello or JIRA**: Project management tools to track tasks, issues, and project progress.

### 1.4 Tools for First Level
- **JDK**: For Java development.
- **Android Studio**: IDE for writing, testing, and debugging your app.
- **Git**: For version control and collaboration.
- **Gradle**: For building projects and managing dependencies.
- **Google Maps API**: For map features in your application.
- **SQLite**: For local data storage needs.
- **JUnit**: For basic testing functionalities.
- **Postman**: For API testing.
- **Javadoc**: For generating code documentation.


## 3. Specific Requirements

### 3.1 Functionality
This section will explain the different use cases, you could see in the Use Case Diagram, and their functionality(TBD).  

#### 3.1.1 Posting a session
(TBD).

[Posting a session](TBD)

#### 3.1.2 Getting an overview
(TBD)

[Session overview]((TBD))

#### 3.1.3 Creating an account
To identify all users we need an account system. This account system enables us to build important functions such as joining a session, leaving a session or a personalized overview of all sessions (Keeping track of your sessions).

[Create an account]((TBD))

#### 3.1.4 Logging in
The app will provide the possibility to register and log in. This will also make usability easier when a user wants to manage his sessions, post or join a session because they don't have to enter their mail address every time.

[Login]((TBD))

#### 3.1.5 Logging out
In case you share your phone, have multiple accounts or just want to be cautious about your privacy you should be able to manually log out.

[Logout]((TBD))

#### 3.1.6 Joining a session
(TBD).

[Join a session](TBD)

#### 3.1.7 Keeping track of your sessions
(TBD).

[Keeping track of your sessions](.TBD)

#### 3.1.8 Leaving a session
(TBD).

[Leaving a session]((TBD))

#### 3.1.9 Finding a session
(TBD).
[Finding a session](TBD)

#### 3.1.10 Getting in touch
(TBD)
[Getting in Touch](TBD)

#### 3.1.11 Presenting yourself and checking out others
(TBD.)


#### 3.1.12 Reporting users and managing friends
(TBD).

#### 3.1.13 Banning users and deleting posts
(TBD).


### 3.2 Usability
(TBD).


#### 3.2.1 No training time needed
(TBD).

#### 3.2.2 Familiar Feeling
(TBD).


### 3.3 Reliability
(TBD).

#### 3.3.1 Availability
(TBD).

#### 3.3.2 Defect Rate
(TBD).

### 3.4 Perfomance

#### 3.4.1 Capacity
(TBD).

#### 3.4.2 Storage 
(TBD).

#### 3.4.3 App perfomance / Response time
(TBD).

### 3.5 Supportability

#### 3.5.1 Coding Standards
(TBD).

#### 3.5.2 Testing Strategy
### 3.5.2 Testing Strategy

A comprehensive testing strategy will ensure the quality and functionality of the mobile application, focusing on both core features and user experience.

#### 1. Unit Testing
- **Framework**: JUnit
- **Purpose**: Validate individual components and methods.

#### 2. Integration Testing
- **Framework**: JUnit and Espresso
- **Purpose**: Ensure modules work together as intended.

#### 3. User Interface (UI) Testing
- **Framework**: Espresso
- **Purpose**: Verify UI elements and user interactions.

#### 4. Functional Testing
- **Purpose**: Confirm the app meets specified requirements.

#### 5. Performance Testing
- **Purpose**: Assess app responsiveness under various conditions.

#### 6. Security Testing
- **Purpose**: Validate security measures and data protection.

#### 7. User Acceptance Testing (UAT)
- **Purpose**: Gather feedback from actual users for improvements.

#### 8. Regression Testing
- **Purpose**: Ensure new changes do not affect existing functionalities.

### Conclusion
This strategy will help deliver a reliable, user-friendly mobile application that meets project objectives.


### 3.6 Design Constraints

Design constraints define the limitations for developing the mobile application:

1. **Platform Compatibility**: Must support Android and iOS, accommodating various screen sizes.
2. **Performance**: App should load within 3 seconds and optimize memory usage.
3. **User Interface**: Follow platform-specific design guidelines for consistency.
4. **Accessibility**: Comply with WCAG standards, offering features like text-to-speech.
5. **Security**: Implement encryption and secure authentication, adhering to data protection regulations.
6. **Third-Party Dependencies**: Use well-maintained libraries compatible with the app.
7. **Budget**: Adhere to the allocated budget and project timeline.

### Conclusion
These constraints ensure a functional, user-friendly, and compliant mobile application.


### 3.7 On-line User Documentation and Help System Requirements
(TBD).

### 3.8 Purchased Components
(TBD).

### 3.9 Interfaces

#### 3.9.1 User Interfaces
### 3.9.1 User Interfaces

This section outlines the key user interfaces for the mobile application, focusing on usability and functionality.

#### 1. Home Page
- **Features**: Personalized greeting, Explore Now button, navigation bar (Home, City Guide, Profile, Settings).

#### 2. Adventure Selection Page
- **Features**: Transportation method selection (icons), duration selection (buttons/slider), tour type selection (toggle buttons).

#### 3. Modes of Play Page
- **Features**: Options for group modes (closed, online, build a group), single-player, family mode, and middle player only mode.

#### 4. City Guide Page
- **Features**: Sections for Eat & Drink (ratings/photos), sightseeing (map view), transportation info, and local activities.

#### 5. Interactive Map Page
- **Features**: Full-screen interactive map with markers for attractions, dining, and transport routes, with detailed views for each location.

#### 6. User Profile Page
- **Features**: Account management, adventure history, achievements, and options to interact with others.

#### 7. Notifications Page
- **Features**: Alerts for events, group messages, and zone exit notifications.

#### 8. Feedback and Support Page
- **Features**: Customer support contact, feedback form, and FAQs.

#### 9. Settings Page
- **Features**: App settings customization, help, and FAQs.

### Conclusion
These user interfaces aim to provide a seamless and engaging experience for users throughout the application.


#### 3.9.2 Hardware Interfaces
(n/a)

### 3.9.3 Software Interfaces
- [TBD.]

### 3.9.4 Communication Interfaces
- [TBD.]

### 3.10 Licensing Requirements
- [TBD.]

### 3.11 Legal, Copyright, and Other Notices
- [TBD.]

### 3.12 Applicable Standards
- [TBD.]


## 4. Supporting Information

For any further information, you can contact the I Discovery team or check our [I Discovery Blog](https://citydiscoveryapp.wordpress.com). 

The Team Members are:
- Nilgün Kurtar.
- Sarah Elhanbaly.
- Ehsan Goodarzi.

For more about our team, visit [Our Team](https://citydiscoveryapp.wordpress.com/2024/09/16/our-team/).



<!-- Picture-Link definitions: -->
[OUCD]: tbd
