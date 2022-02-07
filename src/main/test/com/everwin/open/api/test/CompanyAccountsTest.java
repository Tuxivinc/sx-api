/*
 * Copyright (C) 2022 Everwin (www.everwin.fr)
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

package com.everwin.open.api.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.everwin.open.api.core.BasicTest;

import fr.everwin.open.api.exception.CoreException;
import fr.everwin.open.api.model.companies.accounts.CompanyAccount;
import fr.everwin.open.api.model.core.DataLink;
import fr.everwin.open.api.services.companies.CompanyAccountsService;

/**
 * @author d.storti
 */
public class CompanyAccountsTest extends BasicTest<CompanyAccount, CompanyAccountsService> {

    private final long ACCENT = 104802;         // entity owner account
    private final long CUACUC = 162105;       //company

	@Override
	@BeforeClass
	public void setUp() {
		super.setUp();
		service = new CompanyAccountsService(clientApi);
		ws_rights = "RS"; //W
	}

	@Override
	@AfterClass
	public void tearDown() {
		super.tearDown();
	}

	@Override
	protected CompanyAccount initObject() {
        CompanyAccount account = new CompanyAccount();
        account.setCode("code");
        account.setIdentifierNumber("COMPANY");
        account.setVisibility(Short.valueOf("0"));
        account.setBillingName("COMPANY");
        account.setHeadquartersName("headquarter");
        account.setShippingName("shipping");
        account.setVatNumber("34567978");
        account.setCompany(new DataLink(CUACUC, ""));

        List<DataLink> accountingEntities = new ArrayList<>();
        accountingEntities.add(new DataLink(ACCENT, ""));
        account.setEntities(accountingEntities);

        return account;
	}

    @Override
    protected void changeObjectForUpdate() {
        objectReceived.setVatNumber("34567978999999");

    }

    @Override
    protected void otherServices() {
        if (isEmptyDB) throw new SkipException("Empty DB, cannot dos this test");
        try {
            service.queryCustomers(null);
            service.querySuppliers(null);
        } catch (CoreException e) {
            e.printStackTrace();
            Assert.fail("Error specific services", e);
        }
    }
}
