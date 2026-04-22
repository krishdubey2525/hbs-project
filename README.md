HBS - Hotel Booking System
A full-stack hotel management and booking platform designed with a React frontend and a Spring Boot backend. The system provides a seamless experience for customers to book rooms and for admins to manage the hotel's operations.

🚀 Features
For Customers
Room Selection: Choose between Single, Double, Triple, and Multi-room types.

Availability Logic: Real-time checking of room availability. If a room is booked for a specific duration, it shows as "Checked In/Occupied" and prevents overlapping bookings.

Hotel Facilities: Browse available amenities and services.

Booking History: Track check-in and check-out dates.

Email Notifications: Receive automated confirmation emails once a room is successfully booked.

Payment Flow: Currently supports "Cash on Reception" with a roadmap for digital payment integration.

For Admins
Dashboard: Full control over room inventory and user management.

Room Management: Add, update, or remove room details and pricing.

Booking Oversight: View and manage all guest reservations.

Security & Tech
JWT Authentication: Secure login and session management for both User and Admin roles.

Role-Based Access Control (RBAC): Ensures users can only access appropriate resources.

Responsive UI: Optimized for various screen sizes.

🛠️ Tech Stack
Frontend:

React.js

Axios (API Calls)

CSS3 / Bootstrap

Backend:

Java 17+

Spring Boot (Data JPA, Security, Web)

JWT (JSON Web Token)

Spring Mail (Email Service)

Database:

MySQL / PostgreSQL (SQL)
