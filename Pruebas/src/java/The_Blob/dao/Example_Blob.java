package The_Blob.dao;

public class Example_Blob {
    
    [Example Blob Archetecture]

[Main Controller Class  ] <--- [Images]
[+Data_List_Provider    ] <--- [Records]
[+State                 ] <--- [Data1]
[+Mode                  ] <--- [Figure1]
[+User                  ] <--- [Users]
[+Group                 ] <--- [ErrorSet]
[...                    ] <--- [Table1]
[-----------------------]      ...
[+Start()               ]
[+Stop()                ]
[+Initialize()          ]
[+Set_Mode()            ]
[...                    ]
    
}
