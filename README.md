# 主要功能
* lexical转成HtmlNode标签
* HtmlNode 再转Html 字符串
* 转的字符串不包含样式及head,html标签，需要自定义 默认Style 自行拼接，style放在head中
* style中的样式可以自定义，与LexicalFormatEnum对象属性一一对应
* 还有部分lexical标签暂时不支持，比如 image等，可以自行添加
  ```
  
     <style>
               body {
                 font-size: 14px;
                 line-height:  32.0px;
                 padding: 0 20px;
                 margin: 0;
               }

               .split {
                 margin: 0 6px;
               }

               .content {
                 white-space: pre-wrap;
                 word-break: break-word;
                 padding-bottom:  100.0px;
               }

               .link {
                 font-size: 16px;
                 color: #5A7DA9;
                 font-weight: 500;
                 text-decoration: unset;
                 padding-bottom: 24px;
               }

               .title {
                 font-weight: bold;
                 font-size:  32.0px;
                 text-align:  center;
                 padding-top:  16.0px;
                 padding-bottom:  16.0px;
                 color: #333333;
               }

               .desc {
                 font-size:  20.0px ;
               }

               .version {
                 font-size:  20.0px ;
                 display:  none ;
               }

               .gmtUpdate {
                 font-size:  20.0px ;
                 display:  block ;
               }

               .gmtEffect {
                 font-size:  20.0px ;
                 display:  block ;
               }

               .paragraph {
                 position: relative;
                 margin: 0;
                 margin: 0;
                 padding: 0;
               }

               .y9-bold {
                 font-weight: bold;
               }

               .y9-italic {
                 font-style: italic;
               }

               .y9-underline {
                 text-decoration: underline;
               }

               .y9-strikethrough {
                 text-decoration: line-through;
               }

               .y9-underline-strikethrough {
                 text-decoration: underline line-through;
               }

               .y9-link {
                 display: inline-block;
                 color:  #E86452;
               }

               .y9-rich-table {
                 width: 100%;
                 table-layout: fixed;
                 border-collapse: collapse;
                 border-spacing: 0;
                 margin: 24px 0;
                 text-align: left;
               }

               .y9-rich-table-header {
                 position: relative;
                 color: #000000d9;
                 font-weight: bold;
               }

               .y9-rich-table-cell {
                 position: relative;
                 display: table-cell;
                 padding: 16px;
                 vertical-align: inherit;
                 overflow-wrap: break-word;
                 border: 1px solid rgba(0, 0, 0, 0.06);
               }

               .y9-chapter {
                 font-weight:  normal;
                 text-align:  unset;
                 font-size:  36.0px;
                 line-height:  32.0px;
                 padding-top:  16.0px;
                 padding-bottom:  16.0px;
                 color: #000;
               }
               .y9-variable {
                 font-size:  20.0px ;
               }
         </style>
  ```
