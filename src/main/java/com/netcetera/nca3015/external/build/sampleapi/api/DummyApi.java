package com.netcetera.nca3015.external.build.sampleapi.api;

import com.netcetera.nca3015.external.build.sampleapi.model.DummyModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyApi {

  @GetMapping("/dummy")
  public ResponseEntity<DummyModel> getDummyString() {
    return ResponseEntity.ok(new DummyModel("first", "second"));
  }
}
