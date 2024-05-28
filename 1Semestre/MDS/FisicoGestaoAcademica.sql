/* LógicoGestaoAcademica: */

CREATE TABLE curso (
    nome VARCHAR(255),
    codigo VARCHAR(50) PRIMARY KEY, PRIMARY KEY,
    carga_horaria INT
);

CREATE TABLE disciplina (
    nome VARCHAR(255),
    codigo VARCHAR(50) PRIMARY KEY, PRIMARY KEY,
    carga_horaria INT
);

CREATE TABLE aluno (
    nome VARCHAR(255),
    ra INT PRIMARY KEY PRIMARY KEY,
    cpf VARCHAR(11),
    sexo CHAR(1),
    falta INT
);

CREATE TABLE boletin (
    notas float,
    raAluno int,
    cod_diciplina VARCHAR(50),
    PRIMARY KEY (raAluno, cod_diciplina)
);

CREATE TABLE coordenador (
    idCoordenador int,
    fk_funcionario_matricula VARCHAR(255),
    PRIMARY KEY (idCoordenador, fk_funcionario_matricula)
);

CREATE TABLE professor (
    idProfessor int,
    fk_funcionario_matricula VARCHAR(255),
    PRIMARY KEY (idProfessor, fk_funcionario_matricula)
);

CREATE TABLE funcionario (
    matricula VARCHAR(50) PRIMARY KEY, PRIMARY KEY,
    nome VARCHAR(255),
    formacao VARCHAR(255),
    salario FLOAT,
    data_admissao DATE,
    profissao VARCHAR(255),
    cpf VARCHAR(11)
);

CREATE TABLE oferece (
    fk_curso_codigo INT,
    fk_diciplina_codigo INT
);

CREATE TABLE estuda (
    fk_aluno_ra int,
    fk_diciplina_codigo INT,
    PRIMARY KEY (fk_aluno_ra, fk_diciplina_codigo)
);

CREATE TABLE adiciona (
    fk_diciplina_codigo INT
);

CREATE TABLE ministra (
    fk_professor_idProfessor int,
    fk_professor_fk_funcionario_matricula VARCHAR(255),
    fk_diciplina_codigo string
);
 
ALTER TABLE boletin ADD CONSTRAINT FK_boletin_1
    FOREIGN KEY (raAluno???, cod_diciplina???)
    REFERENCES ??? (???);
 
ALTER TABLE coordenador ADD CONSTRAINT FK_coordenador_2
    FOREIGN KEY (fk_funcionario_matricula???)
    REFERENCES ??? (???)
    ON DELETE CASCADE;
 
ALTER TABLE professor ADD CONSTRAINT FK_professor_2
    FOREIGN KEY (fk_funcionario_matricula???)
    REFERENCES ??? (???)
    ON DELETE CASCADE;
 
ALTER TABLE oferece ADD CONSTRAINT FK_oferece_1
    FOREIGN KEY (fk_curso_codigo???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE oferece ADD CONSTRAINT FK_oferece_2
    FOREIGN KEY (fk_diciplina_codigo???)
    REFERENCES ??? (???)
    ON DELETE SET NULL;
 
ALTER TABLE estuda ADD CONSTRAINT FK_estuda_1
    FOREIGN KEY (fk_aluno_ra???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE estuda ADD CONSTRAINT FK_estuda_2
    FOREIGN KEY (fk_diciplina_codigo???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE adiciona ADD CONSTRAINT FK_adiciona_1
    FOREIGN KEY (fk_diciplina_codigo???)
    REFERENCES ??? (???)
    ON DELETE RESTRICT;
 
ALTER TABLE ministra ADD CONSTRAINT FK_ministra_1
    FOREIGN KEY (fk_professor_idProfessor, fk_professor_fk_funcionario_matricula)
    REFERENCES professor (idProfessor, fk_funcionario_matricula)
    ON DELETE RESTRICT;
 
ALTER TABLE ministra ADD CONSTRAINT FK_ministra_2
    FOREIGN KEY (fk_diciplina_codigo???)
    REFERENCES ??? (???)
    ON DELETE SET NULL;