/*
 * package com.webdevelopment.airline_reservation_system;
 * 
 * import javax.persistence.Column;
 * import javax.persistence.Entity;
 * import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType;
 * import javax.persistence.Id;
 * import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "users")
 * public class User {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "user_id")
 * private Long id;
 * 
 * @Column(name = "email", nullable = false, unique = true, length = 45)
 * private String email;
 * 
 * @Column(name = "user_name", nullable = false, length = 45)
 * private String userName;
 * 
 * @Column(name = "password", nullable = false, length = 65)
 * private String password;
 * 
 * public Long getId() {
 * return id;
 * }
 * 
 * public void setId(Long id) {
 * this.id = id;
 * }
 * 
 * public String getEmail() {
 * return email;
 * }
 * 
 * public void setEmail(String email) {
 * this.email = email;
 * }
 * 
 * public String getUserName() {
 * return userName;
 * }
 * 
 * public void setUserName(String userName) {
 * this.userName = userName;
 * }
 * 
 * public String getPassword() {
 * return password;
 * }
 * 
 * public void setPassword(String password) {
 * this.password = password;
 * }
 * }
 */