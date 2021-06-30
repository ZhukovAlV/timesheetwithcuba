package com.company.timesheetwitcuba.web.screens.holyday;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.HolyDay;

@UiController("timesheetwithcuba_HolyDay.edit")
@UiDescriptor("holy-day-edit.xml")
@EditedEntityContainer("holyDayDc")
@LoadDataBeforeShow
public class HolyDayEdit extends StandardEditor<HolyDay> {
}