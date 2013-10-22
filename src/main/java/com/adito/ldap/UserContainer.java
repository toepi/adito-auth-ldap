
				/*
 *  Adito
 *
 *  Copyright (C) 2003-2006 3SP LTD. All Rights Reserved
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public
 *  License along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
			
package com.adito.ldap;

import com.adito.policyframework.PrincipalCache;

public final class UserContainer extends PrincipalCache<LdapUser> {

    private static final String USERS_CACHE_PREFIX = "users";
    private static final String MESSAGE_BUNDLE = "ldap";
    private static final String CACHE_FULL_MESSAGE = "ldap.cache.user.full";
    public static final UserContainer EMPTY_CACHE = new UserContainer(0, true, false, "");
    private final String baseDN;

    UserContainer(int cacheSize, boolean inMemoryCache, boolean usernamesAreCaseSensitive, String baseDN) {
        super(cacheSize, inMemoryCache, usernamesAreCaseSensitive, USERS_CACHE_PREFIX, MESSAGE_BUNDLE, CACHE_FULL_MESSAGE);
        this.baseDN = baseDN.toUpperCase();
    }


}