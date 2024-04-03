package lexical.resolver.convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lexical.model.HtmlNode;
import lexical.model.RTFTextNode;
import lexical.resolver.convert.impl.LexicalLinkConverter;
import lexical.resolver.convert.impl.LexicalParagraphConverter;
import lexical.resolver.convert.impl.LexicalTableCellConverter;
import lexical.resolver.convert.impl.LexicalTableConverter;
import lexical.resolver.convert.impl.LexicalTableRowConverter;
import lexical.resolver.convert.impl.LexicalTextConverter;
import lexical.resolver.convert.impl.LexicalVariableConverter;
import lexical.resolver.enums.LexicalNodeTypeEnum;

/**
 * lexical转成通用的结构（HtmlNode）
 *
 * @author lhp
 * @version LexicalConverterFactory.java create at 2024-03-08 15:42:57 by lhp
 * @since 1.0.0
 */
public class LexicalConverterFactory {


  private static final Map<LexicalNodeTypeEnum, LexicalNodeConverter> strategyMap = new HashMap<>();

  static {

    registerConvert(new LexicalLinkConverter());
    registerConvert(new LexicalParagraphConverter());
    registerConvert(new LexicalTableCellConverter());
    registerConvert(new LexicalTableConverter());
    registerConvert(new LexicalTableRowConverter());
    registerConvert(new LexicalTextConverter());
    registerConvert(new LexicalVariableConverter());
  }

  /**
   * lexical标签解析对象注册
   *
   * @param lexicalNodeConverter
   */
  private static void registerConvert(LexicalNodeConverter lexicalNodeConverter) {
    strategyMap.put(lexicalNodeConverter.type(), lexicalNodeConverter);
  }

  /**
   * 根据类型获取解析对象
   *
   * @param type
   * @return
   */
  public static LexicalNodeConverter getNodeConverter(String type) {
    LexicalNodeTypeEnum nodeType = LexicalNodeTypeEnum.getByCode(type);
    //不识别的标签返回null,调用方处理
    if (nodeType == null) {
      //log
      return null;
    }
    LexicalNodeConverter lexicalNodeConverter = strategyMap.get(nodeType);
//    Assert.notNull(lexicalNodeConverter, "node converter is empty");
    return lexicalNodeConverter;
  }

  /**
   * lexical对象转化未htmlNode对象
   *
   * @param rtfTextNodes
   * @param htmlNodes
   */
  public static void convert(List<RTFTextNode> rtfTextNodes, List<HtmlNode> htmlNodes) {
    for (RTFTextNode child : rtfTextNodes) {
      String type = child.getType();
      LexicalNodeConverter lexicalNodeConverter = LexicalConverterFactory.getNodeConverter(type);
      if (lexicalNodeConverter == null) {
        continue;
      }
      HtmlNode htmlNode = lexicalNodeConverter.convertToHtmlNode(child);
      htmlNodes.add(htmlNode);
      if (haseChildren(child)) {
        List<HtmlNode> nodes = new ArrayList<>();
        htmlNode.setHtmlNodes(nodes);
        convert(child.getChildren(), nodes);
      }
    }
  }

  private static boolean haseChildren(RTFTextNode rtfTextNode) {
    return rtfTextNode != null && rtfTextNode.getChildren() != null;
  }

}
