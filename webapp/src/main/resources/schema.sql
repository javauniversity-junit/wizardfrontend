

create table IF NOT EXISTS  agent (
        agentid integer NOT NULL AUTO_INCREMENT,
        address varchar(255),
        contact_id integer,
        password varchar(255),
        primary key (agentid)
    );



create table IF NOT EXISTS contact (
        contact_id integer NOT NULL AUTO_INCREMENT,
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
    
    
    
    
    CREATE TABLE IF NOT EXISTS `wizard` (
  `wizardid` int(11) NOT NULL AUTO_INCREMENT,
  `agentid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  primary key (wizardid)
) ;


  
  
  CREATE TABLE IF NOT EXISTS `wizarddata` (
  `wizarddataid` int(11) NOT NULL AUTO_INCREMENT,
  `pagedata` varchar(2000) NOT NULL,
  `wizardid` int(11) NOT NULL,
  `pagename` varchar(50) NOT NULL,
  `pagesequence` int(11) NOT NULL,
   primary key (wizarddataid)
) ;

--
-- Indexes for dumped tables
--

--ALTER TABLE `license`.`wizarddata` 
--ADD UNIQUE INDEX `pageDataIndex` (`wizardid` ASC, `pagename` ASC) VISIBLE;

    
-- DROP INDEX index_agent_address ON agent;
 
--CREATE UNIQUE INDEX  index_agent_address ON agent(address);

--insert---
--INSERT IGNORE INTO `contact` ( `contact_id`,`name`, `uuid`, `license`, `general_information`, `phone`, `usage_date`, `created_date`, `start_date`, `end_date`, `address`, `active`, `client_type`, `streetaddress`, `city`, `state`, `zipcode`, `emailaddress`,`password`) VALUES (-777,'Mark Hildebrand', '0825f2d3', 'y8V9vQD3d', ' Casper, WY', '3073330964', '2017-09-07 21:54:10', '2017-07-15 07:29:19', '2017-01-04 00:10:00', '2022-01-31 00:03:00', 'mhildebrand@kcwy13.com', 0, 'TV', 'PO Box 1540', 'Mills', 'WY', '82644', 'a@aol.com', 'password');
INSERT IGNORE INTO `contact` ( `contact_id`,`name`, `uuid`, `license`, `general_information`, `phone`, `usage_date`, `created_date`, `start_date`, `end_date`, `address`, `active`, `client_type`, `streetaddress`, `city`, `state`, `zipcode`, `emailaddress`,`password`) VALUES (-777,'Mark Hildebrand', '0825f2d3', 'y8V9vQD3d', ' Casper, WY', '3073330964', '2017-09-07 21:54:10', '2017-07-15 07:29:19', '2017-01-04 00:10:00', '2022-01-31 00:03:00', 'mhildebrand@kcwy13.com', 0, 'TV', 'PO Box 1540', 'Mills', 'WY', '82644', 'a@aol.com', 'password');


INSERT IGNORE  INTO `agent` (`address`,`password`, `contact_id`) VALUES ('z@aol.com', 'z', -777);
