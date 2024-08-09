import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserCommand userToCommand (User user);
    User commandToUser(UserCommand userCmd);
}
