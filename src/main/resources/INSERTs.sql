-- Inserciones para la tabla PROJECT
INSERT INTO PROJECT (Name, Start_date, End_date, Budget, Priority) VALUES
('Proyecto A', '2024-01-15', '2024-06-30', 100000.00, 1),
('Proyecto B', '2024-02-01', '2024-07-31', 75000.50, 2),
('Proyecto C', '2024-03-10', '2024-08-15', 120000.75, 3),
('Proyecto D', '2024-04-05', '2024-09-30', 90000.25, 2),
('Proyecto E', '2024-05-20', '2024-10-31', 80000.00, 1);

-- Inserciones para la tabla Persona
INSERT INTO Persona (First_name, Last_name, Email, External) VALUES
('Juan', 'Perez', 'juan.perez@email.com', FALSE),
('María', 'Gomez', 'maria.gomez@email.com', FALSE),
('Carlos', 'Rodriguez', 'carlos.rodriguez@email.com', TRUE),
('Laura', 'Fernandez', 'laura.fernandez@email.com', FALSE),
('Pedro', 'Lopez', 'pedro.lopez@email.com', TRUE);

-- Inserciones para la tabla Project_people
-- Insertar roles para proyectos
INSERT INTO Project_people (Id_project, Id_person, Role) VALUES
(1, 1, 'Director'),
(1, 2, 'Desarrollador'),
(1, 3, 'Analista de Negocios'),
(1, 4, 'Diseñador UX'),
(2, 2, 'Director'),
(2, 3, 'Desarrollador'),
(2, 4, 'Analista de Negocios'),
(2, 5, 'Diseñador UX'),
(3, 3, 'Director'),
(3, 4, 'Desarrollador'),
(3, 5, 'Analista de Negocios'),
(3, 1, 'Diseñador UX'),
(4, 4, 'Director'),
(4, 5, 'Desarrollador'),
(4, 1, 'Analista de Negocios'),
(4, 2, 'Diseñador UX'),
(5, 5, 'Director'),
(5, 1, 'Desarrollador'),
(5, 2, 'Analista de Negocios'),
(5, 3, 'Diseñador UX');
