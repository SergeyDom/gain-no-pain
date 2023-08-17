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