
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.78*/("""
"""),_display_(/*3.2*/main("Update product", user)/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
"""),format.raw/*4.1*/("""<p class="lead"> Update Product</p>

"""),_display_(/*6.2*/form(action=routes.HomeController.updateProductSubmit(id), 'class -> "form-horizontal", 
'role -> "form",'enctype -> "multipart/form-data")/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),format.raw/*8.33*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""
    """),_display_(/*10.6*/inputText(updateProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.87*/("""
    """),_display_(/*11.6*/inputText(updateProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*11.101*/("""
    """),_display_(/*12.6*/for((value,name) <- Category.options) yield /*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/("""
        """),format.raw/*13.9*/("""<input type="checkbox" name="catSelect[]" value""""),_display_(/*13.58*/value),format.raw/*13.63*/(""""
        """),_display_(/*14.10*/if(Category.inCategory(value.toLong, id))/*14.51*/{_display_(Seq[Any](format.raw/*14.52*/("""
            """),format.raw/*15.13*/("""checked
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""/>"""),_display_(/*17.12*/name),format.raw/*17.16*/("""<br>
    """)))}),format.raw/*18.6*/("""   

    """),_display_(/*20.6*/inputText(updateProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*20.89*/("""
    """),_display_(/*21.6*/inputText(updateProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*21.89*/("""

    """),format.raw/*23.5*/("""<label>Image </label>
    <input class = "btn-sm btn-default" type="file" name="upload">
    <br><br>

    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.index(0)),format.raw/*29.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>
 """)))}),format.raw/*33.3*/("""
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 10:26:55 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/updateProduct.scala.html
                  HASH: ab8a552fe9e4b72409a688680a31370d955fc662
                  MATRIX: 993->1|1142->79|1187->77|1214->96|1250->124|1288->125|1315->126|1378->164|1525->303|1564->305|1596->338|1627->344|1639->348|1669->358|1701->364|1803->445|1835->451|1952->546|1984->552|2037->589|2077->591|2113->600|2189->649|2215->654|2253->665|2303->706|2342->707|2383->720|2431->737|2467->746|2497->749|2522->753|2562->763|2598->773|2702->856|2734->862|2838->945|2871->951|3122->1175|3137->1181|3182->1205|3315->1308|3347->1310
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|48->16|49->17|49->17|49->17|50->18|52->20|52->20|53->21|53->21|55->23|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          