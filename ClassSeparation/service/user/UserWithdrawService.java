public class UserWithdrawService {
// ユーザーの退会のクラス

  private final UserMapper userMapper;
  private final PasswordEncoder passwordEncoder;

  // ユーザー退会
  public void deactivateUser(Long userId) {
    User user = userMapper.findById(userId);
    if (user == null) {
      throw new IllegalArgumentException("存在しません");
    }

    user.setDeleted(true);
    userMapper.update(user);
  }
}
