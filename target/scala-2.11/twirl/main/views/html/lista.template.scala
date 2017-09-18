
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object lista_Scope0 {
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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Contato],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contatos: List[Contato]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""


"""),_display_(/*4.2*/main("Lista de Habilidades")/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""

    """),format.raw/*6.5*/("""<section id="title" class="peter-river navbar-fixed-top " role="banner">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h1>Habilidades laborales</h1>



                </div>
            </div>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.ContatoController.novo),format.raw/*16.52*/("""">
            <button type="button" class="btn btn-large btn-warning col-sm-12 ">Agregar personas</button>
            </a>
        </div>
    </section><!--/#title-->

    <section id="registration" class=" wet-asphalt navbar-fixed">
        <div class="container">
        <br>
        <br>
            <input id="myInput" placeholder="Filtrar habilidad" type="text" class="input-medium search-query" onkeyup="myFunction() " >

        </div>
    </section>



    <script>
            function myFunction() """),format.raw/*34.35*/("""{"""),format.raw/*34.36*/("""
                """),format.raw/*35.17*/("""// Declare variables
                var input, filter, table, tr, td, i;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                table = document.getElementById("myTable");
                tr = table.getElementsByTagName("tr");

                // Loop through all table rows, and hide those who don't match the search query
                for (i = 0; i < tr.length; i++) """),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
                    """),format.raw/*44.21*/("""td = tr[i].getElementsByTagName("td")[3];
                    if (td) """),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""
                        """),format.raw/*46.25*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*46.78*/("""{"""),format.raw/*46.79*/("""
                            """),format.raw/*47.29*/("""tr[i].style.display = "";
                        """),format.raw/*48.25*/("""}"""),format.raw/*48.26*/(""" """),format.raw/*48.27*/("""else """),format.raw/*48.32*/("""{"""),format.raw/*48.33*/("""
                            """),format.raw/*49.29*/("""tr[i].style.display = "none";
                        """),format.raw/*50.25*/("""}"""),format.raw/*50.26*/("""
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/("""
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
    """),format.raw/*54.5*/("""</script>





    <table id="myTable" width="100%"  border="1" cellspacing="0" cellpadding="0" class="table table-striped  table-bordered ">
        <thead >
            <tr>
                <th width="10%"></th>
                <th width="20%" align="center">ID</th>
                <th width="20%" align="center">Nombre</th>
                <th width="25%" align="center">Habilidades</th>

                <th/>
            </tr>
        </thead>
        <tbody  >
        """),_display_(/*72.10*/for(contato <- contatos) yield /*72.34*/ {_display_(Seq[Any](format.raw/*72.36*/("""
            """),format.raw/*73.13*/("""<tr>
                <td><a>

                </a></td>


                <td valign="middle" ><a>
                """),_display_(/*80.18*/contato/*80.25*/.id),format.raw/*80.28*/("""
                """),format.raw/*81.17*/("""</a></td>

                <td><a>
                """),_display_(/*84.18*/contato/*84.25*/.nome),format.raw/*84.30*/("""
                """),format.raw/*85.17*/("""</a></td>

                <td><a>





                    <div class="btn-group">
                        <div class="btn-group">
                            <select name="OS">
                                <option>"""),_display_(/*96.42*/contato/*96.49*/.telefone),format.raw/*96.58*/("""</option>
                            </select>
                        </div>
                    </div>





                </a></td>





                <td>


            </tr>


        """)))}),format.raw/*117.10*/("""
        """),format.raw/*118.9*/("""</tbody>


    </table>



""")))}))
      }
    }
  }

  def render(contatos:List[Contato]): play.twirl.api.HtmlFormat.Appendable = apply(contatos)

  def f:((List[Contato]) => play.twirl.api.HtmlFormat.Appendable) = (contatos) => apply(contatos)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Sep 18 07:14:04 COT 2017
                  SOURCE: C:/Users/SA/Desktop/play-java-jpa-example-2.5.x/app/views/lista.scala.html
                  HASH: 9fcd07e3c1d8a2d8319dc26a0a64698c9fa16e22
                  MATRIX: 752->1|872->26|904->33|940->61|978->62|1012->70|1341->372|1356->378|1400->401|1957->930|1986->931|2032->949|2514->1403|2543->1404|2593->1426|2692->1497|2721->1498|2775->1524|2856->1577|2885->1578|2943->1608|3022->1659|3051->1660|3080->1661|3113->1666|3142->1667|3200->1697|3283->1752|3312->1753|3362->1775|3391->1776|3437->1794|3466->1795|3508->1809|3537->1810|3570->1816|4092->2311|4132->2335|4172->2337|4214->2351|4364->2474|4380->2481|4404->2484|4450->2502|4532->2557|4548->2564|4574->2569|4620->2587|4878->2818|4894->2825|4924->2834|5171->3049|5209->3059
                  LINES: 27->1|32->1|35->4|35->4|35->4|37->6|47->16|47->16|47->16|65->34|65->34|66->35|74->43|74->43|75->44|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|79->48|79->48|79->48|80->49|81->50|81->50|82->51|82->51|83->52|83->52|84->53|84->53|85->54|103->72|103->72|103->72|104->73|111->80|111->80|111->80|112->81|115->84|115->84|115->84|116->85|127->96|127->96|127->96|148->117|149->118
                  -- GENERATED --
              */
          