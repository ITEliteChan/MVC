package com.rf.bean;

import java.util.List;

public class Page {
	private int page;
	private int rows;
	private int totarows;
	private int totopage;
	private List<?> list;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotarows() {
		return totarows;
	}
	public void setTotarows(int totarows) {
		this.totarows = totarows;
	}
	public int getTotopage() {
		return (totarows%4)==0?totarows/4:(totarows/4)+1;
	}
	public void setTotopage(int totopage) {
		this.totopage = totopage;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
	
}
