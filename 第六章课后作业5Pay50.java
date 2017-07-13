package cn.jbit.practice;
/**
* 第六章课后作业5
* @author ShiGuocai
*
*付50先令有几个男人女人小孩
*men+women+kids=30;
*3*men+2*women+kids=50;
*/
public class Pay50 {

	public static void main(String[] args) {
		int men=0;
		int women=0;
		int kids=0;
		boolean  bw=false;
		boolean  bk=false;
		
		for(men=0;men<=10;men++) {
			for(women=0;women<30-men;women++) {
				for(kids=0;kids<30-men-women;kids++) {
					if((3*men+2*women+kids)==50) {
						bk=true;
						break;
					}
				}//end inner for				
				if(bk) {
					bw=true;
					break;
				}				
			}//end min for			
			if(bw) {
				break;
			}
		}//end out for
		men=30-women-kids;
		System.out.println("男人："+men+"人");
		System.out.println("女人："+women+"人");
		System.out.println("小孩："+kids+"人");

	}

}
