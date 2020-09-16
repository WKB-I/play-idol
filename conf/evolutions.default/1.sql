# --- !Ups
create table people(
    id int auto_increment primary key,
    name varchar(255) not null,
    unit name varchar(255) not null,
);

insert into people values(default, '櫻木　真野', 'illumination STARS');
insert into people values(default, '風野　灯織', 'illumination STARS');
insert into people values(default, '八宮　めぐる', 'illumination STARS');

# --- !Downs
drop table people