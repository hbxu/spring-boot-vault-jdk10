# Spring Boot & HashiCorp Vault


## Introduction
A demo application that uses Java 10 and Spring Boot to showcase how Spring Cloud Vault can be used as a secure centralized configuration service.


### Order of execution

#### Windows

Start the demo spring boot application, you will see it fails to connect to HashiCorp Vault.
It uses the port 8080, because it's reading from the application.yml property file.


1. download https://www.vaultproject.io/downloads.html & unzip HashiCorp Vault

2. start the HashiCorp Vault application
```
cd <unzipped hashicorp vault directory>
vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
```

3. write initial configuration
```
# open a new command prompt
cd <unzipped hashicorp vault directory>

set VAULT_ADDR=http://127.0.0.1:8200
set VAULT_TOKEN=00000000-0000-0000-0000-000000000000

vault write secret/my-vault username=johndoe password=secret server.port=9090

vault read secret/my-vault
```

4. start/restart the demo spring boot application

5. go to http://localhost:9090/info, you will see that it's not running on port 8080 anymore


## Technology Stack
* Java 10
* Spring Boot 2.0.0 [RELEASE]
* Spring Cloud Finchley.M9 [MILESTONE]
