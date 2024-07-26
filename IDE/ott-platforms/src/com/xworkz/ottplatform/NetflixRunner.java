package com.xworkz.ottplatform;

import com.xworkz.ottplatform.dao.OttPlatformDetailsDao;
import com.xworkz.ottplatform.dto.OttPlatformDetailsDto;

public class NetflixRunner {

    public static void main(String[] args) {
        OttPlatformDetailsDto dto = new OttPlatformDetailsDto();
        dto.platformId = 1;
        dto.platformName = "Movie Hub";
        dto.ownerCompany = "Movie Hub Inc.";
        dto.subscriptionCost = 999;
        dto.numberOfSubscribers = 5000000;
        dto.contactSupport = "support@moviehub.com";
        dto.contentType = "Movies and TV Shows";

        OttPlatformDetailsDao dao = new OttPlatformDetailsDao();
        dao.createPlatform(dto);
        dao.getPlatformDetails();
    }
}

