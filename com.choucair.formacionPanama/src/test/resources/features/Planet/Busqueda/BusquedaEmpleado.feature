#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Búsqueda Empleado
Permite realizar la búsqueda de empleados por diferentes criterios en el aplicativo planet


@SmokeTest
Scenario: Consultar el total de Analistas de Prueba en Panamá
Given Yo como usuario del aplicativo planet me logueo con mis credenciales usuario "wmedinan" y pass "Medellin123+" 
	And navego hasta la pantalla de busqueda empleado
When selecciono el cargo de analistas de prueba  
	And selecciono el pais Panama
	And realizar la busqueda
Then me muestra el listado de resultados


