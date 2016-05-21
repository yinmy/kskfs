/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.film.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 电影管理Entity
 * @author yinmy
 * @version 2016-05-21
 */
public class TestFilm extends DataEntity<TestFilm> {
	
	private static final long serialVersionUID = 1L;
	private String filmName;		// 电影名称
	private String filmType;		// 电影类型
	private String filmSort;		// 排序
	
	public TestFilm() {
		super();
	}

	public TestFilm(String id){
		super(id);
	}

	@Length(min=1, max=2000, message="电影名称长度必须介于 1 和 2000 之间")
	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	
	@Length(min=1, max=100, message="电影类型长度必须介于 1 和 100 之间")
	public String getFilmType() {
		return filmType;
	}

	public void setFilmType(String filmType) {
		this.filmType = filmType;
	}
	
	public String getFilmSort() {
		return filmSort;
	}

	public void setFilmSort(String filmSort) {
		this.filmSort = filmSort;
	}
	
}