//package data.warehousedata;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//import dataservice.stockmanagermandataservice.StockManagermanService;
//
//public class ExcelServlet extends HttpServlet {  
//    public void doGet(HttpServletRequest request, HttpServletResponse response)  
//            throws ServletException, IOException {  
//    	StockManagermanService sms = new Storing();
//    	sms.Daochu();  
//        String str = "daochu.xls";  
//        //String path = request.getSession().getServletContext().getRealPath(str);  
//       download("src/main/java/data/save/daochu.xls", response);  
//   }  
//    private void download(String path, HttpServletResponse response) {  
//        try {              // path是指欲下载的文件的路径。  
//            File file = new File(path);  
//            // 取得文件名。  
//            String filename = file.getName();  
//            // 以流的形式下载文件。  
//            InputStream fis = new BufferedInputStream(new FileInputStream(path));  
//            byte[] buffer = new byte[fis.available()];  
//            fis.read(buffer);  
//            fis.close();  
//            // 清空response  
//            response.reset();  
//            // 设置response的Header  
//            response.addHeader("Content-Disposition", "attachment;filename="  
//                    + new String(filename.getBytes()));  
//            response.addHeader("Content-Length", "" + file.length());  
//           OutputStream toClient = new BufferedOutputStream(  
//                    response.getOutputStream());  
//            response.setContentType("application/vnd.ms-excel;charset=gb2312");  
//            toClient.write(buffer);  
//            toClient.flush();  
//            toClient.close();  
//        } catch (IOException ex) {  
//            ex.printStackTrace();  
//        }  
//    }  
//}  
//
