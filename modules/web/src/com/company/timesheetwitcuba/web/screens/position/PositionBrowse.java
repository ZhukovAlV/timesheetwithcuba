package com.company.timesheetwitcuba.web.screens.position;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Position;

@UiController("timesheetwithcuba_Position.browse")
@UiDescriptor("position-browse.xml")
@LookupComponent("positionsTable")
@LoadDataBeforeShow
public class PositionBrowse extends StandardLookup<Position> {
}