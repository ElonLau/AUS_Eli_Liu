# chatbox_1

This exercise is to help us determine your ability to write quality, self-documenting code, pay attention to edge cases, and follow requiremetns. Your recruiter will let you know the deadline to submit your project from when we provide you access to this repository. It also checks your ability to use Git...

INSTRUCTIONS

Clone this (mostly) empty repository
Create a branch with the pattern AUS_FirstName_LastName
Write your project, be sure to include unit tests! Please include any databse sql files (including DDLs for any tables/views/functions/etc that you necessary to run your code)
Be sure to squash commits if you have more than 1 commit to your local branch.
When finished create a pull request against the develop branch, do not merge. Send your recruiter the link to your PR. Your recruiter must receive the link no more than 24 hours after you have been given access to the repo.
REQUIREMENTS

Create a simple chat bot.

The goal of this exercise is create a simple chatbot that interacts with the user, asks questions and process responses. Based on the response, the chatbot should perform an action. The chatbot should be able to handle erroneous responses by clarifying and restating the original question. For the purpose of this exercise, the chat can occur completely in the console window, bonus points if the chat occurs in a form window. The task is to implement the following chat workflow in the attached pdf file.

Each conversation node is expecting a particular data type – Boolean, String, etc. Based upon the response, the chatbot should respond according to the document. Please note that all nodes expecting a response should be able to hand bad responses and respond appropriately. Also, please find a way to implement a common "INVALID RESPONSE" handler that will let the end user know that their response wasn't understood and redirect back to the associated request.

For each action, log the response (this is to simulate taking some action beyond continuing the chat)

We will be evaluating your project on adherence to requirements, data structures, and clean code. The most elegant solutions will focus on the data structure that supports a configurable conversation, that is, the actual text of a conversation node should be configurable via a text file, database record etc. Also, your solution should be able handle/support changing the flow of a conversation. Not a requirement for this implementation – but be able to explain how to add/remove/modify conversation nodes without requiring code changes.

Be sure to include unit tests...(sigh)
