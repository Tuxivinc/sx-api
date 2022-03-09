/*
 * Copyright (C) 2021 Everwin (www.everwin.fr)
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

package fr.everwin.open.api.model.quotes.poa.items;

import fr.everwin.open.api.model.core.BasicList;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author d.storti
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "poaquoteitemlist")
public class POAQuoteItemList extends BasicList<POAQuoteItem> {

    private final static String METHOD = "query";

    @XmlElement(name = "poaQuote-item")
    @XmlElementWrapper(name = "poaQuote-items")
    private List<POAQuoteItem> items;

    @Override
    public List<POAQuoteItem> getItems() {
        return items;
    }

    @Override
    public void setItems(List<POAQuoteItem> items) {
        this.items = items;
    }
}
