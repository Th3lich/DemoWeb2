insert into subject (id, name, description, course)
	select 1, 'Matemáticas', 'Desc 1', 1 from dual where not exists (select 1 from subject where id = 1);

insert into subject (id, name, description, course)
	select 2, 'Física', 'Desc 2', 1 from dual where not exists (select 1 from subject where id = 2);