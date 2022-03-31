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

package fr.everwin.open.api.services.candidates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.everwin.open.api.ClientApi;
import fr.everwin.open.api.model.candidates.skills.CandidateSkill;
import fr.everwin.open.api.model.candidates.skills.CandidateSkillList;
import fr.everwin.open.api.services.core.BasicService;

public class CandidateSkillsService extends BasicService<CandidateSkill, CandidateSkillList> {

    protected static final Logger LOGGER = LoggerFactory.getLogger(CandidateSkillsService.class);

    public CandidateSkillsService(ClientApi client) {
        super(client, "candidate-skills");
        setModels(CandidateSkill.class, CandidateSkillList.class);
    }
}
