package com.database.tables.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by Jonathan on 10/5/2015.
 */
public final class Result implements Iterator<ResultSet> {

	private ResultSet resultSet;

	public Result(ResultSet resultSet) {
		this.resultSet = resultSet; 
	}

	public ResultSet set() {
		return resultSet;
	}

	@Override
	public boolean hasNext() {
		try {
			return resultSet != null && resultSet.next();
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public ResultSet next() {
		return resultSet;
	}
}
