package com.Sur0vy.controller;

import com.Sur0vy.model.*;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.sun.xml.internal.rngom.binary.GroupPattern;

public class DBController {

    private Dao<Vendor, int> vendorDao;
    private Dao<Organization, int> organizationDao;
    private Dao<Developer, int> developerDao;
    private Dao<Group, int> groupDao;
    private Dao<Document, int> documentDao;
    private Dao<Component, int> componentDao;
    private Dao<Code, int> codeDao;
    private Dao<Bill, int> billDao;

    private ConnectionSource connectionSource;

    private void initDatabase(String connectionString) throws Exception {

//        connectionSource = new

        vendorDao = DaoManager.createDao(connectionSource, Vendor.class);
        organizationDao = DaoManager.createDao(connectionSource, Organization.class);
        groupDao = DaoManager.createDao(connectionSource, Group.class);
        documentDao = DaoManager.createDao(connectionSource, Document.class);
        developerDao = DaoManager.createDao(connectionSource, Developer.class);
        componentDao = DaoManager.createDao(connectionSource, Component.class);
        codeDao  = DaoManager.createDao(connectionSource, Code.class);
        billDao = DaoManager.createDao(connectionSource, Bill.class);

    }



}
