package net.rentalhost.plugins.php.hammer.inspections.codeSmell

import net.rentalhost.plugins.php.hammer.services.TestCase

class OverrideMissingInspectionTestCase : TestCase() {
  fun testAll(): Unit = testInspection(
    OverrideMissingInspection::class.java,
    listOf("default", "dummy/Namespaced.php")
  )

  fun testAutoImport(): Unit = testInspection(
    OverrideMissingInspection::class.java,
    "autoImport"
  )

  fun testAliasExists(): Unit = testInspection(
    OverrideMissingInspection::class.java,
    "aliasExists"
  )
}
