package com.company.timesheetwitcuba.web.screens.user;

import com.haulmont.cuba.gui.screen.*;
import com.company.timesheetwitcuba.entity.User;

@UiController("timesheetwithcuba_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@LoadDataBeforeShow
public class UserBrowse extends StandardLookup<User> {
}