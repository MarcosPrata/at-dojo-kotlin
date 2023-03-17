CREATE TABLE users (
  id BIGINT PRIMARY KEY,
  username VARCHAR(255),
  name VARCHAR(255),
  email VARCHAR(255),
  created_at DATETIME DEFAULT NOW(),
  updated_at DATETIME DEFAULT NOW()
)
