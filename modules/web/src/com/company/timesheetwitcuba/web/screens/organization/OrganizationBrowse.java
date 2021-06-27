package com.company.timesheetwitcuba.web.screens.organization;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Organization;

@UiController("timesheetwithcuba_Organization.browse")
@UiDescriptor("organization-browse.xml")
@LookupComponent("organizationsTable")
@LoadDataBeforeShow
public class OrganizationBrowse extends StandardLookup<Organization> {
}