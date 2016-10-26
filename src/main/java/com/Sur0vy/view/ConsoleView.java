package com.Sur0vy.view;

import com.Sur0vy.controller.DBController;
import com.Sur0vy.model.*;
import java.sql.SQLException;

public class ConsoleView {

    private DBController dbController;

    private void run() throws SQLException {

        //creating component
        Group group = new Group(99, "микросхема");
        dbController.getGroupDao().create(group);

        Component component = new Component();
        component.setId(22);
        component.setName("имя микросхемы");
        component.setSize("microsheme size");
        component.setComponentVendor("component vendor");
        component.setFeature("component feature");
        component.setGroup(group);
        dbController.getComponentDao().create(component);

        //creting document
        Code code = new Code("code1", "c11111ode1");
        dbController.getCodeDao().create(code);

        Developer developer = new Developer(2222, "Greg");
        dbController.getDeveloperDao().create(developer);

        Organization organization = new Organization(333, "Roga & kopita");
        dbController.getOrganizationDao().create(organization);

        Vendor vendor = new Vendor(22222, "Vendor 2");
        dbController.getVendorDao().create(vendor);

        java.util.Date date = new java.util.Date();

        Document doc = new Document();
        doc.setCode(code);
        doc.setId(2333);
        doc.setDate(date);
        doc.setDeveloper(developer);
        doc.setInvoceDate(date);
        doc.setInvoceNumber(1221);
        doc.setNumber(3424324);
        doc.setPaidOrganization(organization);
        doc.setVendor(vendor);
        doc.setWaybillNumber(3344);
        doc.setWaybillDate(date);
        dbController.getDocumentDao().create(doc);

        //creating bill
//        Bill bill = new Bill(doc);
//        bill.se
//        bill.setDocument();
//        dbController.getBillDao().create(bill);
    }

    public ConsoleView(final String databaseName) throws Exception {
        dbController = new DBController(databaseName);
        run();
        dbController.closeConnection();
    }

}
