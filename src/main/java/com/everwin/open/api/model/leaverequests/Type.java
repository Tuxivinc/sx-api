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

package com.everwin.open.api.model.leaverequests;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.everwin.open.api.model.core.BasicObject;
import com.everwin.open.api.model.core.DataLink;

/**
 * Represents a leave request type. Available types can be found on the internral project
 * @author everwin-team
 */
@XmlRootElement(name = "Type")
@XmlAccessorType(XmlAccessType.FIELD)
public class Type extends BasicObject {

	@XmlElement
	private String label;

	@XmlElement
	private DataLink entity;
	public Type() {

	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public DataLink getEntity() {
		return entity;
	}
	public void setEntity(DataLink entity) {
		this.entity = entity;
	}

}
