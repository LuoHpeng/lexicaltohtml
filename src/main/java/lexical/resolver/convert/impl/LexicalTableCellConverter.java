package lexical.resolver.convert.impl;

import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.AbstractLexicalNodeConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;
import lexical.resolver.enums.LexicalTagEnum;

/**
 * @author lhp
 * @version LexicalTableCellConverter.java create at 2024-03-08 14:54:12 by lhp
 * @since 1.0.0
 */
public class LexicalTableCellConverter extends AbstractLexicalNodeConverter {

  @Override
  public LexicalNodeTypeEnum type() {
    return LexicalNodeTypeEnum.TABLE_CELL;
  }

  @Override
  public HtmlNode convertToHtmlNode(RTFTextNode rtfTextNode) {
    HtmlNode htmlNode = new HtmlNode();

    String classSelector = "";
    if (rtfTextNode.getHeaderState() == 0) {
      classSelector = classSelector.concat(LexicalTagEnum.CLASS_SELECTOR_TABLE_CELL.getCode());
      htmlNode.setHtmlLabel(LexicalTagEnum.TD_LABEL.getCode());
    } else {
      classSelector = classSelector.concat(LexicalTagEnum.CLASS_SELECTOR_TABLE_HEADER.getCode())
          .concat(" ")
          .concat(LexicalTagEnum.CLASS_SELECTOR_TABLE_CELL.getCode());
      htmlNode.setHtmlLabel(LexicalTagEnum.TH_LABEL.getCode());
    }
    htmlNode.setClassSelector(classSelector);
    htmlNode.setDirection(rtfTextNode.getDirection());
    /**
     * 暂时无用
     */
    htmlNode.setColSpan(rtfTextNode.getColSpan());
    htmlNode.setRowSpan(rtfTextNode.getRowSpan());
    htmlNode.setBackgroundColor(rtfTextNode.getBackgroundColor());

    return htmlNode;
  }
}
