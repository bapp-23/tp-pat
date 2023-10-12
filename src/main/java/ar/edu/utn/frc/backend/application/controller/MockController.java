package ar.edu.utn.frc.backend.application.controller;

import static lombok.AccessLevel.PRIVATE;
import static org.apache.commons.lang3.StringUtils.isBlank;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frc.backend.application.ResponseHandler;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.val;

/**
 * MockController se usa para probar la generación de actividades de un token,
 * en un proyecto real esta logica es parte de la configuración de seguridad de un proyecto.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mock")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class MockController {


	@GetMapping
	public ResponseEntity<Object> mock(HttpServletRequest request) {

/*		val token = request.getHeader("API-TOKEN");
		if (isBlank(token)) {
			return ResponseHandler.unauthorized();
		}
		val userAgent = request.getHeader("User-Agent");
		val requestUri = request.getRequestURI();
		val ip = request.getRemoteAddr();
		val personalAccessTokenOptional = personalAccessTokenService
			.withToken(token);
		if (personalAccessTokenOptional.isEmpty()) {
			return ResponseHandler.unauthorized();
		}
		val personalAccessToken = personalAccessTokenOptional.get();
		if (personalAccessToken.isValid()) {
			personalAccessToken.addActivity(ip, userAgent, requestUri);
			personalAccessTokenService.save(personalAccessToken);
			return ResponseHandler.success();
		}*/
		return ResponseHandler.unauthorized();
	}
}
