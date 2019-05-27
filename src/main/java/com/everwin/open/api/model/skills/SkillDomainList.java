/*
 * Copyright (C) 2019 Everwin (www.everwin.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 
 */
package com.everwin.open.api.model.skills;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.everwin.open.api.model.core.BasicList;


/**
 * Skill domains list
 * @author everwin-team
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "skilldomainlist")
public class SkillDomainList extends BasicList<SkillDomain> {

	@XmlElement(name = "skilldomain")
	@XmlElementWrapper(name = "skilldomains")
	private List<SkillDomain> items;

	public SkillDomainList() {

	}

	public List<SkillDomain> getItems() {
		return items;
	}

	public void setItems(List<SkillDomain> items) {
		this.items = items;
	}


}
