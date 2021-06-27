package com.company.timesheetwitcuba.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Department;

@UiController("timesheetwithcuba_Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
@LoadDataBeforeShow
public class DepartmentEdit extends StandardEditor<Department> {
}