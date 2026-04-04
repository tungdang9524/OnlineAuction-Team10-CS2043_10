# Online Auction - Team 10 - CS2043_10

Deadline/yêu cầu của các tuần: https://docs.google.com/document/d/10h_yi4x5tVvtm_yBHK33yzg4sSSWJQ2RazJdFe6nEBs/

Kiến trúc tổng thể: Client–Server

Phía client: MVC

Giao tiếp: Socket TCP + JSON

Build tool: Maven

Ngôn ngữ: Java 17

UI: JavaFX + FXML

Test: JUnit 5

Data giai đoạn đầu: in-memory, tuần sau nối DB

Cách chạy:

mvn clean compile

cd server

mvn exec:java "-Dexec.mainClass=com.auction.server.ServerApp"


(Tab mới)

cd client

mvn exec:java "-Dexec.mainClass=com.auction.client.App"
## ERD tuần 1

```text
+------------------+
|      users       |
+------------------+
| id (PK)          |
| username         |
| password_hash    |
| full_name        |
| email            |
| role             |
| user_status      |
| created_at       |
+------------------+

        1
        |
        |
        n

+------------------+
|      items       |
+------------------+
| id (PK)          |
| seller_id (FK)   |
| name             |
| description      |
| starting_price   |
| created_at       |
+------------------+
```