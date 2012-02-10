package org.ssmm2.common;

import java.util.List;
import java.util.Map;

public class Page {
	
	private int offset = 0;
	private int count = 0;
	private int limit = 0;
	private List<Map> data=null;

	public int getPerPageCount() {
		return limit;
	}

	public List getData() {
		return data;
	}

	public void setData(List<Map> data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPage() {
		if (count % limit == 0) {
			return count / limit;
		} else {
			return count / limit + 1;
		}
	}

	public boolean hasNext() {
		return this.offset < this.getTotalPage();
	}

	public boolean hasPrior() {
		return this.offset > 1;
	}

	public int getCurStartIndex() {
		return (offset - 1) * limit + 1;
	}

	public int getCurEndIndex() {
		return offset * limit;
	}

	public int getNext() {
		return offset + 1;
	}

	public int getPrior() {
		return offset - 1;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void set(int count, int offset, int limit, List<Map> data) {
		this.count = count;
		this.offset = offset;
		this.limit = limit;
		this.data = data;
	}

}
