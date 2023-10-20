package net.rentalhost.plugins.php.hammer.extensions.psi

import com.jetbrains.php.lang.psi.PhpPsiElementFactory
import com.jetbrains.php.lang.psi.elements.Method
import com.jetbrains.php.lang.psi.elements.PhpAttributesList
import net.rentalhost.plugins.php.hammer.services.ClassService

fun Method.addAttribute(attributeClass: String) {
  val attributesList = PhpPsiElementFactory.createAttributesList(this.project, "\\${attributeClass}")
  val attributeNew = this.firstChild.insertBefore(attributesList) as PhpAttributesList

  ClassService.import(attributeNew.attributes.firstOrNull()?.classReference)
}
