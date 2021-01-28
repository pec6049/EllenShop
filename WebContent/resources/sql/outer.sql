CREATE TABLE IF NOT EXISTS outer_o(
	o_id VARCHAR(10) NOT NULL,
	o_name VARCHAR(20),
	o_unitPrice INTEGER,
	o_description TEXT,
	o_category VARCHAR(20),
	o_manufacturer VARCHAR(20),
	o_unitsInStock LONG,
	o_condition VARCHAR(20),
	o_fileName VARCHAR(20),
	PRIMARY KEY (o_id)
) default CHARSET=utf8;