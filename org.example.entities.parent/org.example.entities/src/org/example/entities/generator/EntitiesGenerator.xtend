/*
 * generated by Xtext 2.16.0
 */
package org.example.entities.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.entities.entities.Entity
import org.example.entities.entities.AttributeType
import org.example.entities.entities.BasicType
import org.example.entities.entities.EntityType

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EntitiesGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Entity)) {
			fsa.generateFile("entities/" + e.name + ".java", e.compile)
		}
	}

	def compile(Entity entity) {
		''' 
			package entities;
			
			public class «entity.name» «IF entity.superType != null» extends «entity.superType.name» «ENDIF»{
				«FOR attribute : entity.attributes»
					private «attribute.type.compile» «attribute.name»;
				«ENDFOR»
				
				«FOR attribute : entity.attributes»
					public «attribute.type.compile» get«attribute.name.toFirstUpper»(){
						return «attribute.name»;
					}
						
					public void set«attribute.name.toFirstUpper»(«attribute.type.compile» _arg){
						this.«attribute.name» = _arg;
					}
					
				«ENDFOR»
			}
		'''
	}

	def compile(AttributeType attributeType) {
		attributeType.elementType.typeToString + if(attributeType.array) "[]" else ""
	}

	def dispatch typeToString(BasicType type) {
		if(type.typeName == "string") "String" else type.typeName
	}

	def dispatch typeToString(EntityType type) {
		type.entity.name
	}

}
