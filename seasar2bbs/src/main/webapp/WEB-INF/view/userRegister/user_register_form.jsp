<%@page pageEncoding="UTF-8"%>
<html>
<body>
<h1>会員登録</h1>
<html:errors/>
<s:form method="POST">
  <div>
    <label>ユーザー名</label><br>
    <html:text property="name" />
  </div>

  <div>
    <label>性別</label><br>

      <label><input type="radio" name="genderId" value="1" />男性</label>
      <label><input type="radio" name="genderId" value="2" />女性</label>
      <label><input type="radio" name="genderId" value="0" />未設定</label>
  </div>

  <div>
    <label>メールアドレス</label><br>
    <html:text property="email" />
  </div>

  <div>
    <label>パスワード</label><br>
    <html:text property="password" />
  </div>

  <div>
    <s:submit property="register" value="送信" />
  </div>
</s:form>
</body>
</html>