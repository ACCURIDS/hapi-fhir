package ca.uhn.fhir.jpa.dao.r4;

import ca.uhn.fhir.jpa.api.config.DaoConfig;
import ca.uhn.fhir.jpa.api.model.HistoryCountModeEnum;
import ca.uhn.fhir.rest.api.server.IBundleProvider;

import ca.uhn.fhir.util.StopWatch;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static ca.uhn.fhir.jpa.util.TestUtil.sleepAtLeast;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class JpaHistoryR4Test  extends BaseJpaR4SystemTest{

	private static final Logger ourLog = LoggerFactory.getLogger(JpaHistoryR4Test.class);

	@AfterEach
	public void after() {
		myDaoConfig.setHistoryCountMode(DaoConfig.DEFAULT_HISTORY_COUNT_MODE);
	}

	@Test
	public void testTypeHistory_TotalDisabled() {

	}

	@Test
	public void testTypeHistory_CountAccurate() {

	}

	@Test
	public void testTypeHistory_CountCacheEnabled() {

	}

	@Test
	public void testTypeHistory_CountCacheEnabled_WithOffset() {

	}

	@Test
	public void testSystemHistory_CountCacheEnabled() {


	}



}
