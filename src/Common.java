/************************************************************************************************
 * Common.java : 365일 24시간 동작하면서, 관련 웹하드 업체에 대한 배치 포인트를 실시한다. *
 *************************************************************************************************/
// 관련 파일을 인쿨루드 한다.
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

// 클래스를 정의한다.
public class Common
{
    // 메인메서드 정의
    public static void main(String[] args)
    {
        Common ssb = new Common();
        int i = 0;

        while (true)
        {
            i++;
            try
            {
                Thread.sleep(60000); // 최초 실행시간을 기점으로 60초 단위로 시간을 찍는다.

                //포맷을 지정해서 날짜 구하기
                SimpleDateFormat formatter =
                        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss EEE",Locale.ENGLISH);
                Date currentTime = new Date();
                String dTime = formatter.format(currentTime);

                System.out.println(dTime);
                //System.out.println(dTime.indexOf(" 00:00"));

                /********************************************************
                 * 일배치를 실행시킬 시간  (월요일 ~ 토요일 11:59) *
                 *********************************************************/
                if(dTime.indexOf(" 23:59") != -1 && dTime.indexOf(" Sun")== -1)
                {
                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : 명령어.");
                    ssb.callBatch("명령어");
                }

                /********************************************************
                 * 일배치를 실행 및 초기화할 시간  (일요일 11:59)  *
                 *********************************************************/
                if(dTime.indexOf(" 23:59") != -1 && dTime.indexOf(" Sun")!= -1)
                {
                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : 명령어.");
                    ssb.callBatch("명령어");

                    System.out.println("Step-1. www.kiniwini.com Connect Resquest. : 명령어.");
                    ssb.callBatch("명령어");
                }

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    // 배치 함수 정의
    public void callBatch(String CMD_COMMON)
    {
        // 속성 정의
        URL url;// URL 주소 객체
        URLConnection connection;// URL접속을 가지는 객체
        InputStream is;// URL접속에서 내용을 읽기위한 Stream
        InputStreamReader isr;
        BufferedReader br;
        String cmd_common = CMD_COMMON;

        try
        {
            // URL객체를 생성하고 해당 URL로 접속한다..
            String ip = "127.0.0.1";
            url = new URL(ip);
                    connection = url.openConnection();

            // 내용을 읽어오기위한 InputStream객체를 생성한다..
            is = connection.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // 내용을 읽어서 화면에 출력한다..
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
                    .println("잘못되 URL입니다. 사용법 : java URLConn http://hostname/path]");
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