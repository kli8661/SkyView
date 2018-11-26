public class SkyView {

    private double[][] view;

    public SkyView(int rows, int col, double[] scanned)
    {
        int a = 0; int b = 0;
        this.view = new double[rows][col];
        for(int i = 0; i < rows; i++)
        {
            if(a == col)
            {
                for(a = (col - 1); a >= 0; a--)
                {
                    view[i][a] = scanned[b];
                    b++;
                }
            }
            else if(a == 0)
            {
                for(a = 0; a < col; a++)
                {
                    view[i][a] = scanned[b];
                    b++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0.0;
        double num = 0.0;
        for(int i = startRow; i < endRow; i++)
        {
            for(int j = startCol; j < endCol; j++)
            {
                sum += view[i][j];
                num++;
            }
        }
        return (sum/num);
    }

    public String toString()
    {
        String output = "";
        for(int i = 0; i < view.length; i++)
        {
            for(int j = 0; j < view[i].length; j++)
            {
                output += view[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
