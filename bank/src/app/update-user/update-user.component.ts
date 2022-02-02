import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../user.service';
import { Users } from '../Users';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  id!: number;
  user : Users = new Users();
  constructor(private userservice : UserService, private route : ActivatedRoute) { }

  ngOnInit(): void 
  {
    this.id = this.route.snapshot.params['id']
    this.userservice.getUserById(this.id).subscribe( data => {
      this.user = data;
    }
    )
  }


  onSubmit(){
    console.log("heelo ");
    this.userservice.updateUser(this.id, this.user).subscribe(data => {
      console.log(data);
      this.user = new Users();
      console.log("Workingggg...")
    } )

  }

}
