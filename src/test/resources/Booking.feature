Feature: verify Hotel booking in Adactin 

Scenario Outline: Verify adactin login with valid credentials
 
 Given user is on adactin login page
 When user enter the valid "<username>" and "<pwd>"
 Then user should click login button
 When user enter the "<location>","<numberofroom>","<checkin>","<checkout>","<adults>"
 Then user should click search button
 When user select the hotel name
 Then click the continue
 When user enter the "<first>","<last>","<billing>","<ccno>","<cctpe>","<mon>","<yr>","<ccv>"
When click the logout
Examples:
|username|pwd|location|numberofroom|checkin|checkout|adults|first|last|billing|ccno|cctpe|mon|yr|ccv|
|Abarajitha|9Z17ON|sydney|2-Two|21/12/2020|22/12/2020|1-One|abz|muru|xxx|1234567890123456|visa|march|2024|123|