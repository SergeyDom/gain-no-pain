create table muscle_groups
(
    id   serial primary key,
    name varchar(30) not null
);
create table exercises
(
    id               serial primary key,
    name             varchar(50) not null,
    muscle_groups_id integer
);
create table workouts
(
    id   serial primary key,
    name varchar(50)
);
create table workouts_exercises
(
    workouts_id  integer,
    exercises_id integer
);
create table trening
(
    id             serial primary key,
    date           timestamptz,
    workouts_id    integer,
    trening_volume decimal(6, 3)
);
create table reps
(
    id           serial primary key,
    exercises_id integer,
    reps         integer,
    weight       decimal(6, 3),
    trening_id   integer,
    volume       decimal(6, 3)

);
--добавил в таблицу id--
ALTER TABLE workouts_exercises
    ADD COLUMN id SERIAL PRIMARY KEY;



