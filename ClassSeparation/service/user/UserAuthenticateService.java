// ユーザの認証クラス
public class UserAuthenticateService{

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  UserAuthenticateServiceublic User authenticate(LoginForm form) {
    User user = userMapper.findByEmail(form.getEmail());
    if (user == null) {
      throw new IllegalArgumentException("認証失敗");
    }

    if (!passwordEncoder.matches(form.getPassword(), user.getPassword())) {
      throw new IllegalArgumentException("認証失敗");
    }
    return user;
  }
} 
