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
package fr.everwin.open.api.model.profiles;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import fr.everwin.open.api.model.core.BasicList;
import fr.everwin.open.api.model.projects.Project;


/**
 * Profile list
 * @author everwin-team
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "profilelist")
public class ProfileList extends BasicList<Profile> {

	@XmlElement(name = "profile")
	@XmlElementWrapper(name = "profiles")
	private List<Profile> items;

	public ProfileList() {

	}

	public List<Profile> getItems() {
		return items;
	}

	public void setItems(List<Profile> items) {
		this.items = items;
	}


}
