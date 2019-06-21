ALTER TABLE ADDRESS
ADD FOREIGN KEY (contact_id) REFERENCES contact(contact_id);

ALTER TABLE PHONE
ADD FOREIGN KEY (contact_id) REFERENCES contact(contact_id);

ALTER TABLE DATE
ADD FOREIGN KEY (contact_id) REFERENCES contact(contact_id);

alter table contact modify contact_id int not null auto_increment;

alter table contact auto_increment=1001;