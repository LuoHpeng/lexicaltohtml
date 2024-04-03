package lexical.html.convert;

import io.micrometer.common.util.StringUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lexical.html.convert.impl.HtmlEmConverter;
import lexical.html.convert.impl.HtmlLinkConverter;
import lexical.html.convert.impl.HtmlParagraphConverter;
import lexical.html.convert.impl.HtmlSpanConverter;
import lexical.html.convert.impl.HtmlStrongConverter;
import lexical.html.convert.impl.HtmlTableConverter;
import lexical.html.convert.impl.HtmlTdConverter;
import lexical.html.convert.impl.HtmlThConverter;
import lexical.html.convert.impl.HtmlTrConverter;
import lexical.html.enums.HtmlNodeTypeEnum;
import lexical.html.enums.HtmlTagEnums;
import lexical.model.HtmlNode;

/**
 * HtmlNode结构富文本转成html结构
 *
 * @author lhp
 * @version HtmlConverterFactory.java create at 2024-03-11 13:48:34 by lhp
 * @since 1.0.0
 */
public class HtmlConverterFactory {


  private static final Map<HtmlNodeTypeEnum, HtmlNodeConverter> strategyMap = new HashMap<>();


  static {
    registerConvert(new HtmlEmConverter());
    registerConvert(new HtmlLinkConverter());
    registerConvert(new HtmlParagraphConverter());
    registerConvert(new HtmlSpanConverter());
    registerConvert(new HtmlStrongConverter());
    registerConvert(new HtmlTableConverter());
    registerConvert(new HtmlTdConverter());
    registerConvert(new HtmlThConverter());
    registerConvert(new HtmlTrConverter());
  }

  /**
   * 标签处理对象注册
   *
   * @param lexicalNodeConverter
   */
  public static void registerConvert(HtmlNodeConverter lexicalNodeConverter) {
    strategyMap.put(lexicalNodeConverter.type(), lexicalNodeConverter);
  }

  /**
   * 根据类型获取处理对象
   *
   * @param type
   * @return
   */
  public static HtmlNodeConverter getNodeConverter(String type) {
    HtmlNodeTypeEnum byCode = HtmlNodeTypeEnum.getByCode(type);
//    Assert.notNull(byCode, "node type string is empty");
    HtmlNodeConverter htmlNodeConverter = strategyMap.get(byCode);
//    Assert.notNull(htmlNodeConverter, "node converter is empty:%s", type);
    return htmlNodeConverter;
  }

  public static boolean haseChildren(HtmlNode htmlNode) {
    return htmlNode != null && htmlNode.getHtmlNodes() != null;
  }

  /**
   * htmlNodes 转成html字符串
   *
   * @param htmlNodes
   * @return
   */
  public static String convert(List<HtmlNode> htmlNodes) {
    StringBuilder outBuilder = new StringBuilder();
    for (HtmlNode htmlNode : htmlNodes) {
      StringBuilder inBuilder = new StringBuilder();
      if (haseChildren(htmlNode)) {
        //递归生成html字符串
        String htmlString = convert(htmlNode.getHtmlNodes());
        HtmlNodeConverter nodeConverter = HtmlConverterFactory.getNodeConverter(
            htmlNode.getHtmlLabel());
        nodeConverter.createLabelStart(inBuilder, htmlNode);
        inBuilder.append(htmlString);
        nodeConverter.createLabelEnd(inBuilder, htmlNode);
      } else {
        HtmlNodeConverter nodeConverter = HtmlConverterFactory.getNodeConverter(
            htmlNode.getHtmlLabel());
        nodeConverter.createLabelStart(inBuilder, htmlNode);
        //text为空表示没有子类，标签是段落时，一般为换行
        if (StringUtils.isEmpty(htmlNode.getText()) && nodeConverter.type() == HtmlNodeTypeEnum.P) {
          inBuilder.append(HtmlTagEnums.TAG_BR.getCode());
        } else {
          // text内容不是null的时候拼接内容
          if (StringUtils.isNotEmpty(htmlNode.getText())) {
            inBuilder.append(htmlNode.getText());
          }

        }

        nodeConverter.createLabelEnd(inBuilder, htmlNode);
      }
      outBuilder.append(inBuilder);
    }
    return outBuilder.toString();
  }
}
