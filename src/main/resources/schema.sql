CREATE TABLE IF NOT EXISTS "app_user" (
    "id" INT   PRIMARY KEY AUTO_INCREMENT,
    "username" VARCHAR(50)   NOT NULL,
    "password" VARCHAR(50)   NOT NULL
);