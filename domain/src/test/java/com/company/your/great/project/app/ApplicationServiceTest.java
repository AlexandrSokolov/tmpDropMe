package com.company.your.great.project.app;

import com.company.your.great.project.commons.test.BaseTest;
import org.junit.jupiter.api.Test;

public class ApplicationServiceTest extends BaseTest {

  ApplicationService applicationService = new ApplicationService();

  @Test
  public void testHandle() {
    applicationService.handle();
  }
}
