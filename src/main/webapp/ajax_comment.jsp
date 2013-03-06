<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="commentaire" style="margin-bottom: 20px;"><p><span class="auteur"><s:property value="%{#session.utilisateur.nomUtilisateur}"/></span> a dit :<br/><span class="contenu"><s:property value="contenu"/></span></p></div>