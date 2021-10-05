Feature: Book the room in a hotel

Scenario Outline:
login and book rooms multiple times 
Given open adactin application 
When enter "<username>" and "<password>" and login to the website 
And book the room "<location>"  "<hotel>" "<roomtype>" "<noroom>" "<adult>"
And room booked with id "<firstname>" "<lastname>" "<address>" "<ccnum>" "<cctype>" "<expmonth>" "<expyear>" "<cvv>"
Then display order id
Examples:
|username|password|location|hotel|roomtype|noroom|adult|firstname|lastname|address|ccnum|cctype|expmonth|expyear|cvv|
|Jayaprakashjp|Jpshiva@96|London|Hotel Creek|Deluxe|1|2|moni|rajay|address|1234567890123456|VISA|7|2022|123|
|Jayaprakashjp|Jpshiva@96|Paris|Hotel Hervey|Deluxe|1|2|M|RJ|Add|6543210987654321|MAST|3|2022|234|
|Jayaprakashjp|Jpshiva@96|New York|Hotel Sunshine|Super Deluxe|1|2|MJ|JA|addreSS|2589630147321456|AMEX|8|2022|666|

