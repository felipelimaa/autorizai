CREATE TABLE public.procedimento (
    procedimento_id bigint not null,
    procedimento_codigo bigint not null,
    procedimento_descricao character varying(300) not null,
    constraint procedimento_pk primary key (procedimento_id),
    constraint procedimento_uq unique (procedimento_codigo)
);