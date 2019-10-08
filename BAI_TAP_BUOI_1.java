public class BAI_TAP_BUOI_1 {
}

import java.util.Scanner;
public class main {
    public static void main(String[] args)

        // BAI TAP IF/SWITCH

// Bai 1:

    /*{
    Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu nhat");
    int a =in.nextInt();
        System.out.print("Nhap so thu hai");
    int b =in.nextInt();
      if (a==b)
         System.out.print("Hai so bang nhau");
      else
         System.out.print("Hai so khong bang nhau");
    }

     */
// Bai 2
   /* {
    Scanner in = new Scanner(System.in);
    System.out.print("Nhap chieu cao:");
    float a = in.nextFloat();
      if(a>=170)
           System.out.print("Cao");
      if (160 <a &&  a<170)
           System.out.print("Trung binh");
      if (a<160)
           System.out.print("Thap");
    }

    */
// Bai 3
    /*{
     Scanner in =new Scanner(System.in);
           System.out.print("Nhap lan luot 3 so : ");
     int a = in.nextInt();
     int b = in.nextInt();
     int c = in.nextInt();
      if (a>b && a>c)
        System.out.printf("So lon nhat la %d",a);
      if (b>a && b>c)
        System.out.printf("So lon nhat la %d",b);
      else
        System.out.printf("So lon nhat la %d",c);
     }*/

// Bai 4
    /*{
    Scanner in = new Scanner(System.in);
          System.out.print("Nhap vao cac he so:");
    float a =in.nextFloat();
    float b =in.nextFloat();
    float c =in.nextFloat();
    float d = b*b - 4*a*c;
      if (d>0)
          System.out.print("Phuong trinh co 2 nghiem");
      if (d==0)
          System.out.print("Phuong trinh co nghiem kep");
      else
          System.out.print("Phuong trinh vo nghiem");
    }
     */

// Bai 5
   /* {
        Scanner in = new Scanner(System.in);
        System.out.print("So dien da tieu thu:");
       float used = in.nextFloat();
       float cost ;
       if (used < 199) {
           used=  cost* 2000;
             System.out.printf("So tien dien phai tra : %f", cost);
        };
        if (200 < used && used < 399) {
            cost = used * 3000;
                System.out.printf("So tien dien phai tra : %f", cost);
       };
        if (400 < used && used < 599) {
           cost = used * 4000;
              System.out.printf("So tien dien phai tra : %f", cost);
        };
       if (used > 600) {
           cost = used * 5000;
              System.out.printf("So tien dien phai tra : %f", cost);
        };
    }
    */

// Bai 6
   /* {
       Scanner in = new Scanner(System.in);
          System.out.print("Nhap thang:");
        int month = in.nextInt();
      if (month==4 || month==6 ||month==9 ||month==11)
           System.out.print("Thang co 30 ngay");
       if (month==2)
       {
           System.out.print("Nhap nam :");
          int year = in.nextInt();
             if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)))
                  System.out.printf("Thang 2 năm %d co 29 ngay ", year);
              else
                  System.out.printf("Thang 2 nam %d co 28 ngay", year);
       }
       else
      System.out.print("Thang co 30 ngay" );
}
    */

// BAI TAP VONG LAP

// Bai 1
   /* {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1;i<=n;i++)
            System.out.printf(" %d ",i);
      }
    */

// Bai 2
/* {
    Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong: ");
    int n = in.nextInt();
        if (n <= 0){
        System.out.println("Nhap sai");
    } else {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tong" + sum);
    }
}
 */

// Bai 4
/* {
      Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.printf("%d x %d = %d \n", i, j, (i * j));            }
    }
}
 */

// Bai 7

/*{
    Scanner in = new Scanner(System.in);
    System.out.print("Nhap so hang:");
    int n = in.nextInt();
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
            System.out.print("* ");
        System.out.println();
    }
}
 */

// Bai 8
   /* {
        Scanner in = new Scanner(System.in);
        System.out.print("nhập n:");
        float n =in.nextFloat();
        float S = 0;
            for (float i = 1; i <=n-1 ; i++)
            {
                System.out.printf(" 1/%f + ", i);
                S = S + 1/i;
            }
            S=S+1/n;
            System.out.printf(" 1/%f = %f",n,S);
    }