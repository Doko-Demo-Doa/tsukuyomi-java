package com.clipsub.tsukuyomi.constant;

public final class SecurityConstants {
    public static final String JWT_SIGNING_KEY = "tsukuyomi_23875354cb6ca495d30ba72d22e0bac875c3fe47ea8c46sdjfsf";

    public static final String AUTHORITIES_KEY = "auth";
    public static final String COMPANY_ID_KEY = "companyId";
    public static final String REMEMBER_ME_KEY = "rememberMe";

    public static final long TOKEN_VALIDITY_IN_SECONDS = 3600;
    public static final long TOKEN_VALIDITY_IN_SECONDS_FOR_REMEMBERME = 3600 * 24;

    public static final long REFRESH_TOKEN_VALIDITY_IN_SECONDS = TOKEN_VALIDITY_IN_SECONDS * 24;
    public static final long REFRESH_TOKEN_VALIDITY_IN_SECONDS_FOR_REMEMBERME = TOKEN_VALIDITY_IN_SECONDS_FOR_REMEMBERME * 30;
}
