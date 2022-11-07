//사용자가 입력한 아이디,비밀번호,버튼을 js변수에 저장
const idBOX = document.getElementById("idInput"); // 입력한 아이디 idBTN에 저장
const pwBOX = document.getElementById("pwInput"); // 입력한 비밀번호 pwBTN에 저장
const loginBTN = document.getElementById("loginBTN"); // [submit] 로그인 버튼
//아이디 유효성 검사
const missID = document.getElementById("missID"); // 아이디를 올바른 형식으로 입력하지 않았을 때
//비밀번호 유효성 검사
const missPW = document.getElementById("missPW"); // 비밀번호를 올바른 형식으로 입력하지 않았을 때

//유효성 검사
function examination(){
	// 아이디 유효성 검사
	if(idBOX.value.length==0){ // 아무것도 입력되지 않았을 때
		idBOX.style.borderBottom = "0.5px solid grey";
		missID.style.display = "none";
	}else if(idBOX.value.length > 12){ // 12자리 초과 일 때
		idBOX.style.borderBottom = "4px solid #DC143C";
		missID.style.display = "block";
	} else{ // 12자리 이하 일 때
		idBOX.style.borderBottom = "4px solid #1E90FF";
		missID.style.display = "none";
	}
	// 비밀번호 유효성 검사
	if(pwBOX.value.length == 0){ // 아무것도 입력되지 않았을 때
		loginBTN.disabled = true;
		loginBTN.style.backgroundColor = "lightgrey";
		loginBTN.style.cursor = "no-drop";
		loginBTN.style.color = "black";
		pwBOX.style.borderBottom = "0.5px solid grey";
		missPW.style.display = "none";
	} else if(pwBOX.value.length < 12){ // 12자리 미만 일 때
		pwBOX.style.borderBottom = "4px solid #DC143C";
		missPW.style.display = "block";
	} else { // 12자리 이상 일 때
		loginBTN.disabled = false;
		loginBTN.style.backgroundColor = "black";
		loginBTN.style.cursor = "pointer";
		loginBTN.style.color = "lightgrey";
		pwBOX.style.borderBottom = "4px solid #1E90FF";
		missPW.style.display = "none";
	}
}

// 각각의 input 태그에 유효성검사 함수를 적용시켜주는 것
idBOX.addEventListener("keyup", examination);
pwBOX.addEventListener("keyup", examination);