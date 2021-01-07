CREATE DATABASE virtual_currency;


CREATE TABLE `account` (
	`account_id` BIGINT NOT NULL AUTO_INCREMENT,
	`created_date` DATETIME(6) NULL,
	`email` VARCHAR(255) NULL,
	`passowrd` VARCHAR(255) NULL,
	`user_id` VARCHAR(255) NULL,
	`user_name` VARCHAR(255) NULL,
	`vc` DECIMAL(15,2) DEFAULT '0.00',
	PRIMARY KEY (`account_id`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB;



CREATE TABLE `transaction` (
	`transaction_id` BIGINT NOT NULL AUTO_INCREMENT,
	`total_amount` DECIMAL(15,2) DEFAULT '0.00',
	`transaction_date` DATETIME(6) DEFAULT NULL,
	`account_id` BIGINT NOT NULL,
	PRIMARY KEY (`transaction_id`) USING BTREE,
	INDEX `FK6g20fcr3bhr6bihgy24rq1r1b` (`account_id`) USING BTREE,
	CONSTRAINT `FK6g20fcr3bhr6bihgy24rq1r1b` FOREIGN KEY (`account_id`) REFERENCES `virtual_currency`.`account` (`account_id`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB;



CREATE TABLE `transaction_recipient` (
	`transactionrecipient_id` BIGINT NOT NULL AUTO_INCREMENT,
	`amount` DECIMAL(15,2) DEFAULT '0.00',
	`user_id` VARCHAR(255) DEFAULT NULL,
	`transaction_id` BIGINT NOT NULL,
	PRIMARY KEY (`transactionrecipient_id`) USING BTREE,
	INDEX `FK2m84qu025ofc9gln0vymnchb` (`transaction_id`) USING BTREE,
	CONSTRAINT `FK2m84qu025ofc9gln0vymnchb` FOREIGN KEY (`transaction_id`) REFERENCES `virtual_currency`.`transaction` (`transaction_id`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB;

