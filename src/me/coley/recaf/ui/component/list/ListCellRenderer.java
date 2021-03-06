package me.coley.recaf.ui.component.list;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;

import me.coley.recaf.ui.FontUtil;
import me.coley.recaf.ui.HtmlRenderer;

/**
 * TODO: Better name for this so it doesn't conflict with swing.
 * 
 * @author Matt
 *
 * @param <T>
 */
public interface ListCellRenderer<T> extends javax.swing.ListCellRenderer<T>, HtmlRenderer {

	default void formatList(JList<?> list) {
		list.setBackground(Color.decode(getTheme().listBackground));
	}

	default void formatLabel(JLabel label, boolean selected) {
		label.setFont(FontUtil.monospace);
		label.setOpaque(true);
		label.setBorder(BorderFactory.createEtchedBorder());
		if (selected) {
			label.setBackground(Color.decode(getTheme().listItemSelected));
		} else {
			label.setBackground(Color.decode(getTheme().listItemBackground));
		}
	}
}
