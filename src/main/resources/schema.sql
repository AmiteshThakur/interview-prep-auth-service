CREATE TABLE IF NOT EXISTS `user` (
    `user_id` int AUTO_INCREMENT  PRIMARY KEY,
    `user_name` varchar(100) NOT NULL,
    `user_email` varchar(100) NOT NULL,
    `user_password` varchar(20) NOT NULL,
    `user_role` varchar(20) NOT NULL,
     `is_active` bit NOT NULL,

  `user_mobile_number` varchar(20) NOT NULL,
  `user_security_role` varchar(20) NOT NULL,
  `created_at` date NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `updated_at` date DEFAULT NULL,
    `updated_by` varchar(20) DEFAULT NULL
);
