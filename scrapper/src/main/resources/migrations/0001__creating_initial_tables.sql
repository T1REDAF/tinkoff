DROP TABLE IF EXISTS link;
DROP TABLE IF EXISTS tg_user;

CREATE TABLE tg_user(
                        chat_id BIGINT,
                        PRIMARY KEY (chat_id)
);

CREATE TABLE link(
                     link_id VARCHAR(50),
                     url VARCHAR(255) NOT NULL,
                     user_chat_id BIGINT,
                     created_at TIMESTAMP NOT NULL,
                     foreign key (user_chat_id) references tg_user(chat_id),
                     PRIMARY KEY (link_id)
);