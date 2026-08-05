package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerGamePacketListenerImpl.class)
public class ServerGamePacketListenerImpl987516949Mixin {
        @Inject(at = @At("HEAD"), method = "getRemoteAddress()Ljava/net/SocketAddress;", cancellable = true)
    private void getRemoteAddress_1085651073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085651073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ackBlockChangesUpTo(I)V", cancellable = true)
    private void ackBlockChangesUpTo__2093533375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093533375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookChangeSettingsPacket(Lnet/minecraft/network/protocol/game/ServerboundRecipeBookChangeSettingsPacket;)V", cancellable = true)
    private void handleRecipeBookChangeSettingsPacket__1206206451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206206451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTeleportToEntityPacket(Lnet/minecraft/network/protocol/game/ServerboundTeleportToEntityPacket;)V", cancellable = true)
    private void handleTeleportToEntityPacket__977543794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-977543794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugSubscriptionRequest(Lnet/minecraft/network/protocol/game/ServerboundDebugSubscriptionRequestPacket;)V", cancellable = true)
    private void handleDebugSubscriptionRequest_677074168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(677074168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomCommandSuggestions(Lnet/minecraft/network/protocol/game/ServerboundCommandSuggestionPacket;)V", cancellable = true)
    private void handleCustomCommandSuggestions_1061085472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061085472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBundleItemSelectedPacket(Lnet/minecraft/network/protocol/game/ServerboundSelectBundleItemPacket;)V", cancellable = true)
    private void handleBundleItemSelectedPacket_116089414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(116089414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTestInstanceBlockAction(Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket;)V", cancellable = true)
    private void handleTestInstanceBlockAction_407023187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(407023187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationAcknowledged(Lnet/minecraft/network/protocol/game/ServerboundConfigurationAcknowledgedPacket;)V", cancellable = true)
    private void handleConfigurationAcknowledged__1917371375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1917371375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookSeenRecipePacket(Lnet/minecraft/network/protocol/game/ServerboundRecipeBookSeenRecipePacket;)V", cancellable = true)
    private void handleRecipeBookSeenRecipePacket__620010281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-620010281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSlotStateChanged(Lnet/minecraft/network/protocol/game/ServerboundContainerSlotStateChangedPacket;)V", cancellable = true)
    private void handleContainerSlotStateChanged__1684503987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1684503987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer__9543534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9543534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasInfiniteMaterials()Z", cancellable = true)
    private void hasInfiniteMaterials_1025795532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025795532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "teleport(DDDFF)V", cancellable = true)
    private void teleport__388160260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-388160260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)V", cancellable = true)
    private void teleport_1708072281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1708072281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChat(Lnet/minecraft/network/protocol/game/ServerboundChatPacket;)V", cancellable = true)
    private void handleChat_569655135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569655135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickClientLoadTimeout()V", cancellable = true)
    private void tickClientLoadTimeout_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPosition()V", cancellable = true)
    private void resetPosition_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasClientLoaded()Z", cancellable = true)
    private void hasClientLoaded_1025795532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025795532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetFlyingTicks()V", cancellable = true)
    private void resetFlyingTicks_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeDifficulty(Lnet/minecraft/network/protocol/game/ServerboundChangeDifficultyPacket;)V", cancellable = true)
    private void handleChangeDifficulty_1231409996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1231409996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveVehicle(Lnet/minecraft/network/protocol/game/ServerboundMoveVehiclePacket;)V", cancellable = true)
    private void handleMoveVehicle_1419765812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1419765812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAbilities(Lnet/minecraft/network/protocol/game/ServerboundPlayerAbilitiesPacket;)V", cancellable = true)
    private void handlePlayerAbilities_1368562536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368562536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect__1100353364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1100353364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomPayload(Lnet/minecraft/network/protocol/common/ServerboundCustomPayloadPacket;)V", cancellable = true)
    private void handleCustomPayload_210381611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210381611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldHandleMessage(Lnet/minecraft/network/protocol/Packet;)Z", cancellable = true)
    private void shouldHandleMessage_1143185145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143185145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ServerboundMovePlayerPacket;)V", cancellable = true)
    private void handleMovePlayer__871545499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871545499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClose(Lnet/minecraft/network/protocol/game/ServerboundContainerClosePacket;)V", cancellable = true)
    private void handleContainerClose_2073184864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2073184864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAnimate(Lnet/minecraft/network/protocol/game/ServerboundSwingPacket;)V", cancellable = true)
    private void handleAnimate_110217329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(110217329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendDisguisedChatMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendDisguisedChatMessage__669771843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-669771843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPlayerChatMessage(Lnet/minecraft/network/chat/PlayerChatMessage;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendPlayerChatMessage__31970642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-31970642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(Lnet/minecraft/network/protocol/game/ServerboundPlaceRecipePacket;)V", cancellable = true)
    private void handlePlaceRecipe__199204710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-199204710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromEntity(Lnet/minecraft/network/protocol/game/ServerboundPickItemFromEntityPacket;)V", cancellable = true)
    private void handlePickItemFromEntity__1997227530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1997227530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromBlock(Lnet/minecraft/network/protocol/game/ServerboundPickItemFromBlockPacket;)V", cancellable = true)
    private void handlePickItemFromBlock__170431936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-170431936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markClientUnloadedAfterDeath()V", cancellable = true)
    private void markClientUnloadedAfterDeath_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientInformation(Lnet/minecraft/network/protocol/common/ServerboundClientInformationPacket;)V", cancellable = true)
    private void handleClientInformation_1565572775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1565572775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatAck(Lnet/minecraft/network/protocol/game/ServerboundChatAckPacket;)V", cancellable = true)
    private void handleChatAck_934228094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(934228094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientCommand(Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket;)V", cancellable = true)
    private void handleClientCommand_362290479(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(362290479L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSpectatorAction(Lnet/minecraft/network/protocol/game/ServerboundSpectatorActionPacket;)V", cancellable = true)
    private void handleSpectatorAction__670522870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-670522870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAction(Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket;)V", cancellable = true)
    private void handlePlayerAction__39002912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-39002912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerButtonClick(Lnet/minecraft/network/protocol/game/ServerboundContainerButtonClickPacket;)V", cancellable = true)
    private void handleContainerButtonClick__832225182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-832225182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSignedChatCommand(Lnet/minecraft/network/protocol/game/ServerboundChatCommandSignedPacket;)V", cancellable = true)
    private void handleSignedChatCommand__231420160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-231420160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAttack(Lnet/minecraft/network/protocol/game/ServerboundAttackPacket;)V", cancellable = true)
    private void handleAttack_1494072687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1494072687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClick(Lnet/minecraft/network/protocol/game/ServerboundContainerClickPacket;)V", cancellable = true)
    private void handleContainerClick_1985546448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1985546448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatCommand(Lnet/minecraft/network/protocol/game/ServerboundChatCommandPacket;)V", cancellable = true)
    private void handleChatCommand_949731964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(949731964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInteract(Lnet/minecraft/network/protocol/game/ServerboundInteractPacket;)V", cancellable = true)
    private void handleInteract_1695138753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695138753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUseItemOn(Lnet/minecraft/network/protocol/game/ServerboundUseItemOnPacket;)V", cancellable = true)
    private void handleUseItemOn__1807230506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1807230506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectTrade(Lnet/minecraft/network/protocol/game/ServerboundSelectTradePacket;)V", cancellable = true)
    private void handleSelectTrade__128946585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-128946585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInput(Lnet/minecraft/network/protocol/game/ServerboundPlayerInputPacket;)V", cancellable = true)
    private void handlePlayerInput_797059110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(797059110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptPlayerLoad(Lnet/minecraft/network/protocol/game/ServerboundPlayerLoadedPacket;)V", cancellable = true)
    private void handleAcceptPlayerLoad_1428374449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1428374449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCarriedItem(Lnet/minecraft/network/protocol/game/ServerboundSetCarriedItemPacket;)V", cancellable = true)
    private void handleSetCarriedItem__1616934276(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1616934276L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePaddleBoat(Lnet/minecraft/network/protocol/game/ServerboundPaddleBoatPacket;)V", cancellable = true)
    private void handlePaddleBoat_1428444333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1428444333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetJigsawBlock(Lnet/minecraft/network/protocol/game/ServerboundSetJigsawBlockPacket;)V", cancellable = true)
    private void handleSetJigsawBlock_285855501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(285855501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptTeleportPacket(Lnet/minecraft/network/protocol/game/ServerboundAcceptTeleportationPacket;)V", cancellable = true)
    private void handleAcceptTeleportPacket_584545645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(584545645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSignUpdate(Lnet/minecraft/network/protocol/game/ServerboundSignUpdatePacket;)V", cancellable = true)
    private void handleSignUpdate_369449489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(369449489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientTickEnd(Lnet/minecraft/network/protocol/game/ServerboundClientTickEndPacket;)V", cancellable = true)
    private void handleClientTickEnd_128016540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(128016540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCommandBlock(Lnet/minecraft/network/protocol/game/ServerboundSetCommandBlockPacket;)V", cancellable = true)
    private void handleSetCommandBlock_569152299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569152299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUseItem(Lnet/minecraft/network/protocol/game/ServerboundUseItemPacket;)V", cancellable = true)
    private void handleUseItem__616382027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-616382027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLockDifficulty(Lnet/minecraft/network/protocol/game/ServerboundLockDifficultyPacket;)V", cancellable = true)
    private void handleLockDifficulty__2011226703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011226703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchReceived(Lnet/minecraft/network/protocol/game/ServerboundChunkBatchReceivedPacket;)V", cancellable = true)
    private void handleChunkBatchReceived__573275095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-573275095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetTestBlock(Lnet/minecraft/network/protocol/game/ServerboundSetTestBlockPacket;)V", cancellable = true)
    private void handleSetTestBlock__1656129730(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1656129730L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCommandMinecart(Lnet/minecraft/network/protocol/game/ServerboundSetCommandMinecartPacket;)V", cancellable = true)
    private void handleSetCommandMinecart_1638872987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638872987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePingRequest(Lnet/minecraft/network/protocol/ping/ServerboundPingRequestPacket;)V", cancellable = true)
    private void handlePingRequest_349433298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(349433298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSeenAdvancements(Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;)V", cancellable = true)
    private void handleSeenAdvancements_1025411401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025411401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEditBook(Lnet/minecraft/network/protocol/game/ServerboundEditBookPacket;)V", cancellable = true)
    private void handleEditBook__1429244476(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1429244476L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCommand(Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket;)V", cancellable = true)
    private void handlePlayerCommand__378770747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-378770747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBeaconPacket(Lnet/minecraft/network/protocol/game/ServerboundSetBeaconPacket;)V", cancellable = true)
    private void handleSetBeaconPacket_878135593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(878135593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatSessionUpdate(Lnet/minecraft/network/protocol/game/ServerboundChatSessionUpdatePacket;)V", cancellable = true)
    private void handleChatSessionUpdate_1063002952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1063002952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleJigsawGenerate(Lnet/minecraft/network/protocol/game/ServerboundJigsawGeneratePacket;)V", cancellable = true)
    private void handleJigsawGenerate_1528656513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1528656513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCreativeModeSlot(Lnet/minecraft/network/protocol/game/ServerboundSetCreativeModeSlotPacket;)V", cancellable = true)
    private void handleSetCreativeModeSlot__1224517027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1224517027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRenameItem(Lnet/minecraft/network/protocol/game/ServerboundRenameItemPacket;)V", cancellable = true)
    private void handleRenameItem_2063535782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2063535782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeGameMode(Lnet/minecraft/network/protocol/game/ServerboundChangeGameModePacket;)V", cancellable = true)
    private void handleChangeGameMode_2021725970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021725970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetStructureBlock(Lnet/minecraft/network/protocol/game/ServerboundSetStructureBlockPacket;)V", cancellable = true)
    private void handleSetStructureBlock_413780691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(413780691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityTagQuery(Lnet/minecraft/network/protocol/game/ServerboundEntityTagQueryPacket;)V", cancellable = true)
    private void handleEntityTagQuery__782865978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-782865978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetGameRule(Lnet/minecraft/network/protocol/game/ServerboundSetGameRulePacket;)V", cancellable = true)
    private void handleSetGameRule_911031967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(911031967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEntityTagQuery(Lnet/minecraft/network/protocol/game/ServerboundBlockEntityTagQueryPacket;)V", cancellable = true)
    private void handleBlockEntityTagQuery_1638912561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638912561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "switchToConfig()V", cancellable = true)
    private void switchToConfig_1025791688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1025791688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1025795532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025795532L))
            info.setReturnValue(true);
    }


}
