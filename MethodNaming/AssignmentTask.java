// メソット名の修正
public class AssignmentTask {

  /*
   * パターン1
  // 内部処理を表す動詞 + 対象の名詞
   */
  public void sayHello(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン2
  // 内部処理を表す動詞 + 対象の名詞
   */
  public void greetHello(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン3
  // 動詞を先頭に表示する。名前を出力する。
   */
  public void printUserName(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン4
  // 動詞を先頭に表示する。値を返すため、getにした方が良い。
   */
  public String getUserName(User user) {
    return user.getName();
  }

  /*
   * パターン5: 
  // キャメルケースにて表示 言葉の区切りに大文字
   */
  public void printUserInfo(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン6
  // newの使用は推奨されていないため、表記の変更
   */
  public User createUser(String name) {
    return new User(name);
  }

  /*
   * パターン7
  // ブール値を返すメソッドisを前置すべき
   */
  public boolean isActive(User user) {
    return user.isActive();
  }

}