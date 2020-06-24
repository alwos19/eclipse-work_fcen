package com.jaramillos.springboot.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.jaramillos.springboot.backend.apirest.models.entity.Usuario;
import com.jaramillos.springboot.backend.apirest.models.services.IUsuarioService;
import com.jaramillos.springboot.backend.apirest.models.services.UsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	private IUsuarioService UsuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario = UsuarioService.findByUsername(authentication.getName());
		
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("info_adicional", "Hola token!: ".concat(authentication.getName()));
		
		info.put("nombre_usuario", usuario.getId()+ "" +usuario.getUsername());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}
