<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="main.css"/>
    <title>PARUCNC</title>
</head>
<body>
   
    <nav class="headerMenu">
        <a href="htmltest.html"><h1 onclick="">PARUCNC</h1></a>
        <ul class="gnb">
            <li class="menu"><a href="info.html">회사소개</a>
                <ul class="menu2">
                    <li>overview</li>
                    <li>경영이념</li>
                    <li>회사연혁</li>
                    <li>사업영역</li>
                </ul>
            </li>
            <li class="menu"><a href="solution.html">솔루션</a>
                <ul class="menu2">
                    <li>전자구매솔루션</li>
                    <li>MOBILE</li>
                    <li>이슈관리</li>
                </ul>
            </li>
            <li class="menu"><a href="service.html">서비스</a>
                <ul class="menu2">
                    <li>RA</li>
                </ul>
            </li>
            <li class="menu"><a href="ito.html">ITO</a>
                <ul class="menu2">
                    <li>ITO</li>
                </ul>
            </li>
            <li class="menu"><a href="hire.html">인재채용</a>
                <ul class="menu2">
                    <li>인재채용</li>
                </ul>
            </li>
            <li class="menu"><a href="notice.html">고객지원</a>
                <ul class="menu2">
                    <li>공지사항</li>
                </ul>
            </li>
        </ul>
    </nav>
   <section>
       <article class="main">
            <h1>우리 시대의 새벽을 여는 파루씨앤씨</h1>
            <p>회사와 개인의 발전이 함께 중시되고<br>가정과 이웃을 위해 우리의 한 손을 내어줄수 있는</p>
            <a href="info.html">회사소개 바로보기</a>
        </article>

        <article class="area">
            <div class="area_main">
                <h2>PARUCNC AREA</h2>
                <P>다양한 산업의 정보시스템 구축 경험과 지식을 바탕으로 정보시스템 분야의 성공적Biz.를 위한 최고의 파트너 입니다.</P>
            </div>
            <div class="photo">
                <img src="./photo/p1.png" alt="기획/구축">
                <p>고객 환경에 최적화된<br>정보시스템 기획/구축</p>
            </div>
            <div class="photo">
                <img src="./photo/p2.png" alt="정보시스템 운영">
                <p>체계적이고 안정적인<br>정보시스템 운영</p>
            </div>
            <div class="photo">
                <img src="./photo/p3.png" alt="솔루션 지원">
                <p>효율적 커뮤니케이션을<br>위한 솔루션 지원</p>
            </div>
       </article>
   
       <article class="service">
            <div class="photo2">
                <a href="solution.html">
                    <img src="./photo/p4.png" alt="전자구매 솔루션">
                </a>
            </div>
            <div class="photo3">
                <a href="ito.html">
                    <img src="./photo/p5.png" alt="ITO">
                </a>
            </div>
            <div class="photo4">
                <a href="service.html">
                    <img src="./photo/p6.png" alt="RA">
                </a>
            </div>
            <div class="photo5">
                <a href="issue.html">
                    <img src="./photo/p7.png" alt="이슈관리">
                </a>
            </div>
         </article>
   </section>
   <script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  <script>
    $(document).on('mouseover','.menu', function(){
        $('.menu2').slideDown(300);
    });

    // $(document).on('mouseover','div',function(){
    //     if(!$(this).hasClass('menu')){
    //         $('.menu2').slideUp(300);
    //     }
    // });
        var a =1;
    $(document)
    .on('mouseover','.photo2', function(){
        setTimeout(() => {
            $(this).slideUp(1000);
            console.log("mouseover")
        }, 4);
       a=2;
    })
    .on('mouseout','.photo2', function(){
       setTimeout(() => {
        $(this).slideDown(1000);
       console.log("mouseout")
       }, 4);
        a=3;
    });
    $(document)
    .on('mouseover','photo3',function(){
        setTimeout(() => {
           $(this).slideUp(1500);
           console.log('m2') 
        }, 3);
        
    })
    .on('mouseout','photo3',function(){
      setTimeout(() => {
          console.log('m3')
          $(this).slideDown(1500);
      }, 3);  
    });

    
    // $(document).on('mouseover','div', function(){
    //     if(!$(this).hasClass('photo2')){
    //         $('.photo2').slideDown(1000);
    //     }
    // });
    // $(document).on('mouseover','.photo3', function(){
    //     $('.photo3').slideUp(1000);
    // });
    // $(document).on('mouseover','div', function(){
    //     if(!$(this).hasClass('photo3')){
    //         $('.photo3').slideDown(1000);
    //     }
    // });
    // $(document).on('mouseover','.photo4', function(){
    //     $('.photo4').slideUp(1000);
    // });
    // $(document).on('mouseover','div', function(){
    //     if(!$(this).hasClass('photo4')){
    //         $('.photo4').slideDown(1000);
    //     }
    // });
    // $(document).on('mouseover','.photo5', function(){
    //     $('.photo5').slideUp(1000);
    // });
    // $(document).on('mouseover','div', function(){
    //     if(!$(this).hasClass('photo5')){
    //         $('.photo5').slideDown(1000);
    //     }
    // });
  </script>
</body>
<footer>
    <h2>PARUCNC</h2>
    <P>(08375)서울시 구로구 디지털로 31길 53, 608호(이앤씨벤처드림타워5차)&ensp;TEL. 02-6341-8600&ensp;FAX. 02-6341-8609<br>
        Copyright @ parucncCo.,Ltd. All rights reserved. <a onclick=""></a> LOGIN
    </P>
</footer>
</html>