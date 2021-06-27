package com.company.timesheetwitcuba.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.User;

@UiController("timesheetwithcuba_User.edit")
@UiDescriptor("user-edit.xml")
@EditedEntityContainer("userDc")
@LoadDataBeforeShow
public class UserEdit extends StandardEditor<User> {
}