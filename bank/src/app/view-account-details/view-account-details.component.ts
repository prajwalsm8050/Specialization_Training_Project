import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../user.service';
import { Users } from '../Users';

@Component({
  selector: 'app-view-account-details',
  templateUrl: './view-account-details.component.html',
  styleUrls: ['./view-account-details.component.css']
})
export class ViewAccountDetailsComponent implements OnInit {

  constructor(private userservice : UserService, private router : ActivatedRoute) { }

  usr : Users = new Users();
  id!:number



  public users : any | undefined

  ngOnInit(): void {
    this.id = this.router.snapshot.params['id']
    this.userservice.getUserById(this.id).subscribe((data) => {
      this.users = data
      console.log(data)
      console.log(this.users.firstname)
    })

  }

}

