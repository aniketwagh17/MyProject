import { Product } from './iproduct';

export class ProductImpl implements Product 
{
    constructor(
    public pid:number,
    public pname:string,
    public pdet:string,
    public cid:number,
    public gainpoints:number,
    public redeempoints:number,
    public price:number,
    public primeprice:number,
    public image:string,
    public modelno:string,
    public discount:number,
    public gst:number
    )
    {}
} 




