package za.ca.cput.adp3capstone.factory;
//UserFactory class
//Author: Anita Lottering 222141395
//Date: 28 March 2025

import za.ca.cput.adp3capstone.domain.User;

public class UserFactory {
    // za.ca.cput.adp3capstone.domain.User Factory
        public static User createUser(String id, String name, String email, String phoneNumber) {
            return new User.Builder()
                    .setId(id)
                    .setName(name)
                    .setEmail(email)
                    .setPhoneNumber(phoneNumber)
                    .build();
        }
    }


