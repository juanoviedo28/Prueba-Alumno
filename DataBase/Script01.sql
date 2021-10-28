CREATE TABLE public.alumnos
(
    id integer NOT NULL DEFAULT nextval('alumnos_id_seq'::regclass),
    nombre character varying(100) COLLATE pg_catalog."default" NOT NULL,
    apellido character varying(100) COLLATE pg_catalog."default" NOT NULL,
    sexo character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT alumnos_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.alumnos
    OWNER to postgres;
