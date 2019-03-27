package com.neuedu.olms.web;

import java.util.List;

public class PageData<T> {

	private int curPage;

	private int totalPage;
	
	private int totalRecord;
	
	private int pageSize;
	
	private List<T> data;
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	

	public int getCurPage() {
		return curPage;
	}
    
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public PageData(int pageSize,int curPage) {
		this.pageSize = pageSize;
		this.curPage = curPage;
	}
    //æ±‚æ?»é¡µæ•?
	public int getTotalPage() {
		totalPage=totalRecord % pageSize == 0?totalRecord / pageSize
				                   :(totalRecord / pageSize)+1;
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PageData [curPage=" + curPage + ", totalPage=" + totalPage + ", totalRecord=" + totalRecord
				+ ", pageSize=" + pageSize + ", data=" + data + "]";
	}
	

	

}
