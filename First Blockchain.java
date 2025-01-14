//SPDX-License-Identifier: MIT
 pragma solidity 0.8.12; //remember to make commentns in your code 

contract SimpleStorage{
// SOlity datav type 
//boolean, unit, int, address, bytes


  uint256 favoriteNumber;
 mapping (string => uint256) public nameToFavoriteNumber;

struct People {
 uint256 favoriteNumber;
 string name;
}

//uint256[] public favoriteNumber;
People[] public people;
//patrick, 1: 7 , jon
function store (uint256 _favoriteNumber) public {
    favoriteNumber = _favoriteNumber;
    

} 
  
function retrieve() public view returns(uint256)  {
return favoriteNumber;
}

//calldata memory and storage
function addPerson(string memory _name, uint256 _favoriteNumber) public {
 people.push(People(_favoriteNumber, _name));
 nameToFavoriteNumber[_name] = _favoriteNumber;

}
}

// 0xd9145CCE52D386f254917e481eB44e9943F39138