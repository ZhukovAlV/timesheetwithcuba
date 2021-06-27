package com.company.timesheetwitcuba.web.screens.datasheet;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Datasheet;

@UiController("timesheetwithcuba_Datasheet.browse")
@UiDescriptor("datasheet-browse.xml")
@LookupComponent("datasheetsTable")
@LoadDataBeforeShow
public class DatasheetBrowse extends StandardLookup<Datasheet> {
}