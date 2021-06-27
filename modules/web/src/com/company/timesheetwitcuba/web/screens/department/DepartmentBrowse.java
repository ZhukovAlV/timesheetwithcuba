package com.company.timesheetwitcuba.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Department;

@UiController("timesheetwithcuba_Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
@LoadDataBeforeShow
public class DepartmentBrowse extends StandardLookup<Department> {
}