package com.company.timesheetwitcuba.web.screens.datasheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Datasheet;

@UiController("timesheetwithcuba_Datasheet.edit")
@UiDescriptor("datasheet-edit.xml")
@EditedEntityContainer("datasheetDc")
@LoadDataBeforeShow
public class DatasheetEdit extends StandardEditor<Datasheet> {
}