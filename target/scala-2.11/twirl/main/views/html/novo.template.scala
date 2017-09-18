
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novo_Scope0 {
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

class novo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Contato],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(header: String, form: Form[Contato]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""

"""),_display_(/*3.2*/main("Novo Contato - Agenda")/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""





  """),format.raw/*9.3*/("""<section id="title" class="belize-hole navbar-fixed-top " role="banner">
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          <h1>Agregar personas</h1>
        </div>
        <br>
        <br>
        <br>
        <a href=""""),_display_(/*18.19*/routes/*18.25*/.ContatoController.lista),format.raw/*18.49*/(""""">
          <button type="button"  class="btn btn-large btn-large btn-warning col-sm-12 "> Volver a inicio </button>
        </a>

      </div>
    </div>
  </section><!--/#title-->


  <section id="registration" class=" wet-asphalt navbar-fixed">

  """),_display_(/*29.4*/helper/*29.10*/.form(action = routes.ContatoController.salva() )/*29.59*/{_display_(Seq[Any](format.raw/*29.60*/("""



      """),format.raw/*33.7*/("""<centre>
      <form class="center animated bounceInLeft" role="banner">
        <fieldset class="registration-form wet-asphalt">
          <fieldset class="registration-form wet-asphalt">

          <br>
          <br>
          <br>
          <br>
          <br>


          <div class="form-group">
            <input type="text" id="nome" name="nome" placeholder="Nombre" class="form-control" value=""""),_display_(/*46.104*/form("nome")/*46.116*/.value),format.raw/*46.122*/("""">
          </div>
          <div class="form-group">
            <input type="text" id="telefone" name="telefone" placeholder="Habilidad" class="form-control"value=""""),_display_(/*49.114*/form("telefone")/*49.130*/.value),format.raw/*49.136*/("""">
          </div>

          <div class="form-group">
            <button class="  btn btn-primary btn-md" type="submit">Agregar</button>
          </div>

          </fieldset>
        </fieldset>
      </form>
      </centre>
  """)))}),format.raw/*60.4*/("""
  """),format.raw/*61.3*/("""</section><!--/#registration-->
""")))}))
      }
    }
  }

  def render(header:String,form:Form[Contato]): play.twirl.api.HtmlFormat.Appendable = apply(header,form)

  def f:((String,Form[Contato]) => play.twirl.api.HtmlFormat.Appendable) = (header,form) => apply(header,form)

  def ref: this.type = this

}


}

/**/
object novo extends novo_Scope0.novo
              /*
                  -- GENERATED --
                  DATE: Mon Sep 18 06:51:18 COT 2017
                  SOURCE: C:/Users/SA/Desktop/play-java-jpa-example-2.5.x/app/views/novo.scala.html
                  HASH: 8590971d053cca6b21fac7b159041d893d49b623
                  MATRIX: 757->1|889->38|919->43|956->72|994->73|1034->87|1334->360|1349->366|1394->390|1685->655|1700->661|1758->710|1797->711|1838->725|2284->1143|2306->1155|2334->1161|2533->1332|2559->1348|2587->1354|2861->1598|2892->1602
                  LINES: 27->1|32->1|34->3|34->3|34->3|40->9|49->18|49->18|49->18|60->29|60->29|60->29|60->29|64->33|77->46|77->46|77->46|80->49|80->49|80->49|91->60|92->61
                  -- GENERATED --
              */
          