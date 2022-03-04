create table robot(
                      id bigint auto_increment primary key ,
                      parent_id bigint not null,
                      question text not null,
                      answer text not null,
                      key parent_id(parent_id)
);
INSERT INTO robot (id, parent_id, question, answer) VALUES (1, 0, 'Hi! This is LISA. I have a great shift opportunity for you! Are you Interested in hearing about it? Please respond Yes or No', 'Hi! This is LISA. I have a great shift opportunity for you! Are you Interested in hearing about it? Please respond Yes or No');
INSERT INTO robot (id, parent_id, question, answer) VALUES (2, 1, 'yes', 'Great the shift is at 1313 Mockingbird Ln at 2/15/2021 4:00pm-12:00am.We''ll see you there!');
INSERT INTO robot (id, parent_id, question, answer) VALUES (3, 1, 'no', 'Ok, thanks. Can you let me know why not? Respond 1: Too far Respond 2: Not available Respond 3: Other');
INSERT INTO robot (id, parent_id, question, answer) VALUES (4, 3, '1', 'Thanks for letting me know. I''ll avoid offering shifts at this location in the future');
INSERT INTO robot (id, parent_id, question, answer) VALUES (5, 3, '2', 'Thanks for letting me know. I''ll avoid offering shifts at this location in the future');
INSERT INTO robot (id, parent_id, question, answer) VALUES (6, 3, '3', 'Ok. Thanks. I won''t offer shifts at this location or time in the future');