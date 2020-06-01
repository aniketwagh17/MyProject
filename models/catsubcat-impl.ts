import { Catsubcat } from './icatsubcat';

export class CatsubcatImpl implements Catsubcat{
    constructor(public cid:number,
                public name: string,
                public cname: string,
                public flag: boolean)
        {}
}
