package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.User;

import java.util.Optional;

    // Repository Interface
    public interface IUserRepository {
        void save(User user);
        Optional<User> findById(String id);
        void deleteById(String id);

    }


