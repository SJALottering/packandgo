package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.User;

import java.util.HashMap;
import java.util.Optional;

    public interface IUserRepository extends IRepository<User, String>{
        HashMap<String, User> getAll();
    }


