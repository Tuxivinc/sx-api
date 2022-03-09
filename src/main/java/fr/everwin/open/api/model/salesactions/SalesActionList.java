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
package fr.everwin.open.api.model.salesactions;

import fr.everwin.open.api.model.core.BasicList;

import javax.xml.bind.annotation.*;
import java.util.List;


/**
 * Sales action list
 * @author everwin-team
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "salesactionlist")
public class SalesActionList extends BasicList<SalesAction> {

    private final static String METHOD = "query";

    @XmlElement(name = "salesaction")
    @XmlElementWrapper(name = "salesactions")
    private List<SalesAction> items;

    @Override
    public List<SalesAction> getItems() {
        return items;
    }

    @Override
    public void setItems(List<SalesAction> items) {
        this.items = items;
    }
}
