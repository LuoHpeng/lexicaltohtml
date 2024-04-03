package lexical.resolver.convert.impl;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalTableConverter.java create at 2024-03-08 14:17:28 by lhp
 * @since 1.0.0
 */
public class LexicalTableConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.TABLE;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();
    htmlNode.setHtmlLabel(LexicalTagEnum.TABLE_LABEL.getCode());
    htmlNode.setClassSelector(LexicalTagEnum.CLASS_SELECTOR_TABLE.getCode());
    htmlNode.setDirection(rtfTextNode.getDirection());

    return htmlNode;
  }
}
