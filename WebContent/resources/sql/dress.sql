CREATE TABLE IF NOT EXISTS dress (
	d_id VARCHAR(10) NOT NULL,
	d_name VARCHAR(20),
	d_unitPrice INTEGER,
	d_description TEXT,
	d_category VARCHAR(20),
	d_manufacturer VARCHAR(20),
	d_unitsInStock LONG,
	d_condition VARCHAR(20),
	d_fileName VARCHAR(20),
	PRIMARY KEY (d_id)
) default CHARSET=utf8;