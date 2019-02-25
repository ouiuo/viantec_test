# viantec_test
Java REST CRUD


URL: /getall
METHOD: GET


URL: /getone?id=ID
METHOD: GET
PARAM: ID long


URL: /createmusic
METHOD: POST
PARAM:
  {
  "projectname": String,
  "title":       String
  }
  
URL: /delete?id=ID
METHOD: POST
PARAM: ID long



URL:  /update?id=ID
METHOD: PUT
PARAM: ID long
  {
  "projectname": String,
  "title":       String
  }
