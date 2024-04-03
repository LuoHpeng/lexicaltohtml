package lexical.resolver.convert.impl;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalVariableConverter.java create at 2024-03-08 10:22:20 by lhp
 * @since 1.0.0
 */
public class LexicalVariableConverter extends AbstractLexicalNodeConverter {


  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.VARIABLE;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();

    htmlNode.setHtmlLabel(LexicalTagEnum.SPAN_LABEL.getCode());
    htmlNode.setText(rtfTextNode.getText());
    htmlNode.setClassSelector(LexicalTagEnum.CLASS_SELECTOR_VARIABLE.getCode());
    htmlNode.setStyle(rtfTextNode.getStyle());
    htmlNode.setDraggable(rtfTextNode.getDirection());

    return htmlNode;
  }
}
