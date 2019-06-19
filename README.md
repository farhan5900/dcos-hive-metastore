# DC/OS Apache Hive Metastore Service

This is the source repository for the [DC/OS Apache Hive Metastore](https://mesosphere.com/service-catalog/hive-metastore) package.

Service documentation can be found here : [DC/OS Apache Hive Metastore Documentation](https://docs.mesosphere.com/services/hive-metastore/)

## Integration Test Builds Matrix

|                | DC/OS 1.11 | DC/OS 1.12 | DC/OS Master |
| -------------- | ---------- | ---------- | ------------ |
| **Open**       | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_111_Open&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_111_Open)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_112_Open&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_112_Open)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_master_Open&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_master_Open)/statusIcon"/></a> |
| **Permissive** | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_111_Permissive&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_111_Permissive)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_112_Permissive&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_112_Permissive)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_master_Permissive&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_master_Permissive)/statusIcon"/></a> |
| **Strict**     | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_111_Strict&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_111_Strict)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_112_Strict&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_112_Strict)/statusIcon"/></a> | <a href="https://teamcity.mesosphere.io/viewType.html?buildTypeId=DataServices_HiveMetastore_IntegrationTests_DCOS_master_Strict&guest=1"><img src="https://teamcity.mesosphere.io/app/rest/builds/buildType:(id:DataServices_HiveMetastore_IntegrationTests_DCOS_master_Strict)/statusIcon"/></a> |


## Building the package

In order to build a stub-universe hosted on an S3 bucket run:
```bash
./frameworks/hive-metastore/build.sh aws
```
