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

package fr.everwin.open.api.model.projects.lines;


import fr.everwin.open.api.model.core.MultiCurrencyValue;

/**
 * @author d.storti
 */
public class ProjectLineMultiCurrencyValue extends MultiCurrencyValue {


    private Double lineManagement;

    /**
     *
     */
    public ProjectLineMultiCurrencyValue() {
        // Constructor empty
    }

    /**
     * @return the lineManagement
     */
    public Double getLineManagement() {
        return lineManagement;
    }

    /**
     * @param lineManagement the lineManagement to set
     */
    public void setLineManagement(Double lineManagement) {
        this.lineManagement = lineManagement;
    }

}
