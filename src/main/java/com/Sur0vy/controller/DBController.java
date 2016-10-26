package com.Sur0vy.controller;

import com.Sur0vy.model.*;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

import java.io.IOException;

public class DBController {

    private JdbcConnectionSource connectionSource = null;

    private Dao<Vendor, Integer> vendorDao;
    private Dao<Organization, Integer> organizationDao;
    private Dao<Developer, Integer> developerDao;
    private Dao<Group, Integer> groupDao;
    private Dao<Document, Integer> documentDao;
    private Dao<Component, Integer> componentDao;
    private Dao<Code, Integer> codeDao;
    private Dao<Bill, Integer> billDao;

    public DBController(String connectionString) throws Exception {
        connectionSource = new JdbcConnectionSource(connectionString);
        vendorDao = DaoManager.createDao(connectionSource, Vendor.class);
        organizationDao = DaoManager.createDao(connectionSource, Organization.class);
        groupDao = DaoManager.createDao(connectionSource, Group.class);
        documentDao = DaoManager.createDao(connectionSource, Document.class);
        developerDao = DaoManager.createDao(connectionSource, Developer.class);
        componentDao = DaoManager.createDao(connectionSource, Component.class);
        codeDao  = DaoManager.createDao(connectionSource, Code.class);
        billDao = DaoManager.createDao(connectionSource, Bill.class);
    }

    public void closeConnection() throws IOException {
        if (connectionSource != null)
            connectionSource.close();
    }

    public Dao<Vendor, Integer> getVendorDao() {
        return vendorDao;
    }

    public Dao<Organization, Integer> getOrganizationDao() {
        return organizationDao;
    }

    public Dao<Developer, Integer> getDeveloperDao() {
        return developerDao;
    }

    public Dao<Group, Integer> getGroupDao() {
        return groupDao;
    }

    public Dao<Document, Integer> getDocumentDao() {
        return documentDao;
    }

    public Dao<Component, Integer> getComponentDao() {
        return componentDao;
    }


    public Dao<Code, Integer> getCodeDao() {
        return codeDao;
    }

    public Dao<Bill, Integer> getBillDao() {
        return billDao;
    }

}
