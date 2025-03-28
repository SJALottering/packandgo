package za.ca.cput.adp3capstone.repository;
//UserRepository class
//Author: Anita Lottering 222141395
//Date: 28 March 2025
import za.ca.cput.adp3capstone.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements IUserRepository {
    private final HashMap<String, User> users = new HashMap<>();
    private static IUserRepository repository;

    public static IUserRepository getRepository() {
        if(repository == null) {
                repository = new UserRepository();
        }
        return new UserRepository();
    }

    @Override
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User update(String userId, User user) {
            User foundUser = users.get(userId);
            User updatedUser = user;

            users.put(userId, updatedUser);
            return updatedUser;
    }

    @Override
    public User get(String id) {
            User foundUser = users.get(id);
            return foundUser;
    }

    @Override
    public boolean delete(String id) {
            users.remove(id);
            return false;
    }

    @Override
    public HashMap<String, User> getAll() {
            HashMap<String, User> userMap = users;
            return userMap;
    }
}
