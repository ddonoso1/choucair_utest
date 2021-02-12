#AutorDanielDonoso
@stories
Feature: Utest
    As a User, I want to create a new account for know the tester global comunity
    @scenario1
    Scenario: Create a new account in the platform
        Given Camilo wants to know the tester comunity
        When he write the personal information on the utest register forms
        | strFirstName | strLastName | strEmail                 | month  | day | year | languages | city     |  postalCode  | country  | yourComputer | version | computerLanguage |
        | Camilo       | Pedraza     | camilo.pedraza@gmail.com | August | 17  | 1997 | Italian   | Medellin |  050001      | Colombia | Windows      | 10      | Spanish          |
        Then he creates his new utest account
