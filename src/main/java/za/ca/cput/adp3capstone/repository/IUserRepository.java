package za.ca.cput.adp3capstone.repository;
//IUserRepository class
//Author: Anita Lottering 222141395
//Date: 28 March 2025

import za.ca.cput.adp3capstone.domain.User;

import java.util.HashMap;
import java.util.Optional;

    public interface IUserRepository extends IRepository<User, String>{
        HashMap<String, User> getAll();
    }


