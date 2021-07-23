DROP TABLE IF EXISTS user_role;
DROP TABLE IF EXISTS "user";
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS blog;

CREATE TABLE "user"
(
    id BIGSERIAL PRIMARY KEY NOT NULL ,
    username VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE role
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE user_role
(
    user_id BIGINT REFERENCES "user"(id),
    role_id BIGINT REFERENCES role(id)
);

CREATE TABLE blog
(
    id BIGSERIAL PRIMARY KEY NOT NULL,
    header VARCHAR(255) NOT NULL ,
    intro VARCHAR(1000) NOT NULL ,
    text TEXT NOT NULL
);

INSERT INTO blog (header, intro, text) VALUES
('first', 'first intro', 'and first text'),
('second', 'second intro', 'and second text'),
('third', 'third intro', 'and third text'),
('fourth', 'fourth intro', 'and fourth text');