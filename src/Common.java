/************************************************************************************************
 * Common.java : 365�� 24�ð� �����ϸ鼭, ���� ���ϵ� ��ü�� ���� ��ġ ����Ʈ�� �ǽ��Ѵ�. *
 *************************************************************************************************/
// ���� ������ ������ �Ѵ�.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Ŭ������ �����Ѵ�.
public class Common
{
    // ���θ޼��� ����
    public static void main(String[] args)
    {
        Common ssb = new Common();
        int i = 0;

        while (true)
        {
            i++;
            try
            {
                Thread.sleep(60000); // ���� ����ð��� �������� 60�� ������ �ð��� ��´�.

                //������ �����ؼ� ��¥ ���ϱ�
                SimpleDateFormat formatter =
                        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss EEE",Locale.ENGLISH);
                Date currentTime = new Date();
                String dTime = formatter.format(currentTime);

                System.out.println(dTime);
                //System.out.println(dTime.indexOf(" 00:00"));

                /********************************************************
                 * �Ϲ�ġ�� �����ų �ð�  (������ ~ ����� 11:59) *
                 *********************************************************/
                if(dTime.indexOf(" 23:59") != -1 && dTime.indexOf(" Sun")== -1)
                {
                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : ��ɾ�.");
                    ssb.callBatch("��ɾ�");
                }

                /********************************************************
                 * �Ϲ�ġ�� ���� �� �ʱ�ȭ�� �ð�  (�Ͽ��� 11:59)  *
                 *********************************************************/
                if(dTime.indexOf(" 23:59") != -1 && dTime.indexOf(" Sun")!= -1)
                {
                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : ��ɾ�.");
                    ssb.callBatch("��ɾ�");

                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : ��ɾ�.");
                    ssb.callBatch("��ɾ�");
                }

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    // ��ġ �Լ� ����
    public void callBatch(String CMD_COMMON)
    {
        // �Ӽ� ����
        URL url;// URL �ּ� ��ü
        URLConnection connection;// URL������ ������ ��ü
        InputStream is;// URL���ӿ��� ������ �б����� Stream
        InputStreamReader isr;
        BufferedReader br;
        String cmd_common = CMD_COMMON;

        try
        {
            // URL��ü�� �����ϰ� �ش� URL�� �����Ѵ�..
            String ip = "127.0.0.1";
            url = new URL(ip);
                    connection = url.openConnection();

            // ������ �о�������� InputStream��ü�� �����Ѵ�..
            is = connection.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // ������ �о ȭ�鿡 ����Ѵ�..
            String buf = null;

            while (true)
            {
                buf = br.readLine();
                if (buf == null) break;
                System.out.println("Step-2. www.kiniwini.com Connect Response. : " + buf);
            }
        }
        catch (MalformedURLException mue)
        {
            System.err
                    .println("�߸��� URL�Դϴ�. ���� : java URLConn http://hostname/path]");
            System.exit(1);
        }
        catch (IOException ioe)
        {
            System.err.println("IOException " + ioe);
            ioe.printStackTrace();
            System.exit(1);
        }
    }
}