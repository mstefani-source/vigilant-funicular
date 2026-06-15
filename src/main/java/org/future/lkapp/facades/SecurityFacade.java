package org.future.lkapp.facades;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class SecurityFacade {

    public List<String> extractCompanyIds() {

        SecurityContext securityContext = SecurityContextHolder.getContext();

        var authentication = securityContext.getAuthentication();

        if (authentication == null || !(authentication instanceof JwtAuthenticationToken jwtAuth)) {
            throw new SecurityException("Not JwtAuthentication");
        }

        Jwt jwt = jwtAuth.getToken();

        List<String> companyIds = jwt.getClaimAsStringList("company-ids");

        if (companyIds == null || companyIds.isEmpty()) {
            throw new IllegalStateException("user has no company-ids set in token");
        }

        return companyIds;
    }
}
