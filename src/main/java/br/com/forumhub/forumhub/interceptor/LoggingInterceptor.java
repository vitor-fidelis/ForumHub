package br.com.forumhub.forumhub.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Collections;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Lógica para executar antes do controle chegar ao handler (controller)
        logRequestDetails(request);
        return true; // Retornar true para permitir que o fluxo continue para o handler
    }

    private void logRequestDetails(HttpServletRequest request) {
        // Log do método HTTP e URI da requisição
        logger.info("Método HTTP: {}", request.getMethod());
        logger.info("URI: {}", request.getRequestURI());

        // Log dos cabeçalhos da requisição
        logger.info("Cabeçalhos:");
        Collections.list(request.getHeaderNames())
                .forEach(headerName -> logger.info("{}: {}", headerName, request.getHeader(headerName)));
    }
}


