<%@page pageEncoding="UTF-8"%>
<html>
<body>
<h1>掲示板詳細</h1>
<s:link href="/">Topに戻る</s:link>
<h2><c:out value="${bbs.title}"></c:out></h2><br>
  <c:forEach items="${bbs.commentList}" var="comment">
    <hr>
    <c:out value="${comment.comment}"></c:out>
  </c:forEach>
<div>
<hr>
  <s:form>
    <html:textarea property="comment" />
    <html:hidden property="bbsId" value="${bbs.id}" />
    <s:submit property="createComment" value="コメント投稿" />
  </s:form>
</div>
</body>
</html>