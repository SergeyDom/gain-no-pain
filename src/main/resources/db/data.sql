insert into muscle_groups (name)
VALUES ('chest'),
       ('back'),
       ('legs'),
       ('arms');
select * from muscle_groups // эта команда выводит тебе таблицу,что бы ты смог проверить как она заполнилась

insert into exercises (name, muscle_groups_id)
VALUES ('bench_press', 1),
    ('incline_db_bench_press', 1),
    ('fly', 1),
    ('pull_ups', 2),
    ('wide_grip_pull', 2),
    ('cable_row', 2),
    ('squats', 3),
    ('leg_press', 3),
    ('seated_toe_rise', 3),
    ('biceps_curl', 4),
    ('triceps_extension', 4),
    ('shoulder_press', 4);

insert into workouts (name)
values ('Chest day'),
       ('Back day'),
       ('Leg day'),
       ('Arms day');
INSERT INTO workouts_exercises(workouts_id, exercises_id)
VALUES (1, 1),
       (1, 2),
       (1, 3);
INSERT INTO trening(WORKOUTS_ID, TRENING_VOLUME)
VALUES (1, 100),
       (2, 150),
       (3, 130);
-- поменял тип данных таблицы reps на neumeric(7.3)Б т.к. (6.3) окозалось мало--
ALTER TABLE reps
ALTER COLUMN volume type numeric(7,3);
INSERT INTO reps(exercises_id, reps, weight, trening_id, volume)
VALUES (1, 16, 70, 1, 1200),
       (1, 12, 80, 1, 960),
       (1, 10, 85, 1, 850),
       (1, 8, 90, 1, 720);