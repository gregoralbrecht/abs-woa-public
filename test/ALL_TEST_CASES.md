# All Test Cases
## 1. Basic Registration (17.04.2018)
### 1.1. Agreed Registration
   **Test:** Tribe sends registration request with tribe id before deadline. (Action: TribeRegistration)
   
   **Expected result:** Registration desk sends agree and afterwards informs with the name of the tribe. (Response concept: Tribe)
### 1.2. Refused Registration
   **Test:** Tribe sends registration request with tribe id after deadline. (Action: TribeRegistration)

   **Expected Result:** Registration desk sends refuse.
## 1. Initial allocation (26.04.2018)
### 1.1. Inform the initial allocation 
   **Test:** Registration desk inform to the tribe where the units are located and the resources that the tribe owns. (Action: Allocate)
   
   **Expected result:** The initial location of each unit (three units) and the resources that each tribe owns (125 gold, 75 stone, 100 wood and 3 food). (Response concept: Units and Resources)

