// ユーザーの登録のクラスと認証クラスは別のファイルに移動
public class UserSearchService {

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  // ユーザー一覧取得
  public List<User> getActiveUsers() {
    List<User> users = userMapper.findAll();
    List<User> result = new ArrayList<>();

    for (User user : users) {
      if (!user.isDeleted()) {
        result.add(user);
      }
    }
    return result;
  }

  // メール存在チェック
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }
}

