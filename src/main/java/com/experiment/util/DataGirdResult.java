package com.experiment.util;

import java.util.List;

public class DataGirdResult {
	private Integer total;
	
	private List<?> rows;
	
	public DataGirdResult(Integer total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}
	
	public DataGirdResult(long total, List<?> rows) {
		this.total = (int) total;
		this.rows = rows;
	}
	
	public DataGirdResult(){
		
	}

	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
