package com.petstore.delegates;

import gen.petstore.api.StoreApi;

import gen.petstore.api.StoreApiDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class StoreApiImp implements StoreApi {
    @Override
    public StoreApiDelegate getDelegate() {
        return new StoreApiDelegateImp();
    }

    @Service
    public static class StoreApiDelegateImp implements StoreApiDelegate {

        public ResponseEntity<Void> deleteOrder(Long orderId) {
            return new ResponseEntity<>(HttpStatus.OK);
        }

        public ResponseEntity<Map<String, Integer>> getInventory() {
            Map inventory = new HashMap<String, Integer>();

            return new ResponseEntity<>(inventory, HttpStatus.OK);
        }
    }
}
