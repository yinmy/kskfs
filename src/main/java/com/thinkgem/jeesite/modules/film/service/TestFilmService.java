/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.film.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.film.entity.TestFilm;
import com.thinkgem.jeesite.modules.film.dao.TestFilmDao;

/**
 * 电影管理Service
 * @author yinmy
 * @version 2016-05-21
 */
@Service
@Transactional(readOnly = true)
public class TestFilmService extends CrudService<TestFilmDao, TestFilm> {

	public TestFilm get(String id) {
		return super.get(id);
	}
	
	public List<TestFilm> findList(TestFilm testFilm) {
		return super.findList(testFilm);
	}
	
	public Page<TestFilm> findPage(Page<TestFilm> page, TestFilm testFilm) {
		return super.findPage(page, testFilm);
	}
	
	@Transactional(readOnly = false)
	public void save(TestFilm testFilm) {
		super.save(testFilm);
	}
	
	@Transactional(readOnly = false)
	public void delete(TestFilm testFilm) {
		super.delete(testFilm);
	}
	
}