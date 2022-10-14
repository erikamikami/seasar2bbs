<%@page pageEncoding="UTF-8"%>
<html>
<body>
<h1>ログイン</h1>
<html:errors/>
<s:form>
  <label>メールアドレス</label><br>
  <html:text property="email" /><br>
  <label>パスワード</label><br>
  <html:text property="password" /><br>
  <s:submit property="login" value="送信" />
</s:form>
</body>
</html>