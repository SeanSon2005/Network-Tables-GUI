
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Panel extends JPanel
{
    private InfoPanel rightPanel;
    private PIDPanel leftPanel;
    private SavePanel savePanel;

    private GridBagConstraints grid = new GridBagConstraints();

    public Panel()
    {
        setLayout(new GridBagLayout());
        
        savePanel = new SavePanel();
        grid.gridx = 0;
        grid.gridy = 0;
        grid.weightx = 0.15;
        grid.weighty = 1;
        grid.fill = GridBagConstraints.BOTH;
        add(savePanel,grid);

        leftPanel = new PIDPanel();
        grid.gridx = 1;
        grid.gridy = 0;
        grid.weightx = 0.25;
        grid.weighty = 1;
        grid.fill = GridBagConstraints.BOTH;
        add(leftPanel,grid);
        
        rightPanel = new InfoPanel();
        grid.gridx = 2;
        grid.gridy = 0;
        grid.weightx = 0.60;
        grid.weighty = 1;
        grid.fill = GridBagConstraints.BOTH;
        add(rightPanel,grid);
    }
}