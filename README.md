# SMS Helper || For Offline Use 📱

SMS Helper is an **Android application** that helps users interact with their lost or forgotten phone using **offline SMS commands**. It is specially designed for emergency scenarios where internet access is not available.

## 📌 Features

- 🔒 **M-PIN protected** secure SMS control
- 📍 Get your phone’s location via SMS (even without internet)
- 📳 Switch between Silent and Ring mode remotely
- 🔔 Ring your device if misplaced
- 📇 Get contact number from your phone via SMS

## 📱 Use Case

Imagine you’ve forgotten your phone at home and urgently need a contact number. Just send a pre-formatted SMS with the M-PIN from another device, and the app will fetch and send the required details.

## 💡 Technology Stack

- **Frontend:** XML (Android UI)
- **Backend:** Java (Android SDK)
- **IDE:** Android Studio
- **Database:** Firebase Realtime Database (for authentication & settings)

## 🧠 How It Works

1. Install the app and sign up.
2. Enable the service in the app settings.
3. App listens for SMS commands in the background.
4. When a valid command with the correct M-PIN is received, the corresponding task is performed and SMS reply is sent back.

## 📷 Screenshots

<img width="200" height="500" alt="Logo_Screenshot" src="https://github.com/user-attachments/assets/27a01836-97ec-4ced-b924-c8f2678c3ea9" /> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Slider1_Screenshot" src="https://github.com/user-attachments/assets/dff7e27a-bab2-4e5c-9bf5-6709d8dfae84" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Slider2_Screenshot" src="https://github.com/user-attachments/assets/21a216b9-d670-475c-87c7-d9e5da823297" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Slider3_Screenshot" src="https://github.com/user-attachments/assets/d319cc91-5dfb-47e6-85af-42f90959ad29" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Slider4_Screenshot" src="https://github.com/user-attachments/assets/62f9dcde-247e-45a0-bc51-c1b0cb163373" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Signup_Screenshot" src="https://github.com/user-attachments/assets/bdf7fc46-f76a-4d98-9e72-75795a4e0d64" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Login_Screenshot" src="https://github.com/user-attachments/assets/a6d33841-4ad2-4b11-ac81-cef1743209d6" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Number_Verification_Screenshot" src="https://github.com/user-attachments/assets/79858b4f-4afb-493a-a859-f9dec485203c" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Enter_otp_Screenshot" src="https://github.com/user-attachments/assets/d193d9b4-81df-4b8f-9b5c-2bb28c35e6bf" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Set_mpin_Screenshot" src="https://github.com/user-attachments/assets/e6330a0a-f216-4583-ad88-322a8108a25f" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Reenter_mpin_Screenshot" src="https://github.com/user-attachments/assets/859bf554-8b7f-4dc1-bcd6-3a97af2cf114" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Home_window_Screenshot" src="https://github.com/user-attachments/assets/a4040fa7-aa18-4f56-b5bb-b99e6a40af6e" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Navigation_drawer_Screenshot" src="https://github.com/user-attachments/assets/11db6db4-1201-48d8-823d-c2f7cf9a59c5" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Navigation_drawer_with_servise_on_Screenshot" src="https://github.com/user-attachments/assets/79589b5b-ddcb-46a9-9568-f0594b2ca91e" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Profile_window_Screenshot" src="https://github.com/user-attachments/assets/32401592-ab46-4c64-b037-3d34d71b0068" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Edit_profile_window_Screenshot" src="https://github.com/user-attachments/assets/479c4c6b-2aba-4cd2-8afa-ed269b0a67bd" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Permission_window_Screenshot" src="https://github.com/user-attachments/assets/6c5b6e6e-878a-4c6f-b3ff-dbaa8f87a779" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="200" height="500" alt="Security_window_Screenshot" src="https://github.com/user-attachments/assets/221b2528-3e33-45a4-950e-351b2ba6e45f" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/><br/>
<img width="200" height="500" alt="Create_new_password_Screenshot" src="https://github.com/user-attachments/assets/172710b5-b85f-4382-8035-aecf25e8e612" />

---


## 🛠 Requirements

- Android OS 5.0+ (API Level 21 or higher)
- 2GB RAM minimum
- 30MB Storage

## 📲 SMS Command Examples

| Purpose              | SMS Format                            |
|----------------------|----------------------------------------|
| Get Contact Number   | `CONTACT [name] [m-pin]`               |
| Get Location         | `LOCATION [m-pin]`                     |
| Ring Phone           | `RING [m-pin]`                         |
| Switch to Normal     | `NORMAL [m-pin]`                       |
| Switch to Silent     | `SILENT [m-pin]`                       |

## 🔐 Permissions Required

- SMS (Send & Receive)
- Location
- Contacts
- Background access

## 🚀 Future Scope

- Add lock screen password change via SMS
- Implement remote shutdown
- Integrate blockchain for better security
- Fetch mobile tower location using OpenCellId
- Support MongoDB for cloud storage

## 👨‍💻 Developed By

- Ayush Sunil Upase
- Aditya Avinash Thosar
