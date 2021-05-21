import personne._
import sun.util.calendar._

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.{Calendar, Date}
object bonjour {
  /*def main(args: Array[String]): Unit = {
    println("bonjour")
  }*/
  /*fonction retournant la multiplication*/
  def add(i:Int,u:Int):Int={
    return i+ u;
  }

  def main(args: Array[String]){
   /* println("bonjour")
    var i:String="0";
    var j:String="ty"
    /* BOUCLE IF*/
    if(i=="0") j="bonjour" else j="bonsoir"
    println(j)

    /* boucle * en param */
    var res=if(j=="bonjour") "matin" else "le soir"
    println(res)

    /* boucle while */
    var a=12
    var b = 0
    while(b<12){
      println(a)
      b=b+1
    }
    /* pour for */

    println("LISTE 1")
    for (i<-1 to 5){
      println("bonjour numero: "+i)
    }
    println("LISTE 2")
    for (i<- 1 .to(5)){
      println("bonjour numero: "+i)
    }

    println("LISTE 3")
    for (i<- 1 until 5){
      println("bonjour numero :"+i)
    }

    println("LISTE 4")
    var lst=List(3,23,2,7,50,6,78,0)
    for (i <- lst){
      println(i)
    }

    /* boucle pour dans une list sur condition
     */
    var lst2=for (i<-lst; if i<7) yield{
      i*i
    }
    println(lst2)

    /* choi case */
    val resul=0
    resul match{
      case 1 => println("a")
      case 2 => println("b")
      case 3=> println("c")
      case 4 => println("d")
      case _ => println("aucun choix")
    }

    /* les simples fonctions */

  var x=add(23,56)
    println(x)
    */
    //val etudiant= personne("camara","Michel",25,"Guinéenne",Some(200000000))
    //val etudiant1= personne("camara","Michel",25,"Guinéenne",None)
   // val cam=etudiant.nom
    //val cam1=etudiant.nom
    //println(cam)

    //println(calculSomme(12,34))
    //val today = Calendar.getInstance()
    val yearJ = LocalDate.now().getYear //extraire année dans data du jour
    val dateU="1993-05-12"
    val format1 = new java.text.SimpleDateFormat("yyyy-mm-dd")
    val dateEnJourMoisAnne=format1.parse(dateU)
    val format2 = new SimpleDateFormat("YYYY")
    val yearPersonne=Integer.parseInt(format2.format(dateEnJourMoisAnne))

    println("Année date du jour : "+yearJ)
    println("Année saisir par l'utilisateur : "+yearPersonne)
    println("difference des deux ages : "+(yearJ-yearPersonne))
    val etudiantM = renvoiePersonne("camara","michel",dateU,"guinéene",4000000)
    println("age de :"+etudiantM.nom+" est : "+etudiantM.age)
    masequence()
    masequence_Filter()
    monmap()
  }
  def calculSomme(a:Int,b:Int):Int={
    val resultat=a*b
    return resultat
  }



  def renvoiePersonne(nom:String,prenom:String,age:String,nationnalite:String,salaire:Double): personne ={
    val yearJ = LocalDate.now().getYear //extraire année dans data du jour

    val format1 = new java.text.SimpleDateFormat("yyyy-mm-dd")
    val dateEnJourMoisAnne=format1.parse(age)
    val format2 = new SimpleDateFormat("YYYY")
    val yearPersonne=Integer.parseInt(format2.format(dateEnJourMoisAnne))

    return personne(nom,prenom,(yearJ-yearPersonne),nationnalite,Some(salaire))
  }

  def macollection(): Unit ={
    val maliste=List("JVC","JJJ","ecole","pays")
    val maliste2:List[String]=List("julien","celine","exter")
    maliste.foreach(l=>println(l.toUpperCase))
    maliste2.foreach(l=>{
      val var2=l.toUpperCase
    })
  }
  def masequence(): Unit ={
    val maSequence :Seq[String]= Seq("Julien","Camara","Souleymane","gerome","siaka","agnes","michel")
     val a=maSequence.map(i=>println(i.length))
  }
  def masequence_Filter(){
    val maSequence :Seq[String]= Seq("Julien","Camara","Souleymane","gerome","siaka","agnes","michel")
    val a=maSequence.filter(i=>i.length>7).foreach(el=>println(el))
  }

  def montuple() {
    val monTuple=("10",personne("juvenil","jvc",12,"cr",Some(10.3)))
  }

  def monmap(): Unit ={
    val monMap:Map[String,String]=Map(
      "cc"->"yop",
      "aa"->"angre"
    )
    val a=monMap.toList
    a.foreach(el=>println(el))
    val s=monMap.keys.map(l=>l).toList
  }
  def montableau(): Unit ={
    val montableau: Array[String]=Array("julien","jeaogia")
    montableau(0)="jvc"
  }
}
