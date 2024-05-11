export class GuiModel {

    private _guiModel = {
        "application": {
            "title": "DevOps Meikes Frontend FS2024",
            "formList": [
                {
                    "id": "OwnUserForm",
                    "title": "NotImplemented",
                    "formFieldList": [
                        {
                            "type": "okButton",
                            "name": "Ok"
                        }
                    ]
                },
                // ... other forms
                {
                    "id": "ToDoForm",
                    "title": { default: "ToDo" },
                    "url": "/todo",
                    "formFieldList": [
                        // ... fields for ToDoForm
                    ]
                },
                {
                    "id": "NotToDoForm",
                    "title": { default: "Not ToDo" },
                    "url": "/nottodo",
                    "formFieldList": [
                        {
                            "id": "title",
                            "type": "text",
                            "name": { default: "Titel" },
                            "required": true,
                            "width": 2
                        },
                        {
                            "id": "description",
                            "type": "text",
                            "name": { default: "Text" },
                            "newRow": true,
                            "maxLength": 4000,
                            "height": 4,
                            "width": 2
                        },
                        {
                            "type": "deleteButton",
                            "name": "Delete"
                        },
                        {
                            "type": "cancelButton",
                            "name": "Cancel"
                        },
                        {
                            "type": "okButton",
                            "name": "Ok"
                        }
                    ]
                }
            ],
            "pageList": [
                {
                    "id": "mainmenu",
                    "name": "MainMenu",
                    "elementList": [
                        {
                            "type": "pageLabel",
                            "value": "<h4>Willkommen bei DevOps</h4>",
                            "newRow": true
                        },
                        {
                            "type": "button",
                            "name": { default: "ToDo-List" },
                            "icon": "fa-file-alt",
                            "color": "wet-asphalt",
                            "page": "toDoPage",
                            "width": 2,
                            "newRow": true,
                        },
                        {
                            "type": "button",
                            "name": { default: "Not ToDo-List" },
                            "icon": "fa-file-alt",
                            "color": "pomegranate",
                            "page": "notToDoPage",
                            "width": 2
                        }
                    ]
                },
                {
                    "id": "toDoPage",
                    "elementList": [
                        // ... elements for toDoPage
                    ]
                },
                {
                    "id": "notToDoPage",
                    "elementList": [
                        {
                            "type": "backbutton",
                        },
                        {
                            "type": "newButton",
                            "name": { default: "Neues Not ToDo"},
                            "icon": "fa-ban",
                            "color": "red",
                            "width": 2,
                            "form" : {
                                "form" : "NotToDoForm"
                            }
                        },
                        {
                            "type": "list",
                            "name": "Not ToDo",
                            "icon": "fa-ban",
                            "color": "pomegranate",
                            "search": true,
                            "url": "/nottodo",
                            "form": {
                                "form": "NotToDoForm"
                            }
                        }
                    ]
                },
            ]
        }
    };

    get guiModel() {
        return this._guiModel;
    }
}
