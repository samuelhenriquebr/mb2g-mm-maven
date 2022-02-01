package guru.springframework.converters;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import java.math.BigInteger;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T09:58:37-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.13 (Eclipse Adoptium)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        if ( user.getFirstName() != null ) {
            userCommand.setFirstName( new BigInteger( user.getFirstName() ) );
        }
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        if ( userCommand.getFirstName() != null ) {
            user.setFirstName( userCommand.getFirstName().toString() );
        }
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
