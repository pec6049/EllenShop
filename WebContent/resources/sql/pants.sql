CREATE TABLE IF NOT EXISTS pants (
	pt_id VARCHAR(10) NOT NULL,
	pt_name VARCHAR(20),
	pt_unitPrice INTEGER,
	pt_description TEXT,
	pt_category VARCHAR(20),
	pt_manufacturer VARCHAR(20),
	pt_unitsInStock LONG,
	pt_condition VARCHAR(20),
	pt_fileName VARCHAR(20),
	PRIMARY KEY (pt_id)
) default CHARSET=utf8;