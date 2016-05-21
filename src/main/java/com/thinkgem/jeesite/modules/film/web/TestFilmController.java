/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.film.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.film.entity.TestFilm;
import com.thinkgem.jeesite.modules.film.service.TestFilmService;

/**
 * 电影管理Controller
 * @author yinmy
 * @version 2016-05-21
 */
@Controller
@RequestMapping(value = "${adminPath}/film/testFilm")
public class TestFilmController extends BaseController {

	@Autowired
	private TestFilmService testFilmService;
	
	@ModelAttribute
	public TestFilm get(@RequestParam(required=false) String id) {
		TestFilm entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = testFilmService.get(id);
		}
		if (entity == null){
			entity = new TestFilm();
		}
		return entity;
	}
	
	@RequiresPermissions("film:testFilm:view")
	@RequestMapping(value = {"list", ""})
	public String list(TestFilm testFilm, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<TestFilm> page = testFilmService.findPage(new Page<TestFilm>(request, response), testFilm); 
		model.addAttribute("page", page);
		return "modules/film/testFilmList";
	}

	@RequiresPermissions("film:testFilm:view")
	@RequestMapping(value = "form")
	public String form(TestFilm testFilm, Model model) {
		model.addAttribute("testFilm", testFilm);
		return "modules/film/testFilmForm";
	}

	@RequiresPermissions("film:testFilm:edit")
	@RequestMapping(value = "save")
	public String save(TestFilm testFilm, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, testFilm)){
			return form(testFilm, model);
		}
		testFilmService.save(testFilm);
		addMessage(redirectAttributes, "保存电影成功");
		return "redirect:"+Global.getAdminPath()+"/film/testFilm/?repage";
	}
	
	@RequiresPermissions("film:testFilm:edit")
	@RequestMapping(value = "delete")
	public String delete(TestFilm testFilm, RedirectAttributes redirectAttributes) {
		testFilmService.delete(testFilm);
		addMessage(redirectAttributes, "删除电影成功");
		return "redirect:"+Global.getAdminPath()+"/film/testFilm/?repage";
	}

}