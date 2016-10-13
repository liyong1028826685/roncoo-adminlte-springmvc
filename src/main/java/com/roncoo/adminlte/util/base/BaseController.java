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
package com.roncoo.adminlte.util.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基础类
 * 
 * @author wujing
 */
public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String TEXT_UTF8 = "text/html;charset=UTF-8";
	public static final String JSON_UTF8 = "application/json;charset=UTF-8";
	public static final String XML_UTF8 = "application/xml;charset=UTF-8";

	public static final String ADD = "add";
	public static final String SAVE = "save";
	public static final String EDIT = "edit";
	public static final String VIEW = "view";
	public static final String GET = "get";
	public static final String LIST = "list";
	public static final String LISTALL = "listAll";
	public static final String INSERT = "insert";
	public static final String DELETE = "delete";
	public static final String UPDATE = "update";
	public static final String SELETE = "selete";
	public static final String BATCHUPDATE = "batchUpdate";
	public static final String UPDATESTATUS = "updateStatus";
	public static final String BATCHENABLE = "batchEnable";
	public static final String BATCHDISABLE = "batchDisable";

}