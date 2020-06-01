import { Customer } from './icustomer';

export class CustomerImpl implements Customer 
{
    constructor(
        public custid:number,
        public name:string,
        public email:string,
        public mobno:string,
        public age:number,
        public gender:string,
        public password:string,
        public address:string,
        public primemember:boolean,
        public points:number)
    {  }
}

