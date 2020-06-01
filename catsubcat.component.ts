import { Component, OnInit, DoCheck } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Catsubcat } from '../../models/icatsubcat';
import { ScatsubcatService } from '../../services/scatsubcat.service';
import { SproductService } from '../../services/sproduct.service';


@Component({
  selector: 'app-catsubcat',
  templateUrl: './catsubcat.component.html',
  styleUrls: ['./catsubcat.component.css']
})
export class CatsubcatComponent implements OnInit,DoCheck {

  catsubcat1: Catsubcat[];
  product: Product
  catsubcat: any;
  route : string;
  constructor(private catsubcatservice:ScatsubcatService,
              private productservice: SproductService,
              private activatedRoute:ActivatedRoute,
              private router:Router)
              //3. inject the service of navbar) 
              { }

  ngOnInit() {
    /*
     //4. subscribe the navbar service methods
     var str = this.activatedRoute.snapshot.params['cname'].toString();
    
     this.catsubcatservice.getCatsubcat(str).subscribe( (data)=> {
       this.catsubcat1=data;
     }
       //this.route = "catsubcat/"+this.catsubcat1[0]+"/";
    
     );
     }*/
     this.call();
  }

call()
{
 
  var str = this.activatedRoute.snapshot.params['cname'].toString();
     this.catsubcatservice.getCatsubcat(str).subscribe( (data)=> {
       this.catsubcat1=data
    }
     );

     callpro();
}
/*
ngDoCheck(){

  this.call();
}
*/
callpro()
{
  var string = this.activatedRoute.snapshot.params['pname'].toString();
     this.productservice.getProduct(string).subscribe( (data)=> {
       this.catsubcat2=data
    }
     );
}


}