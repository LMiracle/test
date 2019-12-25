package com.miracle.testreptile.service.impl;

import com.miracle.testreptile.domain.Applicant;
import com.miracle.testreptile.service.ApplicantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Miracle
 * @date 2019/12/24 14:05
 */
@Slf4j
@Service
public class ApplicantServiceImpl implements ApplicantService {

    private final static RestTemplate restTemplate = new RestTemplate();

    @Override
    public void getAndSaveApplicant() {
        getApplicantList();
    }

    private List<Applicant> getApplicantList(){
        String dataUrl = "https://mtongzhen.58.com/resume/resumelist";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.COOKIE, "cookieuid1=c5/nfF4BpmWELcO3BMjmAg==; wmda_uuid=517ba9f73905f4e5de850a19d57502c5; wmda_new_uuid=1; wmda_session_id_10104579731767=1577166437965-869dc80e-b5e9-93f3; wmda_visited_projects=%3B10104579731767; xxzl_deviceid=%2FxbXWtZN52Xu3M9XtqJSHAcU0na9GJyma2R%2FRvW%2BaI%2BILBktavdvvlklkPREEn1M; PPU=\"UID=57745354270741&UN=%E5%B9%BF%E5%B7%9E%E4%B8%9C%E5%BA%8F&TT=6bfd8b0739ce7c35920e29bf83063f67&PBODY=I4odWnM-jyDLHFWQiTZXKFFx0bDArh7paPx1NjLXKpcA5b_Q5iphwTM9YJDAdS6sIIBiGz_Sd7rToEh4yvcm8iEUpskoxyBQwV6LAGKTB4GqmghbbNgpJBeZH3p0mnYmKUypJCWcHfO2GJa1XMZL8Fi1RA7mH6q_k-4_q8mVh3s&VER=1\"; www58com=\"UserID=57745354270741&UserName=%E5%B9%BF%E5%B7%9E%E4%B8%9C%E5%BA%8F\"; 58cooper=\"userid=57745354270741&username=%E5%B9%BF%E5%B7%9E%E4%B8%9C%E5%BA%8F\"; 58uname=%E5%B9%BF%E5%B7%9E%E4%B8%9C%E5%BA%8F; id58=c5/nn14BprQzruPxuk8XAg==; 58tj_uuid=f2878e1b-426c-43c7-97e6-0ee7a6b826bc; new_uv=1; qz_gdt=; utm_source=; spm=; init_refer=https%253A%252F%252Fpassport.58.com%252Flogin%253Fsource%253Dm-my%2526path%253Dhttps%25253A%25252F%25252Fmtongzhen.58.com%25252Fresume%25252Fmanager%25253Ffrom%25253Dwxcd; new_session=0");
        //httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        MultiValueMap<String, Integer> params = new LinkedMultiValueMap<>();
        params.add("pageSize", 10);
        params.add("pageNum", 1);
        HttpEntity<MultiValueMap<String, Integer>> entity = new HttpEntity<>(params, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(dataUrl, HttpMethod.POST, entity, String.class);
        log.info("token info :" + responseEntity.getBody());
        return null;
    }
}
