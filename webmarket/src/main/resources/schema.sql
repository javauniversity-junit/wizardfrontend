create table agent (
        agentid integer not null,
        address varchar(255),
        contact_id integer,
        password varchar(255),
        primary key (agentid)
    );

create table contact (
        contact_id integer not null,
        active bit,
        address varchar(255),
        city varchar(255),
        client_type varchar(255),
        created_date datetime,
        emailaddress varchar(255),
        end_date datetime,
        general_information varchar(255),
        license varchar(255),
        name varchar(255),
        password varchar(255),
        phone varchar(255),
        start_date datetime,
        state varchar(255),
        streetaddress varchar(255),
        usage_date datetime,
        uuid varchar(255),
        zipcode varchar(255),
        primary key (contact_id)
    );
    
CREATE UNIQUE INDEX index_agent_address ON agent(address);
