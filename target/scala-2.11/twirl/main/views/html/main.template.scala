
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link href=""""),_display_(/*8.22*/routes/*8.28*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*8.73*/("""" rel="stylesheet" media="screen">
        <link href=""""),_display_(/*9.22*/routes/*9.28*/.Assets.at("bootstrap/css/animate.css")),format.raw/*9.67*/("""" rel="stylesheet" media="screen">
        <link href=""""),_display_(/*10.22*/routes/*10.28*/.Assets.at("bootstrap/css/main.css")),format.raw/*10.64*/("""" rel="stylesheet" media="screen">


        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("stylesheets/main.css")),format.raw/*13.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.at("images/favicon.png")),format.raw/*14.97*/("""">
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-2.2.0.min.js")),format.raw/*15.74*/("""" type="text/javascript"></script>






    </head>
    <body>

        """),_display_(/*25.10*/content),format.raw/*25.17*/("""

    """),format.raw/*27.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Sep 18 01:21:51 COT 2017
                  SOURCE: C:/Users/SA/Desktop/play-java-jpa-example-2.5.x/app/views/main.scala.html
                  HASH: 9561949a19ce3b76bbf2410901b36da60da49c5b
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1059->119|1073->125|1138->170|1220->226|1234->232|1293->271|1376->327|1391->333|1448->369|1565->459|1580->465|1635->499|1723->560|1738->566|1791->598|1843->623|1858->629|1924->674|2025->748|2053->755|2086->761
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|56->25|56->25|58->27
                  -- GENERATED --
              */
          