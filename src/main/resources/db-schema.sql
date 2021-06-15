ALTER TABLE IF EXISTS ONLY public.share DROP CONSTRAINT IF EXISTS pk_share_id CASCADE;

DROP TABLE IF EXISTS public.share;
CREATE TABLE share (
                       post_id INTEGER NOT NULL,
                       person_id INTEGER NOT NULL,
                       share_date TIMESTAMP WITHOUT TIME ZONE NOT NULL
);

ALTER TABLE ONLY share
    ADD CONSTRAINT pk_share_id PRIMARY KEY (person_id, post_id);