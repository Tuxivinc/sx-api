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
package fr.everwin.open.api.model.nafs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.everwin.open.api.model.core.BasicObject;


/**
 * Naf class
 * @author everwin-team
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "naf")
@XmlAccessorType(XmlAccessType.FIELD)
public class Naf extends BasicObject {

	@XmlElement
	public String code;

	@XmlElement
	public String label;

	@XmlElement
	public Short revision;

	public Naf() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Short getRevision() {
		return revision;
	}

	public void setRevision(Short revision) {
		this.revision = revision;
	}

}
