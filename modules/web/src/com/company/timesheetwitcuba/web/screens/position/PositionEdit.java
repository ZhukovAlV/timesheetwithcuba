package com.company.timesheetwitcuba.web.screens.position;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.Position;

@UiController("timesheetwithcuba_Position.edit")
@UiDescriptor("position-edit.xml")
@EditedEntityContainer("positionDc")
@LoadDataBeforeShow
public class PositionEdit extends StandardEditor<Position> {
}