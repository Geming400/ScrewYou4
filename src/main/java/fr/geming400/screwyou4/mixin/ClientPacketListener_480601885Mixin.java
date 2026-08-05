package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientPacketListener.class)
public class ClientPacketListener_480601885Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_518876623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518876623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__1348433602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348433602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_518876623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518876623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/client/multiplayer/ClientLevel;", cancellable = true)
    private void getLevel_1591921174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591921174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnection()Lnet/minecraft/network/Connection;", cancellable = true)
    private void getConnection__286040937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286040937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfo(Ljava/util/UUID;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfo__377852416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377852416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfo(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfo__1045956810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045956810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayers()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayers__1333046388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333046388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOnlinePlayerIds()Ljava/util/Collection;", cancellable = true)
    private void getOnlinePlayerIds__1333046388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333046388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugQueryHandler()Lnet/minecraft/client/DebugQueryHandler;", cancellable = true)
    private void getDebugQueryHandler__943765979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943765979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuggestionsProvider()Lnet/minecraft/client/multiplayer/ClientSuggestionProvider;", cancellable = true)
    private void getSuggestionsProvider_1501796859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501796859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleDebugEvent(Lnet/minecraft/network/protocol/game/ClientboundDebugEventPacket;)V", cancellable = true)
    private void handleDebugEvent__1432672801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1432672801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLowDiskSpaceWarning(Lnet/minecraft/network/protocol/game/ClientboundLowDiskSpaceWarningPacket;)V", cancellable = true)
    private void handleLowDiskSpaceWarning_216135399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(216135399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugBlockValue(Lnet/minecraft/network/protocol/game/ClientboundDebugBlockValuePacket;)V", cancellable = true)
    private void handleDebugBlockValue__308141897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-308141897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFeatureEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isFeatureEnabled__949167496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949167496L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleDebugChunkValue(Lnet/minecraft/network/protocol/game/ClientboundDebugChunkValuePacket;)V", cancellable = true)
    private void handleDebugChunkValue__1611219305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1611219305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePongResponse(Lnet/minecraft/network/protocol/ping/ClientboundPongResponsePacket;)V", cancellable = true)
    private void handlePongResponse__1023175219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1023175219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleWaypoint(Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;)V", cancellable = true)
    private void handleWaypoint__682204541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-682204541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerInfoIgnoreCase(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/PlayerInfo;", cancellable = true)
    private void getPlayerInfoIgnoreCase__1045956810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045956810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markMessageAsProcessed(Lnet/minecraft/network/chat/MessageSignature;Z)V", cancellable = true)
    private void markMessageAsProcessed_1847901365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847901365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleGameTestHighlightPos(Lnet/minecraft/network/protocol/game/ClientboundGameTestHighlightPosPacket;)V", cancellable = true)
    private void handleGameTestHighlightPos__128177150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-128177150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugEntityValue(Lnet/minecraft/network/protocol/game/ClientboundDebugEntityValuePacket;)V", cancellable = true)
    private void handleDebugEntityValue__1244794517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1244794517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void scoreboard__500643569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500643569L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "fuelValues()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void fuelValues__832264294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832264294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clockManager()Lnet/minecraft/client/ClientClockManager;", cancellable = true)
    private void clockManager_886611398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886611398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "potionBrewing()Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private void potionBrewing__126359498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126359498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleDamageEvent(Lnet/minecraft/network/protocol/game/ClientboundDamageEventPacket;)V", cancellable = true)
    private void handleDamageEvent__1263796893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1263796893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundEntityEventPacket;)V", cancellable = true)
    private void handleEntityEvent__362549801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-362549801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWaypointManager()Lnet/minecraft/client/waypoints/ClientWaypointManager;", cancellable = true)
    private void getWaypointManager_1496324854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496324854L))
            info.setReturnValue(new net.minecraft.client.waypoints.ClientWaypointManager());
    }

    @Inject(at = @At("HEAD"), method = "enabledFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void enabledFeatures_1145422382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145422382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void registryAccess_231851619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231851619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recipes()Lnet/minecraft/world/item/crafting/RecipeAccess;", cancellable = true)
    private void recipes_162385462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162385462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendUnattendedCommand(Ljava/lang/String;Lnet/minecraft/client/gui/screens/Screen;)V", cancellable = true)
    private void sendUnattendedCommand_946596068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(946596068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendChat(Ljava/lang/String;)V", cancellable = true)
    private void sendChat_1632963033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632963033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateAdvancementsPacket(Lnet/minecraft/network/protocol/game/ClientboundUpdateAdvancementsPacket;)V", cancellable = true)
    private void handleUpdateAdvancementsPacket_499232714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(499232714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSelectAdvancementsTab(Lnet/minecraft/network/protocol/game/ClientboundSelectAdvancementsTabPacket;)V", cancellable = true)
    private void handleSelectAdvancementsTab_1827286920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1827286920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityPassengersPacket(Lnet/minecraft/network/protocol/game/ClientboundSetPassengersPacket;)V", cancellable = true)
    private void handleSetEntityPassengersPacket__1835957837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1835957837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTestInstanceBlockStatus(Lnet/minecraft/network/protocol/game/ClientboundTestInstanceBlockStatus;)V", cancellable = true)
    private void handleTestInstanceBlockStatus_1571429694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1571429694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerCompiledSectionCallback()Ljava/lang/Runnable;", cancellable = true)
    private void getPlayerCompiledSectionCallback_1813117913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813117913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decoratedHashOpsGenenerator()Lnet/minecraft/network/HashedPatchMap$HashGenerator;", cancellable = true)
    private void decoratedHashOpsGenenerator_2023996883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023996883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleSetSimulationDistance(Lnet/minecraft/network/protocol/game/ClientboundSetSimulationDistancePacket;)V", cancellable = true)
    private void handleSetSimulationDistance_1498922960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1498922960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderWarningDelay(Lnet/minecraft/network/protocol/game/ClientboundSetBorderWarningDelayPacket;)V", cancellable = true)
    private void handleSetBorderWarningDelay__980148999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-980148999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleProjectilePowerPacket(Lnet/minecraft/network/protocol/game/ClientboundProjectilePowerPacket;)V", cancellable = true)
    private void handleProjectilePowerPacket_705443474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(705443474L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomChatCompletions(Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket;)V", cancellable = true)
    private void handleCustomChatCompletions_1769799424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1769799424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderWarningDistance(Lnet/minecraft/network/protocol/game/ClientboundSetBorderWarningDistancePacket;)V", cancellable = true)
    private void handleSetBorderWarningDistance_2015838403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2015838403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasClientLoaded()Z", cancellable = true)
    private void hasClientLoaded_518880467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518880467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/client/multiplayer/ClientAdvancements;", cancellable = true)
    private void getAdvancements__1696189955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696189955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearLevel()V", cancellable = true)
    private void clearLevel_518876623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518876623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookSettings(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookSettingsPacket;)V", cancellable = true)
    private void handleRecipeBookSettings__611964628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-611964628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTagQueryPacket(Lnet/minecraft/network/protocol/game/ClientboundTagQueryPacket;)V", cancellable = true)
    private void handleTagQueryPacket_143893816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(143893816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCamera(Lnet/minecraft/network/protocol/game/ClientboundSetCameraPacket;)V", cancellable = true)
    private void handleSetCamera__1911363801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1911363801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatEnd(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatEndPacket;)V", cancellable = true)
    private void handlePlayerCombatEnd_1121394056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1121394056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderLerpSize(Lnet/minecraft/network/protocol/game/ClientboundSetBorderLerpSizePacket;)V", cancellable = true)
    private void handleSetBorderLerpSize_1297767560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1297767560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatEnter(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatEnterPacket;)V", cancellable = true)
    private void handlePlayerCombatEnter_1912860971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1912860971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookRemove(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookRemovePacket;)V", cancellable = true)
    private void handleRecipeBookRemove__380981397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-380981397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerCombatKill(Lnet/minecraft/network/protocol/game/ClientboundPlayerCombatKillPacket;)V", cancellable = true)
    private void handlePlayerCombatKill_67418931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(67418931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLookAt(Lnet/minecraft/network/protocol/game/ClientboundPlayerLookAtPacket;)V", cancellable = true)
    private void handleLookAt_152977907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(152977907L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInitializeBorder(Lnet/minecraft/network/protocol/game/ClientboundInitializeBorderPacket;)V", cancellable = true)
    private void handleInitializeBorder__13488662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-13488662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setActionBarText(Lnet/minecraft/network/protocol/game/ClientboundSetActionBarTextPacket;)V", cancellable = true)
    private void setActionBarText_786252478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(786252478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAwardStats(Lnet/minecraft/network/protocol/game/ClientboundAwardStatsPacket;)V", cancellable = true)
    private void handleAwardStats_1795186372(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1795186372L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateMobEffect(Lnet/minecraft/network/protocol/game/ClientboundUpdateMobEffectPacket;)V", cancellable = true)
    private void handleUpdateMobEffect_102891974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(102891974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTitleText(Lnet/minecraft/network/protocol/game/ClientboundSetTitleTextPacket;)V", cancellable = true)
    private void setTitleText_757532675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(757532675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSubtitleText(Lnet/minecraft/network/protocol/game/ClientboundSetSubtitleTextPacket;)V", cancellable = true)
    private void setSubtitleText_1476770663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476770663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChangeDifficulty(Lnet/minecraft/network/protocol/game/ClientboundChangeDifficultyPacket;)V", cancellable = true)
    private void handleChangeDifficulty__691302693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-691302693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCommandSuggestions(Lnet/minecraft/network/protocol/game/ClientboundCommandSuggestionsPacket;)V", cancellable = true)
    private void handleCommandSuggestions_854104866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(854104866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleStopSoundEvent(Lnet/minecraft/network/protocol/game/ClientboundStopSoundPacket;)V", cancellable = true)
    private void handleStopSoundEvent__894214303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-894214303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateRecipes(Lnet/minecraft/network/protocol/game/ClientboundUpdateRecipesPacket;)V", cancellable = true)
    private void handleUpdateRecipes_1572398226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1572398226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTitlesAnimation(Lnet/minecraft/network/protocol/game/ClientboundSetTitlesAnimationPacket;)V", cancellable = true)
    private void setTitlesAnimation__2123757057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2123757057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTabListCustomisation(Lnet/minecraft/network/protocol/game/ClientboundTabListPacket;)V", cancellable = true)
    private void handleTabListCustomisation__1123428101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1123428101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLevelEvent(Lnet/minecraft/network/protocol/game/ClientboundLevelEventPacket;)V", cancellable = true)
    private void handleLevelEvent_1793435920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1793435920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTitlesClear(Lnet/minecraft/network/protocol/game/ClientboundClearTitlesPacket;)V", cancellable = true)
    private void handleTitlesClear_1513560038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513560038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleServerData(Lnet/minecraft/network/protocol/game/ClientboundServerDataPacket;)V", cancellable = true)
    private void handleServerData__55917415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-55917415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderSize(Lnet/minecraft/network/protocol/game/ClientboundSetBorderSizePacket;)V", cancellable = true)
    private void handleSetBorderSize_1272096255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1272096255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRecipeBookAdd(Lnet/minecraft/network/protocol/game/ClientboundRecipeBookAddPacket;)V", cancellable = true)
    private void handleRecipeBookAdd__1011137564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011137564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMapItemData(Lnet/minecraft/network/protocol/game/ClientboundMapItemDataPacket;)V", cancellable = true)
    private void handleMapItemData_152045109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(152045109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetBorderCenter(Lnet/minecraft/network/protocol/game/ClientboundSetBorderCenterPacket;)V", cancellable = true)
    private void handleSetBorderCenter__2127357013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2127357013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCommands(Lnet/minecraft/network/protocol/game/ClientboundCommandsPacket;)V", cancellable = true)
    private void handleCommands_1652591550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1652591550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBossUpdate(Lnet/minecraft/network/protocol/game/ClientboundBossEventPacket;)V", cancellable = true)
    private void handleBossUpdate__450306463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450306463L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleResetScore(Lnet/minecraft/network/protocol/game/ClientboundResetScorePacket;)V", cancellable = true)
    private void handleResetScore__1765163549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1765163549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInfoUpdate(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket;)V", cancellable = true)
    private void handlePlayerInfoUpdate_1798723438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1798723438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleGameRuleValues(Lnet/minecraft/network/protocol/game/ClientboundGameRuleValuesPacket;)V", cancellable = true)
    private void handleGameRuleValues_1134127990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1134127990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetDisplayObjective(Lnet/minecraft/network/protocol/game/ClientboundSetDisplayObjectivePacket;)V", cancellable = true)
    private void handleSetDisplayObjective__1181860363(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1181860363L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetPlayerTeamPacket(Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;)V", cancellable = true)
    private void handleSetPlayerTeamPacket__2112394546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2112394546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerInfoRemove(Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoRemovePacket;)V", cancellable = true)
    private void handlePlayerInfoRemove_668075219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(668075219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveVehicle(Lnet/minecraft/network/protocol/game/ClientboundMoveVehiclePacket;)V", cancellable = true)
    private void handleMoveVehicle__1609980493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1609980493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetChunkCacheRadius(Lnet/minecraft/network/protocol/game/ClientboundSetChunkCacheRadiusPacket;)V", cancellable = true)
    private void handleSetChunkCacheRadius__2045467515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2045467515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateAttributes(Lnet/minecraft/network/protocol/game/ClientboundUpdateAttributesPacket;)V", cancellable = true)
    private void handleUpdateAttributes__1138673594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1138673594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetChunkCacheCenter(Lnet/minecraft/network/protocol/game/ClientboundSetChunkCacheCenterPacket;)V", cancellable = true)
    private void handleSetChunkCacheCenter__1717576478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1717576478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRemoveMobEffect(Lnet/minecraft/network/protocol/game/ClientboundRemoveMobEffectPacket;)V", cancellable = true)
    private void handleRemoveMobEffect_1246926337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246926337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBundlePacket(Lnet/minecraft/network/protocol/game/ClientboundBundlePacket;)V", cancellable = true)
    private void handleBundlePacket_1220016260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1220016260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchStart(Lnet/minecraft/network/protocol/game/ClientboundChunkBatchStartPacket;)V", cancellable = true)
    private void handleChunkBatchStart_1468030457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468030457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleItemCooldown(Lnet/minecraft/network/protocol/game/ClientboundCooldownPacket;)V", cancellable = true)
    private void handleItemCooldown__1628196101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628196101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBatchFinished(Lnet/minecraft/network/protocol/game/ClientboundChunkBatchFinishedPacket;)V", cancellable = true)
    private void handleChunkBatchFinished__1963765113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1963765113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMerchantOffers(Lnet/minecraft/network/protocol/game/ClientboundMerchantOffersPacket;)V", cancellable = true)
    private void handleMerchantOffers__437658777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-437658777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleParticleEvent(Lnet/minecraft/network/protocol/game/ClientboundLevelParticlesPacket;)V", cancellable = true)
    private void handleParticleEvent__1115756771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1115756771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDebugSample(Lnet/minecraft/network/protocol/game/ClientboundDebugSamplePacket;)V", cancellable = true)
    private void handleDebugSample_1070602417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1070602417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAddObjective(Lnet/minecraft/network/protocol/game/ClientboundSetObjectivePacket;)V", cancellable = true)
    private void handleAddObjective__733005329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-733005329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSoundEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundSoundEntityPacket;)V", cancellable = true)
    private void handleSoundEntityEvent_1145756060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1145756060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetScore(Lnet/minecraft/network/protocol/game/ClientboundSetScorePacket;)V", cancellable = true)
    private void handleSetScore_273697270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(273697270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerAbilities(Lnet/minecraft/network/protocol/game/ClientboundPlayerAbilitiesPacket;)V", cancellable = true)
    private void handlePlayerAbilities__153854745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-153854745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSoundEvent(Lnet/minecraft/network/protocol/game/ClientboundSoundPacket;)V", cancellable = true)
    private void handleSoundEvent_1470951743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1470951743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLightUpdatePacket(Lnet/minecraft/network/protocol/game/ClientboundLightUpdatePacket;)V", cancellable = true)
    private void handleLightUpdatePacket__1634804785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1634804785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenBook(Lnet/minecraft/network/protocol/game/ClientboundOpenBookPacket;)V", cancellable = true)
    private void handleOpenBook_699529491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(699529491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerForCleaning(Lnet/minecraft/client/multiplayer/CacheSlot;)V", cancellable = true)
    private void registerForCleaning_1100952323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100952323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCustomPayload(Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;)V", cancellable = true)
    private void handleCustomPayload_359020261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(359020261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDebugValueAccess()Lnet/minecraft/util/debug/DebugValueAccess;", cancellable = true)
    private void createDebugValueAccess_977083913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977083913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleUpdateTags(Lnet/minecraft/network/protocol/common/ClientboundUpdateTagsPacket;)V", cancellable = true)
    private void handleUpdateTags_228543275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(228543275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockChangedAck(Lnet/minecraft/network/protocol/game/ClientboundBlockChangedAckPacket;)V", cancellable = true)
    private void handleBlockChangedAck_1377716684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1377716684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLogin(Lnet/minecraft/network/protocol/game/ClientboundLoginPacket;)V", cancellable = true)
    private void handleLogin_1995452069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1995452069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRotateMob(Lnet/minecraft/network/protocol/game/ClientboundRotateHeadPacket;)V", cancellable = true)
    private void handleRotateMob_260925323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260925323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleConfigurationStart(Lnet/minecraft/network/protocol/game/ClientboundStartConfigurationPacket;)V", cancellable = true)
    private void handleConfigurationStart_1462801426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1462801426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTickingState(Lnet/minecraft/network/protocol/game/ClientboundTickingStatePacket;)V", cancellable = true)
    private void handleTickingState_106208090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(106208090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTakeItemEntity(Lnet/minecraft/network/protocol/game/ClientboundTakeItemEntityPacket;)V", cancellable = true)
    private void handleTakeItemEntity_184268137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(184268137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockUpdate(Lnet/minecraft/network/protocol/game/ClientboundBlockUpdatePacket;)V", cancellable = true)
    private void handleBlockUpdate__759543496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-759543496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlayerChat(Lnet/minecraft/network/protocol/game/ClientboundPlayerChatPacket;)V", cancellable = true)
    private void handlePlayerChat__2091070259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2091070259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTeleportEntity(Lnet/minecraft/network/protocol/game/ClientboundTeleportEntityPacket;)V", cancellable = true)
    private void handleTeleportEntity_2080106136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2080106136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMoveEntity(Lnet/minecraft/network/protocol/game/ClientboundMoveEntityPacket;)V", cancellable = true)
    private void handleMoveEntity__342398798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342398798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleForgetLevelChunk(Lnet/minecraft/network/protocol/game/ClientboundForgetLevelChunkPacket;)V", cancellable = true)
    private void handleForgetLevelChunk__1170087312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1170087312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisguisedChat(Lnet/minecraft/network/protocol/game/ClientboundDisguisedChatPacket;)V", cancellable = true)
    private void handleDisguisedChat_109035857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(109035857L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAddEntity(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void handleAddEntity__708186806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-708186806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetHeldSlot(Lnet/minecraft/network/protocol/game/ClientboundSetHeldSlotPacket;)V", cancellable = true)
    private void handleSetHeldSlot__680639943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-680639943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMinecartAlongTrack(Lnet/minecraft/network/protocol/game/ClientboundMoveMinecartPacket;)V", cancellable = true)
    private void handleMinecartAlongTrack_31859170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(31859170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRemoveEntities(Lnet/minecraft/network/protocol/game/ClientboundRemoveEntitiesPacket;)V", cancellable = true)
    private void handleRemoveEntities__1150664511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1150664511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSystemChat(Lnet/minecraft/network/protocol/game/ClientboundSystemChatPacket;)V", cancellable = true)
    private void handleSystemChat__1549291585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1549291585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDeleteChat(Lnet/minecraft/network/protocol/game/ClientboundDeleteChatPacket;)V", cancellable = true)
    private void handleDeleteChat_1463596227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1463596227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleLevelChunkWithLight(Lnet/minecraft/network/protocol/game/ClientboundLevelChunkWithLightPacket;)V", cancellable = true)
    private void handleLevelChunkWithLight_384391079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(384391079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityPositionSync(Lnet/minecraft/network/protocol/game/ClientboundEntityPositionSyncPacket;)V", cancellable = true)
    private void handleEntityPositionSync__107819265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-107819265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleTickingStep(Lnet/minecraft/network/protocol/game/ClientboundTickingStepPacket;)V", cancellable = true)
    private void handleTickingStep_1144932477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1144932477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityData(Lnet/minecraft/network/protocol/game/ClientboundSetEntityDataPacket;)V", cancellable = true)
    private void handleSetEntityData__663179745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-663179745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V", cancellable = true)
    private void handleMovePlayer__1075151652(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1075151652L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRotatePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerRotationPacket;)V", cancellable = true)
    private void handleRotatePlayer__1621479577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1621479577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunkBlocksUpdate(Lnet/minecraft/network/protocol/game/ClientboundSectionBlocksUpdatePacket;)V", cancellable = true)
    private void handleChunkBlocksUpdate__1398774598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398774598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEntityMotion(Lnet/minecraft/network/protocol/game/ClientboundSetEntityMotionPacket;)V", cancellable = true)
    private void handleSetEntityMotion_1960838867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960838867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleChunksBiomes(Lnet/minecraft/network/protocol/game/ClientboundChunksBiomesPacket;)V", cancellable = true)
    private void handleChunksBiomes__1619350387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619350387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleRespawn(Lnet/minecraft/network/protocol/game/ClientboundRespawnPacket;)V", cancellable = true)
    private void handleRespawn__1861474682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861474682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleExplosion(Lnet/minecraft/network/protocol/game/ClientboundExplodePacket;)V", cancellable = true)
    private void handleExplosion__414933715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-414933715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetHealth(Lnet/minecraft/network/protocol/game/ClientboundSetHealthPacket;)V", cancellable = true)
    private void handleSetHealth__1319841904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1319841904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleMountScreenOpen(Lnet/minecraft/network/protocol/game/ClientboundMountScreenOpenPacket;)V", cancellable = true)
    private void handleMountScreenOpen_572149631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(572149631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenScreen(Lnet/minecraft/network/protocol/game/ClientboundOpenScreenPacket;)V", cancellable = true)
    private void handleOpenScreen_1539556144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539556144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetPlayerInventory(Lnet/minecraft/network/protocol/game/ClientboundSetPlayerInventoryPacket;)V", cancellable = true)
    private void handleSetPlayerInventory__1655552019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655552019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleOpenSignEditor(Lnet/minecraft/network/protocol/game/ClientboundOpenSignEditorPacket;)V", cancellable = true)
    private void handleOpenSignEditor_1268013650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268013650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetCursorItem(Lnet/minecraft/network/protocol/game/ClientboundSetCursorItemPacket;)V", cancellable = true)
    private void handleSetCursorItem_1344844611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1344844611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSetData(Lnet/minecraft/network/protocol/game/ClientboundContainerSetDataPacket;)V", cancellable = true)
    private void handleContainerSetData_1991960315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1991960315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEvent(Lnet/minecraft/network/protocol/game/ClientboundBlockEventPacket;)V", cancellable = true)
    private void handleBlockEvent__924671975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-924671975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerClose(Lnet/minecraft/network/protocol/game/ClientboundContainerClosePacket;)V", cancellable = true)
    private void handleContainerClose_1533511663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1533511663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockEntityData(Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;)V", cancellable = true)
    private void handleBlockEntityData__2013556268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013556268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleHurtAnimation(Lnet/minecraft/network/protocol/game/ClientboundHurtAnimationPacket;)V", cancellable = true)
    private void handleHurtAnimation__1437572519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1437572519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleAnimate(Lnet/minecraft/network/protocol/game/ClientboundAnimatePacket;)V", cancellable = true)
    private void handleAnimate_1799889709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1799889709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerSetSlot(Lnet/minecraft/network/protocol/game/ClientboundContainerSetSlotPacket;)V", cancellable = true)
    private void handleContainerSetSlot_1488842791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1488842791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleBlockDestruction(Lnet/minecraft/network/protocol/game/ClientboundBlockDestructionPacket;)V", cancellable = true)
    private void handleBlockDestruction__897675199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-897675199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetExperience(Lnet/minecraft/network/protocol/game/ClientboundSetExperiencePacket;)V", cancellable = true)
    private void handleSetExperience_923237058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(923237058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetEquipment(Lnet/minecraft/network/protocol/game/ClientboundSetEquipmentPacket;)V", cancellable = true)
    private void handleSetEquipment_19297914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(19297914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityLinkPacket(Lnet/minecraft/network/protocol/game/ClientboundSetEntityLinkPacket;)V", cancellable = true)
    private void handleEntityLinkPacket_1814076367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1814076367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerContent(Lnet/minecraft/network/protocol/game/ClientboundContainerSetContentPacket;)V", cancellable = true)
    private void handleContainerContent__105195882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-105195882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetSpawn(Lnet/minecraft/network/protocol/game/ClientboundSetDefaultSpawnPositionPacket;)V", cancellable = true)
    private void handleSetSpawn__1919302903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919302903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSetTime(Lnet/minecraft/network/protocol/game/ClientboundSetTimePacket;)V", cancellable = true)
    private void handleSetTime__608075009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-608075009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommands()Lcom/mojang/brigadier/CommandDispatcher;", cancellable = true)
    private void getCommands__724447471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724447471L))
            info.setReturnValue(new com.mojang.brigadier.CommandDispatcher());
    }

    @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/network/protocol/game/ClientboundGameEventPacket;)V", cancellable = true)
    private void handleGameEvent_659244262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(659244262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getServerData()Lnet/minecraft/client/multiplayer/ServerData;", cancellable = true)
    private void getServerData__1157325042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157325042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "searchTrees()Lnet/minecraft/client/multiplayer/SessionSearchTrees;", cancellable = true)
    private void searchTrees_1552467716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552467716L))
            info.setReturnValue(new net.minecraft.client.multiplayer.SessionSearchTrees());
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(Lnet/minecraft/network/protocol/game/ClientboundPlaceGhostRecipePacket;)V", cancellable = true)
    private void handlePlaceRecipe_956977168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(956977168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLocalGameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getLocalGameProfile_997770164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997770164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareKeyPair()V", cancellable = true)
    private void prepareKeyPair_518876623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518876623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSearchTrees()V", cancellable = true)
    private void updateSearchTrees_518876623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(518876623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "broadcastClientInformation(Lnet/minecraft/server/level/ClientInformation;)V", cancellable = true)
    private void broadcastClientInformation_720239104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(720239104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAcceptingMessages()Z", cancellable = true)
    private void isAcceptingMessages_518880467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518880467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendCommand(Ljava/lang/String;)V", cancellable = true)
    private void sendCommand_1632963033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1632963033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSeenPlayers()Ljava/util/Map;", cancellable = true)
    private void getSeenPlayers__1524021756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524021756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListedOnlinePlayers()Ljava/util/Collection;", cancellable = true)
    private void getListedOnlinePlayers__1333046388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333046388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlineMode()Z", cancellable = true)
    private void onlineMode_518880467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518880467L))
            info.setReturnValue(true);
    }


}
