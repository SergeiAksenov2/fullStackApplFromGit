package com.company.fullstackapplfromgit.view.newentity3;

import com.company.fullstackapplfromgit.entity.NewEntity3;

import com.company.fullstackapplfromgit.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "newEntity3s", layout = MainView.class)
@ViewController("NewEntity3.list")
@ViewDescriptor("new-entity3-list-view.xml")
@LookupComponent("newEntity3sDataGrid")
@DialogMode(width = "64em")
public class NewEntity3ListView extends StandardListView<NewEntity3> {
}