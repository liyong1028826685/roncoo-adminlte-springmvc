/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.adminlte.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.roncoo.adminlte.bean.entity.RcEmailAccountInfo;
import com.roncoo.adminlte.biz.EmailAccountInfoBiz;
import com.roncoo.adminlte.util.base.BaseController;

/**
 * 
 * @author wujing
 */
@Controller
@RequestMapping(value = "/admin/emailAccountInfo", method = RequestMethod.POST)
public class EmailAccountInfoController extends BaseController {

	@Autowired
	private EmailAccountInfoBiz biz;

	@RequestMapping(value = LIST)
	public void list(@RequestParam(value = "pageCurrent", defaultValue = "1") int pageCurrent, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize, ModelMap modelMap) {

	}

	@RequestMapping(value = SAVE)
	public void insert(@ModelAttribute RcEmailAccountInfo rcEmailAccountInfo) {
	}
}