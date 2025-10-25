TinyTasks — Backend
-----

TinyTasks is a small Spring Boot API to manage a simple list of tasks.
Data is in memory, not in a database. It is good for practice and demos.

--------------------------------------------------------------------------------------
Tech Stack
---

Java 21
Spring Boot (Web, Validation)

-----------------------------------------------------------------------------------------
Features
---------
List all tasks

Create a new task
Toggle a task as done or not done
Delete a task
Global error handling with simple JSON messages

--------------------------------------------------------------------------------------------
Structure
--
<img width="550" height="188" alt="image" src="https://github.com/user-attachments/assets/0c619ebc-99ca-4a81-931f-a43b2d4974dd" />

-----------------------------

API
--

Base URL: http://localhost:8080

<img width="589" height="565" alt="image" src="https://github.com/user-attachments/assets/699ffd01-b70c-4beb-8fe9-fc1e17a4a60f" />


<img width="745" height="509" alt="image" src="https://github.com/user-attachments/assets/59d9b2ec-41d6-4923-97b5-702041376bc1" />


-------------------------------------------------
CORS
--
The backend allows requests from http://localhost:5500 by default.
You can change origins in config/CorsConfig.

--------------------------------------------------------------


Development Notes

The data is in memory. When you stop the app, all tasks are lost.

Keep names in English for classes and endpoints.

Use simple commit messages and a feature branch when possible.


--------------

ANDERSON ESTIDUAR BLANDON ALVAREZ LOVELACE
---







---------------------------------------------------------------
