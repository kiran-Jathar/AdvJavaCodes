//Notepad Program...
import java.awt.*;
class NotepadDemo extends Frame
{
	NotepadDemo()
	{
		setBackground(Color.pink);
		MenuBar mbr=new MenuBar();
		
		Menu m1=new Menu("File");
		MenuItem m11=new MenuItem("New");
		MenuItem m12=new MenuItem("Open");
		MenuItem m13=new MenuItem("Save");
		MenuItem m14=new MenuItem("Save As");
		MenuItem m15=new MenuItem("Page Setup");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		m1.add(m15);
		
		Menu m2=new Menu("Edit");
		MenuItem m21=new MenuItem("Cut");
		MenuItem m22=new MenuItem("Copy");
		MenuItem m23=new MenuItem("Paste");
		MenuItem m24=new MenuItem("Delete");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		
		Menu m3=new Menu("View");
		Menu m31=new Menu("Zoom");
		MenuItem m311=new MenuItem("Zoom in");
		MenuItem m312=new MenuItem("Zoom out");
		MenuItem m313=new MenuItem("Restore default Zoom");
		m31.add(m311);
		m31.add(m312);
		m31.add(m313);
		
		CheckboxMenuItem m32=new CheckboxMenuItem("Status Bar");
		MenuItem m33=new MenuItem("Word Wrap");
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);
			
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		
		setMenuBar(mbr);
	}
	public static void main(String args[])
	{
		NotepadDemo n1=new NotepadDemo();
		n1.setVisible(true);
		n1.setTitle("Notepad Demo");
		n1.setSize(800,600);
	}
}
