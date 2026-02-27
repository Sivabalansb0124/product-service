\# Product Service



\## Purpose

Manages product catalog (CRUD operations).



\## Tech Stack

\- Spring Boot

\- MongoDB



\## Actions Taken

\- Configured MongoDB connection.

\- Implemented endpoints for product CRUD.

\- Added CORS configuration for frontend integration.

\- Verified product creation and retrieval via Postman.



\## Endpoints

\- `GET /products` → List all products

\- `POST /products` → Add new product

\- `PUT /products/{id}` → Update product

\- `DELETE /products/{id}` → Delete product



\## Notes

\- MongoDB must be running on port 27017.

\- Products are linked to sellers via "sellerId".



