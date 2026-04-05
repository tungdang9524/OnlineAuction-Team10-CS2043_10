# Week 1 Test Plan Draft

This document is the draft test plan for the Online Auction System project.
It covers three levels of testing:

- Client testing
- Server testing
- Integration testing

---

## 1. Client Test Draft

### CL-01: Display auction list
- Module: Client
- Scenario: User opens the client application
- Input/Action: Launch the client and open the auction list screen
- Expected Result: The auction list is displayed correctly without crashing
- Status: Draft

### CL-02: Display auction detail
- Module: Client
- Scenario: User selects an auction item
- Input/Action: Click an item from the auction list
- Expected Result: The detail screen shows item name, description, current price, start time, and end time
- Status: Draft

### CL-03: Submit valid bid
- Module: Client
- Scenario: User enters a valid bid value
- Input/Action: Enter a bid higher than the current price and submit
- Expected Result: The bid request is sent successfully and the client receives updated auction information
- Status: Draft

### CL-04: Submit invalid bid
- Module: Client
- Scenario: User enters an invalid bid value
- Input/Action: Enter a bid lower than or equal to the current price
- Expected Result: The client shows an error message and does not accept the bid as valid
- Status: Draft

### CL-05: Invalid input format
- Module: Client
- Scenario: User enters non-numeric or empty input for bid price
- Input/Action: Enter text, empty value, or invalid characters in the bid field
- Expected Result: The client shows validation error and prevents invalid submission
- Status: Draft

### CL-06: Server connection lost
- Module: Client
- Scenario: The server becomes unavailable while the client is running
- Input/Action: Disconnect the server during client usage
- Expected Result: The client shows connection error information and does not freeze
- Status: Draft

---

## 2. Server Test Draft

### SV-01: Create valid user
- Module: Server
- Scenario: Create a user with valid information
- Input/Action: Submit valid username, password, and role
- Expected Result: The user is created successfully
- Status: Draft

### SV-02: Reject invalid login
- Module: Server
- Scenario: User logs in with wrong password
- Input/Action: Submit correct username with incorrect password
- Expected Result: Login is rejected
- Status: Draft

### SV-03: Create auction item
- Module: Server
- Scenario: Seller creates a new auction item
- Input/Action: Submit valid item name, description, starting price, start time, and end time
- Expected Result: Auction item is created successfully
- Status: Draft

### SV-04: Accept valid bid
- Module: Server
- Scenario: Bid price is higher than current price
- Input/Action: Submit a valid bid
- Expected Result: The bid is accepted and highest bidder/current price are updated
- Status: Draft

### SV-05: Reject low bid
- Module: Server
- Scenario: Bid price is lower than or equal to current price
- Input/Action: Submit invalid bid value
- Expected Result: The bid is rejected and an error is returned
- Status: Draft

### SV-06: Reject bid after auction closed
- Module: Server
- Scenario: User tries to bid after auction end time
- Input/Action: Submit a bid when the auction status is closed/finished
- Expected Result: The bid is rejected
- Status: Draft

### SV-07: Update auction status
- Module: Server
- Scenario: Auction reaches end time
- Input/Action: Let the auction run until expiration
- Expected Result: Auction status changes correctly, for example from RUNNING to FINISHED
- Status: Draft

### SV-08: Determine winner correctly
- Module: Server
- Scenario: Auction finishes with multiple bids
- Input/Action: Close an auction after valid bids have been submitted
- Expected Result: The highest valid bidder is determined as the winner
- Status: Draft

### SV-09: Handle concurrent bidding safely
- Module: Server
- Scenario: Two or more users place bids at nearly the same time
- Input/Action: Submit concurrent bid requests
- Expected Result: No lost update, no duplicate winner, and final highest bid is consistent
- Status: Draft

---

## 3. Integration Test Draft

### IT-01: Client login through server
- Module: Integration
- Scenario: User logs in from client
- Input/Action: Enter login credentials on client and send request to server
- Expected Result: Server authenticates user and client receives correct login result
- Status: Draft

### IT-02: Seller creates auction and client receives data
- Module: Integration
- Scenario: A seller adds a new auction item
- Input/Action: Create item from seller side
- Expected Result: The server stores the item and clients can load the new auction data
- Status: Draft

### IT-03: Submit bid from client to server
- Module: Integration
- Scenario: Bidder places a valid bid
- Input/Action: Submit bid from client
- Expected Result: Server accepts the bid and returns updated auction information
- Status: Draft

### IT-04: Invalid bid error flow
- Module: Integration
- Scenario: Client sends invalid bid
- Input/Action: Submit a bid lower than or equal to current price
- Expected Result: Server rejects the request and client displays the correct error message
- Status: Draft

### IT-05: Realtime update between clients
- Module: Integration
- Scenario: Two clients are viewing the same auction
- Input/Action: Client A places a new bid
- Expected Result: Client B receives updated highest price information
- Status: Draft

### IT-06: Auction closing flow
- Module: Integration
- Scenario: Auction reaches end time while clients are connected
- Input/Action: Wait until auction end time
- Expected Result: Server closes the auction and connected clients receive updated status
- Status: Draft

---

## 4. Summary

This test plan draft is prepared for Week 1 deliverables.
The purpose is to define major scenarios for client, server, and integration testing before implementing detailed test cases and automated tests.