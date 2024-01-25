# Projeto admin

* Criar 3 módulos: domain, application, infrastructure
* No módulo application, é necessário importar o módulo domain

application -> build.gradle 

`dependencies {
    implementation(project(":domain")) ... }`

* Para o módulo infrastructure nós adicionamos os 2 módulos do mesmo modo acima.
* 