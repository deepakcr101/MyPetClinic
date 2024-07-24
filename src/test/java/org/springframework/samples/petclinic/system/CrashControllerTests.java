

package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Test class for {@link CrashController}
 *
 * @author Deepak Kumar
 */
// Waiting https://github.com/spring-projects/spring-boot/issues/5574 ..good
// luck ((plain(st) UNIT test)! :)
class CrashControllerTests {

	CrashController testee = new CrashController();

	@Test
	void testTriggerException() {
		assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> testee.triggerException())
			.withMessageContaining("Expected: controller used to showcase what happens when an exception is thrown");
	}

}
