package com.company.timesheetwitcuba.web.screens.organization;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Organization;

@UiController("timesheetwithcuba_Organization.edit")
@UiDescriptor("organization-edit.xml")
@EditedEntityContainer("organizationDc")
@LoadDataBeforeShow
public class OrganizationEdit extends StandardEditor<Organization> {
}