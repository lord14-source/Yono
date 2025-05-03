package com.sbi.yono.Yono30.External;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "addhar-service", url = "${addhar-service.url}")
public interface AddharService {
    @GetMapping("/{uuid}")
    Addhar getAddhar(@PathVariable("uuid") String uuid);
}


