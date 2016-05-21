/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.film.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.film.entity.TestFilm;

/**
 * 电影管理DAO接口
 * @author yinmy
 * @version 2016-05-21
 */
@MyBatisDao
public interface TestFilmDao extends CrudDao<TestFilm> {
	
}