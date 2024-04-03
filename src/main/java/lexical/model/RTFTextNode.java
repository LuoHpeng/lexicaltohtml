package lexical.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 富文本节点信息
 *
 * @author lhp
 * @version RTFTextNode.java create at 2024-03-06 18:17:14 by lhp
 * @since 1.0.0
 */
public class RTFTextNode {

  /**
   * 节点类型
   */
  private String type;
  /**
   * 版本
   */
  private int version;
  /**
   * 排版方向
   */
  private String direction;

  /**
   * 样式
   */
  private String format;

  /**
   * 缩进
   */
  private int indent;


  //************文本***********
  private int detail;
  /**
   * 模式
   */
  private String mode;
  /**
   * 文本
   */
  private String text;
  /**
   * 样式
   */
  private String style;

  //************************ 图片 ************************
  /**
   * 图片地址
   */
  private String src;

  /**
   * 图片宽度
   */
  private double width;

  /**
   * 图片高度
   */
  private double height;

  //************************ 超链接 ************************
  /***
   * 超链接
   */
  private String url;
  /**
   * 联系
   */
  private String rel;

  private boolean isBold;
  //********************* 表格 ****************************
  /**
   * 横跨列数
   */
  private String colSpan;
  /**
   * 横跨行数
   */
  private String rowSpan;
  /**
   * 背景颜色
   */
  private String backgroundColor;
  /**
   *
   */
  private int headerState;


  private HtmlNode htmlNode;


  private List<RTFTextNode> children;

  public void addChildren(RTFTextNode RTFTextNode) {
    if (children == null) {
      ArrayList<RTFTextNode> nodes = new ArrayList<>();
      nodes.add(RTFTextNode);
      this.children = nodes;
    } else {
      this.children.add(RTFTextNode);
    }
  }

  public String getColSpan() {
    return colSpan;
  }

  public void setColSpan(String colSpan) {
    this.colSpan = colSpan;
  }

  public String getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(String rowSpan) {
    this.rowSpan = rowSpan;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public int getHeaderState() {
    return headerState;
  }

  public void setHeaderState(int headerState) {
    this.headerState = headerState;
  }

  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public HtmlNode getHtmlNode() {
    return htmlNode;
  }

  public void setHtmlNode(HtmlNode htmlNode) {
    this.htmlNode = htmlNode;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public int getIndent() {
    return indent;
  }

  public void setIndent(int indent) {
    this.indent = indent;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<RTFTextNode> getChildren() {
    return children;
  }

  public void setChildren(
      List<RTFTextNode> children) {
    this.children = children;
  }

  public int getDetail() {
    return detail;
  }

  public void setDetail(int detail) {
    this.detail = detail;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public boolean isBold() {
    return isBold;
  }

  public void setBold(boolean bold) {
    isBold = bold;
  }
}
