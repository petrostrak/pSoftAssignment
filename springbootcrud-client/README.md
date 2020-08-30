# springbootcrud-client

> springbootcrud Web Client

## Supplier entity
``` bash
# Successfully store Supplier entities in DB
Added createDatabaseIfNotExist=true parameter in application.properties and liquibase.properties for improving test efficiency
# Created CRUD
Added complete CRUD operations for the Supplier entity
# Search API
Added Search by companyName and vatNumber using Hibernate Query Language
# Suppliers Tab
Added suppliers tab to serve our purposes that is listening to http://localhost:9000/#/suppliers
```
## Build Setup Server-side

``` bash
# install dependencies
Clean
Build with Dependencies

# serve
Run Application.java
This step will also create our DB automatically
```

## Build Setup Client-side

``` bash
# install dependencies
npm install

# serve
npm run dev
or
npm run start (this will trigger npm run dev)
```

## Using the Web App

``` bash
# Visit
http://localhost:9000
```
