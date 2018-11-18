module kr.ayukawa.jfxdemo.gui {
	requires kr.ayukawa.jfxdemo.logic;
	requires javafx.controls;

	opens kr.ayukawa.jfxdemo.gui to javafx.graphics;
}