package za.ca.cput.adp3capstone.repository;

import za.ca.cput.adp3capstone.domain.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Repository Implementation
    public class UserRepository implements IUserRepository {
        private final Map<String, User> userDatabase = new HashMap<>();
    private User user;
    private String id;

    @Override
        public void save(User user) {
        this.user = user;
        userDatabase.put(user.getId(), user);
        }

        @Override
        public Optional<User> findById(String id) {
            return Optional.ofNullable(userDatabase.get(id));
        }

        @Override
        public void deleteById(String id) {
            this.id = id;
            userDatabase.remove(id);
        }
    }
