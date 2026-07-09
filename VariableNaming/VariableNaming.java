// 変数名を修正
public class VariableNaming {

  public void calculateNumbers() {
    /*
     * パターン1
    // アンダーバーを削除しキャメル記法に変更
     */
    int firstNumber = 10;
    int SecondNumber = 20;

    /*
     * パターン2
    // 可読性から変数名に規則性を持たせた方がわかりやすい
     */
    int Number1 = 5;
    int Number2 = 3;

    /*
     * パターン3
    // returnは予約後に該当するため、変数名として使用不可
    // 変数名を変更し、キャメル記法を使用
     */
    int resultValue = 100;

    // アンダーバーを削除し、キャメル記法に変更
    int totalResult = firstNumber + SecondNumber;
     // 上記変数名変更に伴い計算式も変更
    int sum = Number1 + Number2 + resultValue;

      // 出力も変更
    System.out.println(totalResult);
    System.out.println(sum);
  }
}
