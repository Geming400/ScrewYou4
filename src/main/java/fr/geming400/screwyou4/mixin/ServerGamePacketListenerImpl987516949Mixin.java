package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.ServerGamePacketListenerImpl.class)
public class ServerGamePacketListenerImpl987516949Mixin {
        @Inject(at = @At("HEAD"), method = "getRemoteAddress()Ljava/net/SocketAddress;", cancellable = true)
    private void getRemoteAddress_1498800537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498800537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_857833291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857833291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasInfiniteMaterials()Z", cancellable = true)
    private void hasInfiniteMaterials__143961202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143961202L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickClientLoadTimeout()V", cancellable = true)
    private void tickClientLoadTimeout_928950773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(928950773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasClientLoaded()Z", cancellable = true)
    private void hasClientLoaded_861887650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861887650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetPosition()V", cancellable = true)
    private void resetPosition_594639408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(594639408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetFlyingTicks()V", cancellable = true)
    private void resetFlyingTicks_557939056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(557939056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markClientUnloadedAfterDeath()V", cancellable = true)
    private void markClientUnloadedAfterDeath_517204986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(517204986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayer()Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void getPlayer_573551643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573551643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleChat(Lnet/minecraft/network/protocol/game/ServerboundChatPacket;)V", cancellable = true)
    private void handleChat__427400961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-427400961L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "switchToConfig()V", cancellable = true)
    private void switchToConfig__968906633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-968906633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromBlock(Lnet/minecraft/network/protocol/game/ServerboundPickItemFromBlockPacket;)V", cancellable = true)
    private void handlePickItemFromBlock_441006169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441006169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromEntity(Lnet/minecraft/network/protocol/game/ServerboundPickItemFromEntityPacket;)V", cancellable = true)
    private void handlePickItemFromEntity__615395169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615395169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_1039142416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039142416L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sendDisguisedChatMessage(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendDisguisedChatMessage_80163567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(80163567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPlayerChatMessage(Lnet/minecraft/network/chat/PlayerChatMessage;Lnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendPlayerChatMessage__1767332492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1767332492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientInformation(Lnet/minecraft/network/protocol/common/ServerboundClientInformationPacket;)V", cancellable = true)
    private void handleClientInformation_845217390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(845217390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAttack(Lnet/minecraft/network/protocol/game/ServerboundAttackPacket;)V", cancellable = true)
    private void handleAttack__1477581825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477581825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInteract(Lnet/minecraft/network/protocol/game/ServerboundInteractPacket;)V", cancellable = true)
    private void handleInteract_1955472703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1955472703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatCommand(Lnet/minecraft/network/protocol/game/ServerboundChatCommandPacket;)V", cancellable = true)
    private void handleChatCommand__2105239919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2105239919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSpectatorAction(Lnet/minecraft/network/protocol/game/ServerboundSpectatorActionPacket;)V", cancellable = true)
    private void handleSpectatorAction_455970093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(455970093L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAction(Lnet/minecraft/network/protocol/game/ServerboundPlayerActionPacket;)V", cancellable = true)
    private void handlePlayerAction__473721697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-473721697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCommand(Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket;)V", cancellable = true)
    private void handlePlayerCommand__1047320285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1047320285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInput(Lnet/minecraft/network/protocol/game/ServerboundPlayerInputPacket;)V", cancellable = true)
    private void handlePlayerInput__574589211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-574589211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSignedChatCommand(Lnet/minecraft/network/protocol/game/ServerboundChatCommandSignedPacket;)V", cancellable = true)
    private void handleSignedChatCommand_364759185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364759185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatAck(Lnet/minecraft/network/protocol/game/ServerboundChatAckPacket;)V", cancellable = true)
    private void handleChatAck__1446699755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446699755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientCommand(Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket;)V", cancellable = true)
    private void handleClientCommand__200552329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200552329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerButtonClick(Lnet/minecraft/network/protocol/game/ServerboundContainerButtonClickPacket;)V", cancellable = true)
    private void handleContainerButtonClick_173001439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(173001439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClick(Lnet/minecraft/network/protocol/game/ServerboundContainerClickPacket;)V", cancellable = true)
    private void handleContainerClick__1110515745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1110515745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetGameRule(Lnet/minecraft/network/protocol/game/ServerboundSetGameRulePacket;)V", cancellable = true)
    private void handleSetGameRule_1849327703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1849327703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEntityTagQuery(Lnet/minecraft/network/protocol/game/ServerboundBlockEntityTagQueryPacket;)V", cancellable = true)
    private void handleBlockEntityTagQuery_1961572987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1961572987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUseItemOn(Lnet/minecraft/network/protocol/game/ServerboundUseItemOnPacket;)V", cancellable = true)
    private void handleUseItemOn__2130770683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2130770683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleJigsawGenerate(Lnet/minecraft/network/protocol/game/ServerboundJigsawGeneratePacket;)V", cancellable = true)
    private void handleJigsawGenerate_1626959295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1626959295L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptPlayerLoad(Lnet/minecraft/network/protocol/game/ServerboundPlayerLoadedPacket;)V", cancellable = true)
    private void handleAcceptPlayerLoad__1151530616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1151530616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetTestBlock(Lnet/minecraft/network/protocol/game/ServerboundSetTestBlockPacket;)V", cancellable = true)
    private void handleSetTestBlock_1196872031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1196872031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCarriedItem(Lnet/minecraft/network/protocol/game/ServerboundSetCarriedItemPacket;)V", cancellable = true)
    private void handleSetCarriedItem_2033277535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2033277535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEditBook(Lnet/minecraft/network/protocol/game/ServerboundEditBookPacket;)V", cancellable = true)
    private void handleEditBook_1628023455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628023455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRenameItem(Lnet/minecraft/network/protocol/game/ServerboundRenameItemPacket;)V", cancellable = true)
    private void handleRenameItem_1880582047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880582047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCommandMinecart(Lnet/minecraft/network/protocol/game/ServerboundSetCommandMinecartPacket;)V", cancellable = true)
    private void handleSetCommandMinecart__1070572929(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1070572929L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetJigsawBlock(Lnet/minecraft/network/protocol/game/ServerboundSetJigsawBlockPacket;)V", cancellable = true)
    private void handleSetJigsawBlock_1307315263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1307315263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAcceptTeleportPacket(Lnet/minecraft/network/protocol/game/ServerboundAcceptTeleportationPacket;)V", cancellable = true)
    private void handleAcceptTeleportPacket__1206906358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206906358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePaddleBoat(Lnet/minecraft/network/protocol/game/ServerboundPaddleBoatPacket;)V", cancellable = true)
    private void handlePaddleBoat__928106689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-928106689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityTagQuery(Lnet/minecraft/network/protocol/game/ServerboundEntityTagQueryPacket;)V", cancellable = true)
    private void handleEntityTagQuery_618436895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(618436895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetStructureBlock(Lnet/minecraft/network/protocol/game/ServerboundSetStructureBlockPacket;)V", cancellable = true)
    private void handleSetStructureBlock_569379007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(569379007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUseItem(Lnet/minecraft/network/protocol/game/ServerboundUseItemPacket;)V", cancellable = true)
    private void handleUseItem_131280515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(131280515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSeenAdvancements(Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;)V", cancellable = true)
    private void handleSeenAdvancements__967431105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-967431105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBeaconPacket(Lnet/minecraft/network/protocol/game/ServerboundSetBeaconPacket;)V", cancellable = true)
    private void handleSetBeaconPacket__1070883645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1070883645L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleClientTickEnd(Lnet/minecraft/network/protocol/game/ServerboundClientTickEndPacket;)V", cancellable = true)
    private void handleClientTickEnd_1108764305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1108764305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLockDifficulty(Lnet/minecraft/network/protocol/game/ServerboundLockDifficultyPacket;)V", cancellable = true)
    private void handleLockDifficulty_1151387583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1151387583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCreativeModeSlot(Lnet/minecraft/network/protocol/game/ServerboundSetCreativeModeSlotPacket;)V", cancellable = true)
    private void handleSetCreativeModeSlot__195889965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-195889965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCommandBlock(Lnet/minecraft/network/protocol/game/ServerboundSetCommandBlockPacket;)V", cancellable = true)
    private void handleSetCommandBlock_1553721199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1553721199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeGameMode(Lnet/minecraft/network/protocol/game/ServerboundChangeGameModePacket;)V", cancellable = true)
    private void handleChangeGameMode__66576481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-66576481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChatSessionUpdate(Lnet/minecraft/network/protocol/game/ServerboundChatSessionUpdatePacket;)V", cancellable = true)
    private void handleChatSessionUpdate__322156439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-322156439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSignUpdate(Lnet/minecraft/network/protocol/game/ServerboundSignUpdatePacket;)V", cancellable = true)
    private void handleSignUpdate__192771905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-192771905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectTrade(Lnet/minecraft/network/protocol/game/ServerboundSelectTradePacket;)V", cancellable = true)
    private void handleSelectTrade_404603879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(404603879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchReceived(Lnet/minecraft/network/protocol/game/ServerboundChunkBatchReceivedPacket;)V", cancellable = true)
    private void handleChunkBatchReceived_637458367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637458367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePingRequest(Lnet/minecraft/network/protocol/ping/ServerboundPingRequestPacket;)V", cancellable = true)
    private void handlePingRequest_217891517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(217891517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(Lnet/minecraft/network/protocol/game/ServerboundPlaceRecipePacket;)V", cancellable = true)
    private void handlePlaceRecipe__1369071155(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1369071155L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBundleItemSelectedPacket(Lnet/minecraft/network/protocol/game/ServerboundSelectBundleItemPacket;)V", cancellable = true)
    private void handleBundleItemSelectedPacket_1608577446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1608577446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSlotStateChanged(Lnet/minecraft/network/protocol/game/ServerboundContainerSlotStateChangedPacket;)V", cancellable = true)
    private void handleContainerSlotStateChanged_1912266547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1912266547L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugSubscriptionRequest(Lnet/minecraft/network/protocol/game/ServerboundDebugSubscriptionRequestPacket;)V", cancellable = true)
    private void handleDebugSubscriptionRequest_683603743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(683603743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTestInstanceBlockAction(Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket;)V", cancellable = true)
    private void handleTestInstanceBlockAction_1292445119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1292445119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookChangeSettingsPacket(Lnet/minecraft/network/protocol/game/ServerboundRecipeBookChangeSettingsPacket;)V", cancellable = true)
    private void handleRecipeBookChangeSettingsPacket__1201566233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1201566233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationAcknowledged(Lnet/minecraft/network/protocol/game/ServerboundConfigurationAcknowledgedPacket;)V", cancellable = true)
    private void handleConfigurationAcknowledged_1190514107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1190514107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomCommandSuggestions(Lnet/minecraft/network/protocol/game/ServerboundCommandSuggestionPacket;)V", cancellable = true)
    private void handleCustomCommandSuggestions__113182205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-113182205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTeleportToEntityPacket(Lnet/minecraft/network/protocol/game/ServerboundTeleportToEntityPacket;)V", cancellable = true)
    private void handleTeleportToEntityPacket__1973020473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1973020473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookSeenRecipePacket(Lnet/minecraft/network/protocol/game/ServerboundRecipeBookSeenRecipePacket;)V", cancellable = true)
    private void handleRecipeBookSeenRecipePacket__1260511577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1260511577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ackBlockChangesUpTo(I)V", cancellable = true)
    private void ackBlockChangesUpTo__325092554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325092554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onDisconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void onDisconnect_1288779313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288779313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldHandleMessage(Lnet/minecraft/network/protocol/Packet;)Z", cancellable = true)
    private void shouldHandleMessage__841236795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841236795L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleCustomPayload(Lnet/minecraft/network/protocol/common/ServerboundCustomPayloadPacket;)V", cancellable = true)
    private void handleCustomPayload__23669642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-23669642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAnimate(Lnet/minecraft/network/protocol/game/ServerboundSwingPacket;)V", cancellable = true)
    private void handleAnimate_1179411448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1179411448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ServerboundMovePlayerPacket;)V", cancellable = true)
    private void handleMovePlayer_957506623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(957506623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClose(Lnet/minecraft/network/protocol/game/ServerboundContainerClosePacket;)V", cancellable = true)
    private void handleContainerClose__1287852577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287852577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveVehicle(Lnet/minecraft/network/protocol/game/ServerboundMoveVehiclePacket;)V", cancellable = true)
    private void handleMoveVehicle_1095417345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1095417345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeDifficulty(Lnet/minecraft/network/protocol/game/ServerboundChangeDifficultyPacket;)V", cancellable = true)
    private void handleChangeDifficulty_52298911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(52298911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAbilities(Lnet/minecraft/network/protocol/game/ServerboundPlayerAbilitiesPacket;)V", cancellable = true)
    private void handlePlayerAbilities_239570921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(239570921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/entity/PositionMoveRotation;Ljava/util/Set;)V", cancellable = true)
    private void teleport__1790131954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1790131954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(DDDFF)V", cancellable = true)
    private void teleport__1951702425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1951702425L))
            info.cancel();
    }


}
