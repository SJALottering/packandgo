package za.ca.cput.adp3capstone.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ca.cput.adp3capstone.domain.User;
import za.ca.cput.adp3capstone.repository.IUserRepository;
import za.ca.cput.adp3capstone.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

    class UserFactoryTest {

        private static IUserRepository repository = UserRepository.getRepository();

        private User user = UserFactory.createUser("1", "Anita Johnson", "anita@example.com", "07826482452");

        @Test
        void a_create() {
            User created = repository.create(user);
            assertNotNull(created);
            System.out.println(created.toString());
        }

//        @Test
//        void b_read() {
//            User read = repository.read(user.getId());
//            assertNotNull(read);
//            System.out.println(read.toString());
//        }
        @Test
        void c_update(){
            User updatedUser= UserFactory.createUser("2", "Anita Daniels", "daniels@example.com", "0782456452");


            User result = repository.update(updatedUser.getId(), updatedUser);
            assertNotNull(result);
            assertEquals("Anita Johnson", result.getName());
            System.out.println("Updated: " + result);
        }
        @Test
        @Disabled
        void d_delete() {
            assertTrue(repository.delete(user.getId()));
            System.out.println("Success: user deleted");
        }

        @Test
        void e_getAll() {
            System.out.println(repository.getAll());
        }
    }


