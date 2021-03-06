UC06- Create Equipment
=======================

**Scope:** "SkynetGym" Gym management Software  
**Level:** User goal  
**Primary Actor:** Manager  
**Stakeholders and Interests:**

- Manager: Wants to add new equipment to inventory.

**Preconditions:** UC00 or UC01 has been completed and system knows the current user is a Manager.  
**Success Guarantee:** New equipment information is saved.  
**Main Success Scenario:**

1.	Manager selects to add equipment on system.
2.	System displays digital form with fields including: Name, picture, and quantity.
3.	Manager enters new equipment information into digital form.
4.	Manager submits form.
5.	System validates that all required fields are populated.
6.	System validates that the given equipment name is unique.
7.	System saves new equipment with the given information.
8.	System notifies manager that new equipment has been added.

**Extensions:**

*a. At any time, Manager is able to cancel operation.

1. Manager selects a cancel button.
2. System returns to Manager UI main page.

5a. Required fields are empty.

1. System notifies manager what required fields must be completed.

6a. Equipment name is already in use.

1.	System notifies manager that this equipment exists.
 
**Special Requirements:**

- Manager UI main page has button to create new equipment entry.

**Technology and Data Variations List:**

3a. An equipment image should be smaller than 10MB.

7a. System stores data in non-volatile form for future state restoration.

**Frequency of Occurrence:** A couple times per year
