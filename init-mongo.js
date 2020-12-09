db.createUser(
  {
    user: "dbUser",
    pwd: "asdf1234",
    roles: [
      {
        role: "readWrite",
        db: "sensor-data"
      }
    ]
  }
)