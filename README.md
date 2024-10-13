Notetaker is a web-based note management application built using Java Servlet, JSP, Hibernate, and front-end technologies like HTML and CSS.
The application aims to provide a simple and effective way to create, organize, and manage notes for personal or professional use.
It combines a dynamic server-side backend with a responsive user interface, making it accessible on both desktop and mobile devices.

Overview
The Notetaker application allows users to:

Create new notes: Add notes with a title and content, providing an organized way to keep track of information.
Edit and delete notes: Modify existing notes or remove them when they are no longer needed.
Tag notes: Use tags to categorize notes, enabling quick filtering and easy retrieval.
Search notes: Utilize the search feature to find notes based on keywords or tags.
Persist data with Hibernate: All notes are stored in a relational database using Hibernate for data management, ensuring that the data is consistent and secure.

Project Structure
The project follows the Model-View-Controller (MVC) architecture:

Model: Managed with Hibernate, representing the note entities and handling database operations.
View: Built using JSP, HTML, and CSS to render dynamic content and present a user-friendly interface.
Controller: Java Servlets that handle user requests, process business logic, and update the views accordingly.

Folder Structure
src/main/java: Contains the Java source files, including Servlets and Hibernate configurations.
src/main/webapp: Holds the JSP files, HTML templates, CSS stylesheets, and other static assets.
src/main/resources: Includes the Hibernate configuration file (hibernate.cfg.xml) and any other resources like property files.
pom.xml: Maven configuration file for managing dependencies and project build.
