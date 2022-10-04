
Feature: Buying and Selling Stocks 
 
  Scenario:   Buying and cancelled Stock
  
  
  Given  User can lauch chrome Browser
  When   User Open the AngleBroking login webpage URL. "https://trade.angelbroking.com/login/"
  Then   User pass the UserID and Password
  And    Click on  Signin button
  When   Shows hidden division popups and Close it
  Then   Click on Search icon and search sbin Stock. "sbin"
  And    Select sbin NSE 
  Then   Click on Buy button 
  When   Shows SBIN Chied Brawser popups and select the quantity     
  Then   Select the Price clear first and type ne price "420" and Select the Product type AMO INTRADAY
  And    Click on Submit button
  Then   Open new small window click on Confirm button
  When   Confirm the stock and select that stock and click on cancle all button
  Then   Open alert popups click on OK button
  And    Show the new popups give the message Order cancelld successfully click on OK button
  Then   Close the Browser