use prueba;
create table empleados(
	DNI varchar(9),
    Nombre varchar(20),
    Ap1 varchar(20),
    Ap2 varchar(20),
    NumDept int);
Alter table Empleados 
add constraint Empleados_Departamentos_FK
foreign key (NumDept) references Departamentos(Numero);

create table departamentos(
	Numero int primary key,
    Nombre varchar(20)
);

insert into departamentos values 
(1,'Programacion'),
(2,'Administracion');

insert into empleados values 
('12345678A', 'Juan', 'Gomez', 'Martin', 1),
('23456789B', 'Jennifer', 'Smith',null,1),
('3456780C', 'Petra', 'Ruiz', 'Seoane',2),
('5678901D', 'Johan','Nienmeyer', null,2);