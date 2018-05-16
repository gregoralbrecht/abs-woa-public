# All Test Cases
## 1. Basic Registration (17.04.2018)
### 1.1. Agreed Registration
   **Test:** Tribe sends registration request with tribe id before deadline. (Action: TribeRegistration)
   
   **Expected result:** Registration desk sends agree and afterwards informs with the name of the tribe. (Response concept: Tribe)
### 1.2. Refused Registration
   **Test:** Tribe sends registration request with tribe id after deadline. (Action: TribeRegistration)

   **Expected Result:** Registration desk sends refuse.
## 2. Initial allocation (26.04.2018)
### 2.1. Inform the initial allocation 
   **Test:** Registration desk inform to the tribe where the units are located and the resources that the tribe owns. (Action: Allocate)
   
   **Expected result:** The initial location of each unit (three units) and the resources that each tribe owns (125 gold, 75 stone, 100 wood and 3 food). (Response concept: Units and Resources)
## 3. Creating and Killing Units(08.05.2018)
### 3.1. Unit Creation
**Test:** Unit sends a request to platform for creating a new unit.

**Expected Result:** Platform agrees and then sends an inform with the name of the unit.
### 3.2. Unit Death
**Test:** Event Manager sends an inform to unit about killing itself.

**Expected Result:** Unit dies.
### 3.3. Unit Subscription
**Test:** Unit/tribe subscribes in Entity Manager.

**Expected Result:** Entity Manager agrees and sends informs to the unit/tribe.


## 4. Movement (16.05.2018)
### 4.1. Unit Move

**Test:** Unit request to move to an allowed position.

**Expected Result:** The movement is accepted and an Inform is sent.


**Test:** Unit request to move to an non allowed position.

**Expected Result:** The movement is refused.


**Test:** Unit succesfully move to a new position.

**Expected Result:** The entity manager sends an Inform to the unit with: Units Present and Position.
