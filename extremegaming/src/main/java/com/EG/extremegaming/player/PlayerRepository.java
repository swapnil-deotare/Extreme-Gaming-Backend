package com.EG.extremegaming.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

@Repository
public class PlayerRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Player save(Player player) {
        dynamoDBMapper.save(player);
        return player;
    }

    public Player getPlayerById(String playerId) {
        return dynamoDBMapper.load(Player.class, playerId);
    }

    public String deletePlayer(String playerId) {
        Player player = dynamoDBMapper.load(Player.class, playerId);
        dynamoDBMapper.delete(player);
        return "Successfuly Deleted";
    }

    public String updatePlayer(String playerId, Player player) {
        dynamoDBMapper.save(player, new DynamoDBSaveExpression().withExpectedEntry(playerId,
                new ExpectedAttributeValue(new AttributeValue(playerId))));
        return playerId;
    }
}
