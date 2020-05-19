package com.ivan.aks.core.logger.tests

import com.ivan.aks.core.logger.data.ThreadLogsMapProvider
import groovy.util.logging.Slf4j
import org.testng.Assert
import org.testng.annotations.AfterSuite
import org.testng.annotations.Test

@Slf4j
class BaseTest {
    @AfterSuite
    void writeSuitLogs() {
        ThreadLogsMapProvider.initializeLogFile()
        ThreadLogsMapProvider.writeLogsToFile()
    }

    @Test
    void main() {
        log.info('Test is started')
        String a = 'a'
        String b = 'b'

        Assert.assertNotEquals(a, b)
        log.info('Test is finished')
    }
}
