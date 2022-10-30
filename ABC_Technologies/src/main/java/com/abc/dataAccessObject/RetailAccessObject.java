package com.abc.dataAccessObject;

import com.abc.RetailModule;

public interface RetailAccessObject {
	void create(RetailModule product);
	RetailModule read(int product_id);
	Readable edit(int product_id);

}
