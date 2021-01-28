CREATE TABLE IF NOT EXISTS top (
	t_id VARCHAR(10) NOT NULL,
	t_name VARCHAR(20),
	t_unitPrice INTEGER,
	t_description TEXT,
	t_category VARCHAR(20),
	t_manufacturer VARCHAR(20),
	t_unitsInStock LONG,
	t_condition VARCHAR(20),
	t_fileName VARCHAR(20),
	PRIMARY KEY (t_id)
) default CHARSET=utf8;