package lexical.resolver.convert.impl;

import java.util.List;
import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;

/**
 * @author lhp
 * @version LexicalTextConverter.java create at 2024-03-07 17:59:46 by lhp
 * @since 1.0.0
 */
public class LexicalTextConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.TEXT;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();
    htmlNode.setStyle(rtfTextNode.getStyle());
    htmlNode.setText(rtfTextNode.getText());
    htmlNode.setClassSelector(convert2ClassSelector(rtfTextNode.getFormat()));
    htmlNode.setHtmlLabel(getHtmlLabel(rtfTextNode.getFormat()));

    return htmlNode;
  }

  public String convert2ClassSelector(String format) {
    if (isAllDigits(format)) {
      List<Integer> integers = analyticValue(Integer.parseInt(format));
      String classSelector = convert2ClassSelectorFromNumber(integers);
      return classSelector;
    }
    return format;
  }


}
