/*
 * This file is part of the Soapbox Race World core source code.
 * If you use any of this code for third-party purposes, please provide attribution.
 * Copyright (c) 2020.
 */

package com.soapboxrace.core.api;

import com.soapboxrace.core.bo.AchievementBO;
import com.soapboxrace.core.bo.ParameterBO;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ReloadAchievements")
public class ReloadAchievements {

    @EJB
    private ParameterBO parameterBO;

    @EJB
    private AchievementBO achievementBO;

    @POST
    @Produces(MediaType.TEXT_HTML)
    public String reloadAchievements(@FormParam("adminAuth") String token) {
        String adminToken = parameterBO.getStrParam("ADMIN_AUTH");

        if (adminToken == null) {
            return "ERROR! no admin token set in DB";
        }

        if (adminToken.equals(token)) {
            achievementBO.loadData();
            return "SUCCESS! reloaded achievements data";
        } else {
            return "ERROR! invalid admin token";
        }
    }
}
