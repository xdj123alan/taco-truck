# Taco-Truck System Design
## Build Project
1. build project in this website: https://start.aliyun.com/

## env
1. jdk version: 1.8
2. spring Boot version:2.6.13
3. H2 database(url:http://localhost:8080/h2-console)

### endpoint design
#### endpoint of query truck
**request body**  
url: /truck/page  
method: POST  
params:
```json
{
    "page":1,
    "size":10,
    "sort":"applicant"
}
```
result: 
```json
{
  "status": 200,
  "result": {
    "content": [
      {
        "id": 168,
        "locationId": 1265606,
        "applicant": "San Francisco Carts & Concessions, Inc. DBA Stanley's Steamers Hot Dogs",
        "facilityType": "Push Cart",
        "cnn": "10628000",
        "locationDescription": "POST ST: STOCKTON ST to POWELL ST (300 - 399)",
        "address": "384 POST ST",
        "blockLot": "0295007",
        "block": "0295",
        "lot": "007",
        "permit": "19MFF-00001",
        "status": "REQUESTED",
        "foodItems": "American Food: Hot dogs: pretzels: ice cream: salads: beverages: sandwiches: soup: coffee: pastries:etc.",
        "x": "6010333.205",
        "y": "2115237.376",
        "latitude": "37.78862121908618",
        "longitude": "-122.40806890640651",
        "schedule": "http://bsm.sfdpw.org/PermitsTracker/reports/report.aspx?title=schedule&report=rptSchedule&params=permit=19MFF-00001&ExportPDF=1&Filename=19MFF-00001_schedule.pdf",
        "dayshours": "",
        "approved": "",
        "received": "20190107",
        "priorPermit": "0",
        "expirationDate": "01/07/2020 12:00:00 AM",
        "location": "(37.78862121908618, -122.40806890640651)",
        "firePreventionDistricts": "5",
        "policeDistricts": "1",
        "supervisorDistricts": "10",
        "zipCodes": "28852",
        "neighborhoodsOld": "6",
        "noisent": ""
      }
    ],
    "pageable": {
      "sort": {
        "empty": false,
        "sorted": true,
        "unsorted": false
      },
      "offset": 10,
      "pageNumber": 1,
      "pageSize": 10,
      "unpaged": false,
      "paged": true
    },
    "totalElements": 489,
    "last": false,
    "totalPages": 49,
    "number": 1,
    "size": 10,
    "sort": {
      "empty": false,
      "sorted": true,
      "unsorted": false
    },
    "numberOfElements": 10,
    "first": false,
    "empty": false
  },
  "errorMsg": null
}
```
