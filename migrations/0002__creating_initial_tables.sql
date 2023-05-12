--liquibase formatted sql

--changeset t1redaf:table-chat

create table chat(
                     id bigserial primary key,
                     name text
)

--rollback DROP TABLE "link";