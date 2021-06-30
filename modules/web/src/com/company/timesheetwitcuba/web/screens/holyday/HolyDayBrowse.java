package com.company.timesheetwitcuba.web.screens.holyday;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.HolyDay;

@UiController("timesheetwithcuba_HolyDay.browse")
@UiDescriptor("holy-day-browse.xml")
@LookupComponent("holyDaysTable")
@LoadDataBeforeShow
public class HolyDayBrowse extends StandardLookup<HolyDay> {
}