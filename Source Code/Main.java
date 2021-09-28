import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Main
{
static Main obj = new Main();
static String std[][]= new String[23][23];
static void std()
{
	
	
	for(int i=0;i<16;++i)
	{
		std[i][0]="R".concat(String.valueOf(i));
		std[i][1]=String.valueOf(i);
	
	}
	std[16][0]="SCREEN";
	std[17][0]="KBD";
	std[18][0]="SP";
	std[19][0]="LCL";
	std[20][0]="ARG";
	std[21][0]="THIS";
	std[22][0]="THAT";
	
	std[16][1]="16384";
	std[17][1]="24576";
	std[18][1]="0";
	std[19][1]="1";
	std[20][1]="2";
	std[21][1]="3";
	std[22][1]="4";
	
}

static String value;
static String reg;
static String valuecomp,code,a;	
static String jump,valuejump;
	static void dest()
	{
		
			
		
		if(reg=="M")
		{
			value="001";
		}
		else if(reg=="D")
		{
			value="010";
		}
		else if(reg=="MD")
		{
			value="011";
		}
		else if(reg=="A")
		{
			value="100";
		}
		else if(reg=="AM")
		{
			value="101";
		}
		else if(reg=="AD")
		{
			value="110";
		}
		else if(reg=="AMD")
		{
			value="111";
		}
		else if(reg=="null")
		{
			value="000";
		}
	
	
}

	static void comp()
	{
		if(valuecomp=="0")
		{
			a="0";
			code="101010";
		}
		else if(valuecomp=="1")
		{
			a="0";
			code="111111";
		}
		else if(valuecomp=="-1")
		{
			a="0";
			code="111010";
		}
		else if(valuecomp=="D")
		{
			a="0";
			code="001100";
		}
		else if(valuecomp=="A"||valuecomp=="M")
		{
			if(valuecomp=="A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="110000";
		}
		else if(valuecomp=="!D")
		{
			a="0";
			code="001101";
		}
		else if(valuecomp=="!A"||valuecomp=="!M")
		{
			if(valuecomp=="!A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="110001";
		}
		else if(valuecomp=="-D")
		{
			a="0";
			code="001111";
		}
		else if(valuecomp=="-A"||valuecomp=="-M")
		{
			if(valuecomp=="-A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="110011";
		}
		else if(valuecomp=="D+1")
		{
			a="0";
			code="011111";
		}
		else if(valuecomp=="A+1"||valuecomp=="M+1")
		{
			if(valuecomp=="A+1")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="110111";
		}
		else if(valuecomp=="D-1")
		{
			a="0";
			code="001110";
		}
		else if(valuecomp=="A-1"||valuecomp=="M-1")
		{
			if(valuecomp=="A-1")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="110010";
		}
		
		
		
		
		
		else if(valuecomp=="D+A"||valuecomp=="D+M")
		{
			if(valuecomp=="D+A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="000010";
		}
		else if(valuecomp=="D-A"||valuecomp=="D-M")
		{
			if(valuecomp=="D-A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="010011";
		}
		else if(valuecomp=="A-D"||valuecomp=="M-D")
		{
			if(valuecomp=="A-D")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="000111";
		}
		else if(valuecomp=="D&A"||valuecomp=="D&M")
		{
			if(valuecomp=="D&A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="000000";
		}
		else if(valuecomp=="D|A"||valuecomp=="D|M")
		{
			if(valuecomp=="D|A")
			{
				a="0";
			}
			else
			{
				a="1";
			}
			code="010101";
		}
	}
	


static void	jump()
	{
		if(valuejump=="JGT")
		{
			jump="001";
		}
		else if(valuejump=="JEQ")
		{
			jump="010";
		}
		else if(valuejump=="JGE")
		{
			jump="011";
		}
		else if(valuejump=="JLT")
		{
			jump="100";
		}
		else if(valuejump=="JNE")
		{
			jump="101";
		}
		else if(valuejump=="JLE")
		{
			jump="110";
		}
		else if(valuejump=="JMP")
		{
			jump="111";
		}
		else if(valuejump=="null")
		{
			jump="000";
		}
	}
	


public static void main(String[] args)
{
	std();
}
}
















