/*
 * generated by Xtext 2.16.0
 */
package org.example.entities.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.example.entities.ide.contentassist.antlr.internal.InternalEntitiesParser;
import org.example.entities.services.EntitiesGrammarAccess;

public class EntitiesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EntitiesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EntitiesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
			builder.put(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0(), "rule__BasicType__TypeNameAlternatives_0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeTypeAccess().getGroup(), "rule__AttributeType__Group__0");
			builder.put(grammarAccess.getAttributeTypeAccess().getGroup_1(), "rule__AttributeType__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getEntitiesAssignment(), "rule__Model__EntitiesAssignment");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getAttributesAssignment_4(), "rule__Entity__AttributesAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_0(), "rule__Attribute__TypeAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0(), "rule__AttributeType__ElementTypeAssignment_0");
			builder.put(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0(), "rule__AttributeType__ArrayAssignment_1_0");
			builder.put(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1(), "rule__AttributeType__LengthAssignment_1_1");
			builder.put(grammarAccess.getEntityTypeAccess().getEntityAssignment(), "rule__EntityType__EntityAssignment");
			builder.put(grammarAccess.getBasicTypeAccess().getTypeNameAssignment(), "rule__BasicType__TypeNameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EntitiesGrammarAccess grammarAccess;

	@Override
	protected InternalEntitiesParser createParser() {
		InternalEntitiesParser result = new InternalEntitiesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EntitiesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
