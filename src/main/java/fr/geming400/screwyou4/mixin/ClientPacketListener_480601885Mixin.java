package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientPacketListener.class)
public class ClientPacketListener_480601885Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1633973545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1633973545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__2072475793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072475793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_350918226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(350918226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/client/multiplayer/ClientLevel;", cancellable = true)
    private void getLevel__1302217628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302217628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnection()Lnet/minecraft/network/Connection;", cancellable = true)
    private void getConnection_741135467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741135467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void scoreboard_473356539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473356539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundEntityEventPacket;)V", cancellable = true)
    private void handleEntityEvent__602432056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-602432056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDamageEvent(Lnet/minecraft/network/protocol/game/ClientboundDamageEventPacket;)V", cancellable = true)
    private void handleDamageEvent_1902314208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1902314208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaypointManager()Lnet/minecraft/client/waypoints/ClientWaypointManager;", cancellable = true)
    private void getWaypointManager__651007572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651007572L))
            info.setReturnValue(new net.minecraft.client.waypoints.ClientWaypointManager());
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void registryAccess__611787612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611787612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasClientLoaded()Z", cancellable = true)
    private void hasClientLoaded_354972585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354972585L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/client/multiplayer/ClientAdvancements;", cancellable = true)
    private void getAdvancements__643383276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643383276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocalGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getLocalGameProfile_804490006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804490006L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfo(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfo_738770417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738770417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfo(Ljava/util/UUID;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfo_558081915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558081915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/network/protocol/game/ClientboundGameEventPacket;)V", cancellable = true)
    private void handleGameEvent__2123032474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123032474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Lnet/minecraft/world/item/crafting/RecipeAccess;", cancellable = true)
    private void recipes__288320933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288320933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugQueryHandler()Lnet/minecraft/client/DebugQueryHandler;", cancellable = true)
    private void getDebugQueryHandler_1644463684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644463684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "broadcastClientInformation(Lnet/minecraft/server/level/ClientInformation;)V", cancellable = true)
    private void broadcastClientInformation__1668868000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1668868000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendCommand(Ljava/lang/String;)V", cancellable = true)
    private void sendCommand_611296214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611296214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeenPlayers()Ljava/util/Map;", cancellable = true)
    private void getSeenPlayers_1177422563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177422563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "searchTrees()Lnet/minecraft/client/multiplayer/SessionSearchTrees;", cancellable = true)
    private void searchTrees__185092137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185092137L))
            info.setReturnValue(new net.minecraft.client.multiplayer.SessionSearchTrees());
    }

    @Inject(at = @At("HEAD"), method = "onlineMode()Z", cancellable = true)
    private void onlineMode_1044359165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044359165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sendChat(Ljava/lang/String;)V", cancellable = true)
    private void sendChat__477833511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-477833511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fuelValues()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void fuelValues__338938334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338938334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures__1687263152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687263152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potionBrewing()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void potionBrewing__743261629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743261629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/client/ClientClockManager;", cancellable = true)
    private void clockManager__2003244953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003244953L))
            info.setReturnValue(new net.minecraft.client.ClientClockManager());
    }

    @Inject(at = @At("HEAD"), method = "getCommands()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getCommands_104108559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104108559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendUnattendedCommand(Ljava/lang/String;Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void sendUnattendedCommand__2009418027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2009418027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepareKeyPair()V", cancellable = true)
    private void prepareKeyPair_2089094717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2089094717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSearchTrees()V", cancellable = true)
    private void updateSearchTrees_271752459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271752459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getServerData__147533845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147533845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_532227351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532227351L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderWarningDelay(Lnet/minecraft/network/protocol/game/ClientboundSetBorderWarningDelayPacket;)V", cancellable = true)
    private void handleSetBorderWarningDelay_1263925324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1263925324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomChatCompletions(Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket;)V", cancellable = true)
    private void handleCustomChatCompletions__1885854950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1885854950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetSimulationDistance(Lnet/minecraft/network/protocol/game/ClientboundSetSimulationDistancePacket;)V", cancellable = true)
    private void handleSetSimulationDistance_767510714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(767510714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderWarningDistance(Lnet/minecraft/network/protocol/game/ClientboundSetBorderWarningDistancePacket;)V", cancellable = true)
    private void handleSetBorderWarningDistance__1284174290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1284174290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityPassengersPacket(Lnet/minecraft/network/protocol/game/ClientboundSetPassengersPacket;)V", cancellable = true)
    private void handleSetEntityPassengersPacket_61022901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(61022901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateAdvancementsPacket(Lnet/minecraft/network/protocol/game/ClientboundUpdateAdvancementsPacket;)V", cancellable = true)
    private void handleUpdateAdvancementsPacket_2124906422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124906422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleProjectilePowerPacket(Lnet/minecraft/network/protocol/game/ClientboundProjectilePowerPacket;)V", cancellable = true)
    private void handleProjectilePowerPacket__1563334122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563334122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTestInstanceBlockStatus(Lnet/minecraft/network/protocol/game/ClientboundTestInstanceBlockStatus;)V", cancellable = true)
    private void handleTestInstanceBlockStatus__776546962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-776546962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectAdvancementsTab(Lnet/minecraft/network/protocol/game/ClientboundSelectAdvancementsTabPacket;)V", cancellable = true)
    private void handleSelectAdvancementsTab__1987723734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1987723734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerCompiledSectionCallback()Ljava/lang/Runnable;", cancellable = true)
    private void getPlayerCompiledSectionCallback__1793821829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793821829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decoratedHashOpsGenenerator()Lnet/minecraft/network/HashedPatchMap$HashGenerator;", cancellable = true)
    private void decoratedHashOpsGenenerator__1291277438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1291277438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(Lnet/minecraft/network/protocol/game/ClientboundPlaceGhostRecipePacket;)V", cancellable = true)
    private void handlePlaceRecipe_1676465853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1676465853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerIds()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerIds__448920870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448920870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayers()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayers_231943797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231943797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearLevel()V", cancellable = true)
    private void clearLevel__135644424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-135644424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListedOnlinePlayers()Ljava/util/Collection;", cancellable = true)
    private void getListedOnlinePlayers_1997663864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997663864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuggestionsProvider()Lnet/minecraft/client/multiplayer/ClientSuggestionProvider;", cancellable = true)
    private void getSuggestionsProvider_319523313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319523313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerForCleaning(Lnet/minecraft/client/multiplayer/CacheSlot;)V", cancellable = true)
    private void registerForCleaning__786733404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-786733404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateTags(Lnet/minecraft/network/protocol/common/ClientboundUpdateTagsPacket;)V", cancellable = true)
    private void handleUpdateTags_856858101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(856858101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomPayload(Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;)V", cancellable = true)
    private void handleCustomPayload__918995536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-918995536L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDebugValueAccess()Lnet/minecraft/util/debug/DebugValueAccess;", cancellable = true)
    private void createDebugValueAccess_1528169291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528169291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleBlockChangedAck(Lnet/minecraft/network/protocol/game/ClientboundBlockChangedAckPacket;)V", cancellable = true)
    private void handleBlockChangedAck__1325169870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1325169870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTickingStep(Lnet/minecraft/network/protocol/game/ClientboundTickingStepPacket;)V", cancellable = true)
    private void handleTickingStep__8428012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-8428012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLogin(Lnet/minecraft/network/protocol/game/ClientboundLoginPacket;)V", cancellable = true)
    private void handleLogin__766586716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-766586716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAddEntity(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void handleAddEntity__95132626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95132626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityMotion(Lnet/minecraft/network/protocol/game/ClientboundSetEntityMotionPacket;)V", cancellable = true)
    private void handleSetEntityMotion__363117248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-363117248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityData(Lnet/minecraft/network/protocol/game/ClientboundSetEntityDataPacket;)V", cancellable = true)
    private void handleSetEntityData_968135448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(968135448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTeleportEntity(Lnet/minecraft/network/protocol/game/ClientboundTeleportEntityPacket;)V", cancellable = true)
    private void handleTeleportEntity__569771442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-569771442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTickingState(Lnet/minecraft/network/protocol/game/ClientboundTickingStatePacket;)V", cancellable = true)
    private void handleTickingState_411175950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(411175950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityPositionSync(Lnet/minecraft/network/protocol/game/ClientboundEntityPositionSyncPacket;)V", cancellable = true)
    private void handleEntityPositionSync_1256255470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1256255470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRotateMob(Lnet/minecraft/network/protocol/game/ClientboundRotateHeadPacket;)V", cancellable = true)
    private void handleRotateMob_1078899752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1078899752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBlocksUpdate(Lnet/minecraft/network/protocol/game/ClientboundSectionBlocksUpdatePacket;)V", cancellable = true)
    private void handleChunkBlocksUpdate__1818571130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818571130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLevelChunkWithLight(Lnet/minecraft/network/protocol/game/ClientboundLevelChunkWithLightPacket;)V", cancellable = true)
    private void handleLevelChunkWithLight__1289194392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1289194392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunksBiomes(Lnet/minecraft/network/protocol/game/ClientboundChunksBiomesPacket;)V", cancellable = true)
    private void handleChunksBiomes__132388626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-132388626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRemoveEntities(Lnet/minecraft/network/protocol/game/ClientboundRemoveEntitiesPacket;)V", cancellable = true)
    private void handleRemoveEntities_19945774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(19945774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerChat(Lnet/minecraft/network/protocol/game/ClientboundPlayerChatPacket;)V", cancellable = true)
    private void handlePlayerChat__2048366034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2048366034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisguisedChat(Lnet/minecraft/network/protocol/game/ClientboundDisguisedChatPacket;)V", cancellable = true)
    private void handleDisguisedChat__329560580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-329560580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHurtAnimation(Lnet/minecraft/network/protocol/game/ClientboundHurtAnimationPacket;)V", cancellable = true)
    private void handleHurtAnimation_1185214988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1185214988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleForgetLevelChunk(Lnet/minecraft/network/protocol/game/ClientboundForgetLevelChunkPacket;)V", cancellable = true)
    private void handleForgetLevelChunk__435135794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-435135794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetHeldSlot(Lnet/minecraft/network/protocol/game/ClientboundSetHeldSlotPacket;)V", cancellable = true)
    private void handleSetHeldSlot_1960687500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960687500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetHealth(Lnet/minecraft/network/protocol/game/ClientboundSetHealthPacket;)V", cancellable = true)
    private void handleSetHealth_1633789242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633789242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTakeItemEntity(Lnet/minecraft/network/protocol/game/ClientboundTakeItemEntityPacket;)V", cancellable = true)
    private void handleTakeItemEntity_947676206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(947676206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAnimate(Lnet/minecraft/network/protocol/game/ClientboundAnimatePacket;)V", cancellable = true)
    private void handleAnimate__1496712972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1496712972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityLinkPacket(Lnet/minecraft/network/protocol/game/ClientboundSetEntityLinkPacket;)V", cancellable = true)
    private void handleEntityLinkPacket__1179488574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179488574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationStart(Lnet/minecraft/network/protocol/game/ClientboundStartConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationStart__1955198362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1955198362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockUpdate(Lnet/minecraft/network/protocol/game/ClientboundBlockUpdatePacket;)V", cancellable = true)
    private void handleBlockUpdate_241411338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(241411338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveEntity(Lnet/minecraft/network/protocol/game/ClientboundMoveEntityPacket;)V", cancellable = true)
    private void handleMoveEntity_1194358542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194358542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRotatePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerRotationPacket;)V", cancellable = true)
    private void handleRotatePlayer__1248863029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1248863029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDeleteChat(Lnet/minecraft/network/protocol/game/ClientboundDeleteChatPacket;)V", cancellable = true)
    private void handleDeleteChat_45185134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(45185134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMinecartAlongTrack(Lnet/minecraft/network/protocol/game/ClientboundMoveMinecartPacket;)V", cancellable = true)
    private void handleMinecartAlongTrack__1069351829(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069351829L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetTime(Lnet/minecraft/network/protocol/game/ClientboundSetTimePacket;)V", cancellable = true)
    private void handleSetTime__1954342248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954342248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetSpawn(Lnet/minecraft/network/protocol/game/ClientboundSetDefaultSpawnPositionPacket;)V", cancellable = true)
    private void handleSetSpawn__39144728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-39144728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRespawn(Lnet/minecraft/network/protocol/game/ClientboundRespawnPacket;)V", cancellable = true)
    private void handleRespawn__1562107738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1562107738L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSystemChat(Lnet/minecraft/network/protocol/game/ClientboundSystemChatPacket;)V", cancellable = true)
    private void handleSystemChat_1489595118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1489595118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetExperience(Lnet/minecraft/network/protocol/game/ClientboundSetExperiencePacket;)V", cancellable = true)
    private void handleSetExperience_1142317342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1142317342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V", cancellable = true)
    private void handleMovePlayer__718233930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-718233930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleExplosion(Lnet/minecraft/network/protocol/game/ClientboundExplodePacket;)V", cancellable = true)
    private void handleExplosion_1122550848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1122550848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenScreen(Lnet/minecraft/network/protocol/game/ClientboundOpenScreenPacket;)V", cancellable = true)
    private void handleOpenScreen__2029105074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2029105074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockDestruction(Lnet/minecraft/network/protocol/game/ClientboundBlockDestructionPacket;)V", cancellable = true)
    private void handleBlockDestruction__1654907666(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1654907666L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSetData(Lnet/minecraft/network/protocol/game/ClientboundContainerSetDataPacket;)V", cancellable = true)
    private void handleContainerSetData_589284398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(589284398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMapItemData(Lnet/minecraft/network/protocol/game/ClientboundMapItemDataPacket;)V", cancellable = true)
    private void handleMapItemData_1840037252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1840037252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSetSlot(Lnet/minecraft/network/protocol/game/ClientboundContainerSetSlotPacket;)V", cancellable = true)
    private void handleContainerSetSlot__411809362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-411809362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCursorItem(Lnet/minecraft/network/protocol/game/ClientboundSetCursorItemPacket;)V", cancellable = true)
    private void handleSetCursorItem__489130400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-489130400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLevelEvent(Lnet/minecraft/network/protocol/game/ClientboundLevelEventPacket;)V", cancellable = true)
    private void handleLevelEvent_112010318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(112010318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEntityData(Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;)V", cancellable = true)
    private void handleBlockEntityData__59124926(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-59124926L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCommands(Lnet/minecraft/network/protocol/game/ClientboundCommandsPacket;)V", cancellable = true)
    private void handleCommands__1035904882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1035904882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCommandSuggestions(Lnet/minecraft/network/protocol/game/ClientboundCommandSuggestionsPacket;)V", cancellable = true)
    private void handleCommandSuggestions_2129064206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2129064206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateRecipes(Lnet/minecraft/network/protocol/game/ClientboundUpdateRecipesPacket;)V", cancellable = true)
    private void handleUpdateRecipes_1133701310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1133701310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookAdd(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookAddPacket;)V", cancellable = true)
    private void handleRecipeBookAdd__568081438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-568081438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEvent(Lnet/minecraft/network/protocol/game/ClientboundBlockEventPacket;)V", cancellable = true)
    private void handleBlockEvent__125244754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-125244754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateMobEffect(Lnet/minecraft/network/protocol/game/ClientboundUpdateMobEffectPacket;)V", cancellable = true)
    private void handleUpdateMobEffect_1288577830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1288577830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClose(Lnet/minecraft/network/protocol/game/ClientboundContainerClosePacket;)V", cancellable = true)
    private void handleContainerClose__1827525778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827525778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLookAt(Lnet/minecraft/network/protocol/game/ClientboundPlayerLookAtPacket;)V", cancellable = true)
    private void handleLookAt__468379795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-468379795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMountScreenOpen(Lnet/minecraft/network/protocol/game/ClientboundMountScreenOpenPacket;)V", cancellable = true)
    private void handleMountScreenOpen__1959496040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1959496040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenSignEditor(Lnet/minecraft/network/protocol/game/ClientboundOpenSignEditorPacket;)V", cancellable = true)
    private void handleOpenSignEditor__1304138994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1304138994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStopSoundEvent(Lnet/minecraft/network/protocol/game/ClientboundStopSoundPacket;)V", cancellable = true)
    private void handleStopSoundEvent_395773900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(395773900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerContent(Lnet/minecraft/network/protocol/game/ClientboundContainerSetContentPacket;)V", cancellable = true)
    private void handleContainerContent_617019286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(617019286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookRemove(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookRemovePacket;)V", cancellable = true)
    private void handleRecipeBookRemove_69489198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(69489198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetPlayerInventory(Lnet/minecraft/network/protocol/game/ClientboundSetPlayerInventoryPacket;)V", cancellable = true)
    private void handleSetPlayerInventory__1290890962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1290890962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAwardStats(Lnet/minecraft/network/protocol/game/ClientboundAwardStatsPacket;)V", cancellable = true)
    private void handleAwardStats__1746730034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1746730034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookSettings(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookSettingsPacket;)V", cancellable = true)
    private void handleRecipeBookSettings_1678773454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1678773454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEquipment(Lnet/minecraft/network/protocol/game/ClientboundSetEquipmentPacket;)V", cancellable = true)
    private void handleSetEquipment_1802362894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1802362894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTagQueryPacket(Lnet/minecraft/network/protocol/game/ClientboundTagQueryPacket;)V", cancellable = true)
    private void handleTagQueryPacket_1882757622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882757622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSubtitleText(Lnet/minecraft/network/protocol/game/ClientboundSetSubtitleTextPacket;)V", cancellable = true)
    private void setSubtitleText_1407788576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1407788576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleGameRuleValues(Lnet/minecraft/network/protocol/game/ClientboundGameRuleValuesPacket;)V", cancellable = true)
    private void handleGameRuleValues__58009970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-58009970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleServerData(Lnet/minecraft/network/protocol/game/ClientboundServerDataPacket;)V", cancellable = true)
    private void handleServerData__2046289234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2046289234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderCenter(Lnet/minecraft/network/protocol/game/ClientboundSetBorderCenterPacket;)V", cancellable = true)
    private void handleSetBorderCenter_2045685488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2045685488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSoundEvent(Lnet/minecraft/network/protocol/game/ClientboundSoundPacket;)V", cancellable = true)
    private void handleSoundEvent__1598248820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1598248820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBossUpdate(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;)V", cancellable = true)
    private void handleBossUpdate_1418122819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1418122819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInitializeBorder(Lnet/minecraft/network/protocol/game/ClientboundInitializeBorderPacket;)V", cancellable = true)
    private void handleInitializeBorder__1952933362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1952933362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSoundEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundSoundEntityPacket;)V", cancellable = true)
    private void handleSoundEntityEvent__1287709332(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1287709332L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRemoveMobEffect(Lnet/minecraft/network/protocol/game/ClientboundRemoveMobEffectPacket;)V", cancellable = true)
    private void handleRemoveMobEffect__240127076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-240127076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTitleText(Lnet/minecraft/network/protocol/game/ClientboundSetTitleTextPacket;)V", cancellable = true)
    private void setTitleText_939294310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939294310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTitlesClear(Lnet/minecraft/network/protocol/game/ClientboundClearTitlesPacket;)V", cancellable = true)
    private void handleTitlesClear__1772810756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1772810756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleItemCooldown(Lnet/minecraft/network/protocol/game/ClientboundCooldownPacket;)V", cancellable = true)
    private void handleItemCooldown__1588590111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1588590111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveVehicle(Lnet/minecraft/network/protocol/game/ClientboundMoveVehiclePacket;)V", cancellable = true)
    private void handleMoveVehicle__1934328960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934328960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAddObjective(Lnet/minecraft/network/protocol/game/ClientboundSetObjectivePacket;)V", cancellable = true)
    private void handleAddObjective_1769383375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1769383375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTitlesAnimation(Lnet/minecraft/network/protocol/game/ClientboundSetTitlesAnimationPacket;)V", cancellable = true)
    private void setTitlesAnimation__51806810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-51806810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetDisplayObjective(Lnet/minecraft/network/protocol/game/ClientboundSetDisplayObjectivePacket;)V", cancellable = true)
    private void handleSetDisplayObjective__1271334396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1271334396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInfoUpdate(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket;)V", cancellable = true)
    private void handlePlayerInfoUpdate__1989678450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1989678450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResetScore(Lnet/minecraft/network/protocol/game/ClientboundResetScorePacket;)V", cancellable = true)
    private void handleResetScore__1993259922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1993259922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetPlayerTeamPacket(Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;)V", cancellable = true)
    private void handleSetPlayerTeamPacket__415036786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-415036786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCamera(Lnet/minecraft/network/protocol/game/ClientboundSetCameraPacket;)V", cancellable = true)
    private void handleSetCamera_1107220904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1107220904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeDifficulty(Lnet/minecraft/network/protocol/game/ClientboundChangeDifficultyPacket;)V", cancellable = true)
    private void handleChangeDifficulty__1870413778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1870413778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActionBarText(Lnet/minecraft/network/protocol/game/ClientboundSetActionBarTextPacket;)V", cancellable = true)
    private void setActionBarText_1866587718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1866587718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatEnter(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatEnterPacket;)V", cancellable = true)
    private void handlePlayerCombatEnter_1511307184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511307184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleParticleEvent(Lnet/minecraft/network/protocol/game/ClientboundLevelParticlesPacket;)V", cancellable = true)
    private void handleParticleEvent__449533303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-449533303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenBook(Lnet/minecraft/network/protocol/game/ClientboundOpenBookPacket;)V", cancellable = true)
    private void handleOpenBook__856512978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-856512978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTabListCustomisation(Lnet/minecraft/network/protocol/game/ClientboundTabListPacket;)V", cancellable = true)
    private void handleTabListCustomisation_71432172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71432172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetScore(Lnet/minecraft/network/protocol/game/ClientboundSetScorePacket;)V", cancellable = true)
    private void handleSetScore__534239346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-534239346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateAttributes(Lnet/minecraft/network/protocol/game/ClientboundUpdateAttributesPacket;)V", cancellable = true)
    private void handleUpdateAttributes_635356558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(635356558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatKill(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatKillPacket;)V", cancellable = true)
    private void handlePlayerCombatKill_727714606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(727714606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderSize(Lnet/minecraft/network/protocol/game/ClientboundSetBorderSizePacket;)V", cancellable = true)
    private void handleSetBorderSize_1893071576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1893071576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInfoRemove(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoRemovePacket;)V", cancellable = true)
    private void handlePlayerInfoRemove_2022063918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2022063918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatEnd(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatEndPacket;)V", cancellable = true)
    private void handlePlayerCombatEnd__1158067542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1158067542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAbilities(Lnet/minecraft/network/protocol/game/ClientboundPlayerAbilitiesPacket;)V", cancellable = true)
    private void handlePlayerAbilities__1282846360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1282846360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderLerpSize(Lnet/minecraft/network/protocol/game/ClientboundSetBorderLerpSizePacket;)V", cancellable = true)
    private void handleSetBorderLerpSize__1757101270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1757101270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugBlockValue(Lnet/minecraft/network/protocol/game/ClientboundDebugBlockValuePacket;)V", cancellable = true)
    private void handleDebugBlockValue__1122084600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1122084600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchFinished(Lnet/minecraft/network/protocol/game/ClientboundChunkBatchFinishedPacket;)V", cancellable = true)
    private void handleChunkBatchFinished__1317788946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1317788946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleGameTestHighlightPos(Lnet/minecraft/network/protocol/game/ClientboundGameTestHighlightPosPacket;)V", cancellable = true)
    private void handleGameTestHighlightPos__958993138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-958993138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "markMessageAsProcessed(Lnet/minecraft/network/chat/MessageSignature;Z)V", cancellable = true)
    private void markMessageAsProcessed_1551525651(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551525651L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBundlePacket(Lnet/minecraft/network/protocol/game/ClientboundBundlePacket;)V", cancellable = true)
    private void handleBundlePacket_1002043894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1002043894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePongResponse(Lnet/minecraft/network/protocol/ping/ClientboundPongResponsePacket;)V", cancellable = true)
    private void handlePongResponse_1861106542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1861106542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchStart(Lnet/minecraft/network/protocol/game/ClientboundChunkBatchStartPacket;)V", cancellable = true)
    private void handleChunkBatchStart_1271907212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1271907212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugEntityValue(Lnet/minecraft/network/protocol/game/ClientboundDebugEntityValuePacket;)V", cancellable = true)
    private void handleDebugEntityValue_1838977582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1838977582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLightUpdatePacket(Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacket;)V", cancellable = true)
    private void handleLightUpdatePacket_1482366288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482366288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetChunkCacheCenter(Lnet/minecraft/network/protocol/game/ClientboundSetChunkCacheCenterPacket;)V", cancellable = true)
    private void handleSetChunkCacheCenter__1158737570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1158737570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugSample(Lnet/minecraft/network/protocol/game/ClientboundDebugSamplePacket;)V", cancellable = true)
    private void handleDebugSample__781213572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-781213572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugChunkValue(Lnet/minecraft/network/protocol/game/ClientboundDebugChunkValuePacket;)V", cancellable = true)
    private void handleDebugChunkValue__169306936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-169306936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFeatureEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isFeatureEnabled__1593207571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593207571L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleSetChunkCacheRadius(Lnet/minecraft/network/protocol/game/ClientboundSetChunkCacheRadiusPacket;)V", cancellable = true)
    private void handleSetChunkCacheRadius__1487700188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1487700188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLowDiskSpaceWarning(Lnet/minecraft/network/protocol/game/ClientboundLowDiskSpaceWarningPacket;)V", cancellable = true)
    private void handleLowDiskSpaceWarning_530453224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530453224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfoIgnoreCase(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfoIgnoreCase_44191919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44191919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleMerchantOffers(Lnet/minecraft/network/protocol/game/ClientboundMerchantOffersPacket;)V", cancellable = true)
    private void handleMerchantOffers__57828242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57828242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleWaypoint(Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;)V", cancellable = true)
    private void handleWaypoint__282206054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-282206054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugEvent(Lnet/minecraft/network/protocol/game/ClientboundDebugEventPacket;)V", cancellable = true)
    private void handleDebugEvent_622925550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(622925550L))
            info.cancel();
    }


}
