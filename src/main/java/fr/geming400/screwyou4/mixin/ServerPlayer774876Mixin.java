package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.class)
public class ServerPlayer774876Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__2111678562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2111678562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level_1360988848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360988848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__2073356684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073356684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drop(Lnet/minecraft/world/item/ItemStack;ZZ)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void drop_1881829917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881829917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drop(Z)V", cancellable = true)
    private void drop__337884856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-337884856L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_1367442035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1367442035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick__128908782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-128908782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "take(Lnet/minecraft/world/entity/Entity;I)V", cancellable = true)
    private void take_1756713128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1756713128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRespawnConfig()Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;", cancellable = true)
    private void getRespawnConfig__1432316289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432316289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRespawnPosition(Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;Z)V", cancellable = true)
    private void setRespawnPosition_1238491904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1238491904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "broadcastToPlayer(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void broadcastToPlayer__750294208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750294208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "forceSetRotation(FZFZ)V", cancellable = true)
    private void forceSetRotation__1565832254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1565832254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKnownSpeed()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownSpeed__152356901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152356901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnownMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownMovement_2058537465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058537465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReceivingWaypoints()Z", cancellable = true)
    private void isReceivingWaypoints__1417429577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417429577L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleShoulderEntities()V", cancellable = true)
    private void handleShoulderEntities__1436917914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1436917914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo__1747673395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747673395L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startSleeping(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void startSleeping_2112536656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112536656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doCloseContainer()V", cancellable = true)
    private void doCloseContainer__772296901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-772296901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "giveExperienceLevels(I)V", cancellable = true)
    private void giveExperienceLevels__1277205710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1277205710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "closeContainer()V", cancellable = true)
    private void closeContainer_743968198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(743968198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTextEdit(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Z)V", cancellable = true)
    private void openTextEdit__642142544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-642142544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canHarmPlayer(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canHarmPlayer__755660919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755660919L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "openCommandBlock(Lnet/minecraft/world/level/block/entity/CommandBlockEntity;)V", cancellable = true)
    private void openCommandBlock__61544481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-61544481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_190106437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190106437L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "awardRecipesByKey(Ljava/util/List;)V", cancellable = true)
    private void awardRecipesByKey_1840639072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1840639072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetRecipes(Ljava/util/Collection;)I", cancellable = true)
    private void resetRecipes__930975139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930975139L))
            info.setReturnValue(1139178496);
    }

    @Inject(at = @At("HEAD"), method = "openHorseInventory(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/world/Container;)V", cancellable = true)
    private void openHorseInventory__1405190229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1405190229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openNautilusInventory(Lnet/minecraft/world/entity/animal/nautilus/AbstractNautilus;Lnet/minecraft/world/Container;)V", cancellable = true)
    private void openNautilusInventory__172233255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-172233255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSleepInBed(Lnet/minecraft/core/BlockPos;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void startSleepInBed_222143950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222143950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openItemGui(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void openItemGui__203170417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-203170417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendMerchantOffers(ILnet/minecraft/world/item/trading/MerchantOffers;IIZZ)V", cancellable = true)
    private void sendMerchantOffers__341980082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-341980082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void sendSystemMessage__1734567115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1734567115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage_913237107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(913237107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "awardRecipes(Ljava/util/Collection;)I", cancellable = true)
    private void awardRecipes_1595804651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595804651L))
            info.setReturnValue(763697893);
    }

    @Inject(at = @At("HEAD"), method = "triggerRecipeCrafted(Lnet/minecraft/world/item/crafting/RecipeHolder;Ljava/util/List;)V", cancellable = true)
    private void triggerRecipeCrafted_1235509562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1235509562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "giveExperiencePoints(I)V", cancellable = true)
    private void giveExperiencePoints__1320451162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1320451162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEnchantmentPerformed(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onEnchantmentPerformed__1238864053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1238864053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAbilities()V", cancellable = true)
    private void onUpdateAbilities__441200401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-441200401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWardenSpawnTracker()Ljava/util/Optional;", cancellable = true)
    private void getWardenSpawnTracker_1554718338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554718338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indicateDamage(DD)V", cancellable = true)
    private void indicateDamage__1071690873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1071690873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_523305040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(523305040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEnterCombat()V", cancellable = true)
    private void onEnterCombat__928042718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-928042718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLeaveCombat()V", cancellable = true)
    private void onLeaveCombat_2049808355(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2049808355L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onItemPickup(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onItemPickup_1258054585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1258054585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEquippedItemBroken(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void onEquippedItemBroken_1939571820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1939571820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkTrackingView()Lnet/minecraft/server/level/ChunkTrackingView;", cancellable = true)
    private void getChunkTrackingView__256292681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256292681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "awardKillScore(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void awardKillScore_134331544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(134331544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeVehicle()V", cancellable = true)
    private void removeVehicle_551062663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(551062663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_102546787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102546787L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void restoreFrom_424529137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(424529137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onExplosionHit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onExplosionHit_1655434277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1655434277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayInteract(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void mayInteract_53432113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53432113L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendOverlayMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendOverlayMessage__2078930428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2078930428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopSleepInBed(ZZ)V", cancellable = true)
    private void stopSleepInBed_556986056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(556986056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetFallDistance()V", cancellable = true)
    private void resetFallDistance__405167760(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-405167760L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "adjustSpawnLocation(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void adjustSpawnLocation_866859969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866859969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onInsideBlock(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void onInsideBlock__894063124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-894063124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode__784918409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784918409L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void teleport_1618097908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618097908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport__987345411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987345411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__814512977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814512977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "snapTo(DDD)V", cancellable = true)
    private void snapTo_860893416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(860893416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lookAt(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lookAt__1666237770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1666237770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lookAt(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)V", cancellable = true)
    private void lookAt_623781050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(623781050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleportRelative(DDD)V", cancellable = true)
    private void teleportRelative__1920161254(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1920161254L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void setGameMode_1128316579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128316579L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "awardStat(Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void awardStat__1893772030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1893772030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick_1481134074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1481134074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleExtraItemsCreatedOnUse(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleExtraItemsCreatedOnUse_1308290972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1308290972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findRespawnPositionAndUseSpawnBlock(ZLnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void findRespawnPositionAndUseSpawnBlock_581459951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581459951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackEnteredOrExitedLavaOnVehicle()V", cancellable = true)
    private void trackEnteredOrExitedLavaOnVehicle__1632287410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1632287410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAndUpdateEnderPearlTicket(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)J", cancellable = true)
    private void registerAndUpdateEnderPearlTicket__832931545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832931545L))
            info.setReturnValue(-8400280834114474346L);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnExtraParticlesOnFall(Z)V", cancellable = true)
    private void setSpawnExtraParticlesOnFall_1608631369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1608631369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showEndCredits()V", cancellable = true)
    private void showEndCredits_2066498803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2066498803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/stats/ServerRecipeBook;", cancellable = true)
    private void getRecipeBook_1389552121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389552121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCommandSourceStack()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void createCommandSourceStack_430841165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430841165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasDisconnected()Z", cancellable = true)
    private void hasDisconnected_97508286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97508286L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "teleportTo(Lnet/minecraft/server/level/ServerLevel;DDDLjava/util/Set;FFZ)Z", cancellable = true)
    private void teleportTo_2066073489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066073489L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "teleportTo(DDD)V", cancellable = true)
    private void teleportTo__724421879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-724421879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCamera()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getCamera__1911606297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911606297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCamera(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setCamera__559303537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-559303537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die_2124883944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2124883944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openDialog(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void openDialog_1344770448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1344770448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openMenu(Lnet/minecraft/world/MenuProvider;)Ljava/util/OptionalInt;", cancellable = true)
    private void openMenu__1144154122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1144154122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void crit_516252994(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516252994L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetStat(Lnet/minecraft/stats/Stat;)V", cancellable = true)
    private void resetStat_1411866403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1411866403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "magicCrit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void magicCrit__1762667633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762667633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void swing__1600239852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1600239852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRaidOmenPosition(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setRaidOmenPosition_448536287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(448536287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearRaidOmenPosition()V", cancellable = true)
    private void clearRaidOmenPosition__1174159480(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1174159480L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaidOmenPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRaidOmenPosition_1078512877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078512877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextFilter()Lnet/minecraft/server/network/TextFilter;", cancellable = true)
    private void getTextFilter_10888199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10888199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestedViewDistance()I", cancellable = true)
    private void requestedViewDistance__673896070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673896070L))
            info.setReturnValue(1861554791);
    }

    @Inject(at = @At("HEAD"), method = "allowsListing()Z", cancellable = true)
    private void allowsListing_343677945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343677945L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isChangingDimension()Z", cancellable = true)
    private void isChangingDimension_452204164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452204164L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getShoulderEntityLeft()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getShoulderEntityLeft__1950355116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950355116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void clientInformation_969474797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969474797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadAndSpawnParentVehicle(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadAndSpawnParentVehicle__1582228579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1582228579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadAndSpawnEnderPearls(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadAndSpawnEnderPearls__503999350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-503999350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeEnderPearlTicket(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/ChunkPos;)J", cancellable = true)
    private static void placeEnderPearlTicket_256938663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256938663L))
            info.setReturnValue(5466934964811474001L);
    }

    @Inject(at = @At("HEAD"), method = "setExperiencePoints(I)V", cancellable = true)
    private void setExperiencePoints__1182035401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1182035401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExperienceLevels(I)V", cancellable = true)
    private void setExperienceLevels__1138789949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1138789949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initInventoryMenu()V", cancellable = true)
    private void initInventoryMenu_1092686532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092686532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackStartFallingPosition()V", cancellable = true)
    private void trackStartFallingPosition_1336207158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1336207158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEntityOnShoulder(Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private void setEntityOnShoulder_1299376386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1299376386L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateOptions(Lnet/minecraft/server/level/ClientInformation;)V", cancellable = true)
    private void updateOptions_1198554635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1198554635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShoulderEntityRight()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getShoulderEntityRight_863258033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863258033L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "commandSource()Lnet/minecraft/commands/CommandSource;", cancellable = true)
    private void commandSource__123292355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123292355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setServerLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void setServerLevel_1229524353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1229524353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCommonSpawnInfo(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void createCommonSpawnInfo__100736211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100736211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetSentInfo()V", cancellable = true)
    private void resetSentInfo_1131280346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1131280346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendBuildLimitMessage(ZI)V", cancellable = true)
    private void sendBuildLimitMessage__878627764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-878627764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSpawnProtectionMessage(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void sendSpawnProtectionMessage_590341886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(590341886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canChatInColor()Z", cancellable = true)
    private void canChatInColor__866048643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866048643L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendServerStatus(Lnet/minecraft/network/protocol/status/ServerStatus;)V", cancellable = true)
    private void sendServerStatus__149714415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-149714415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabListDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabListDisplayName__319513601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-319513601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastActionTime()J", cancellable = true)
    private void getLastActionTime_1806832532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806832532L))
            info.setReturnValue(9085794509572167844L);
    }

    @Inject(at = @At("HEAD"), method = "getTabListOrder()I", cancellable = true)
    private void getTabListOrder_759106481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759106481L))
            info.setReturnValue(-1351966393);
    }

    @Inject(at = @At("HEAD"), method = "copyRespawnPosition(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void copyRespawnPosition__1395955941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1395955941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIpAddress()Ljava/lang/String;", cancellable = true)
    private void getIpAddress_1735861564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735861564L))
            info.setReturnValue("\u4255j%i/Q\u823C*F%Yb[ZRC }*u2Juc)Q\uC66F!r\u610Dy9q\u00F4;Om *\u6BE3Te0gwo>gAaIlh-i}K2*Nq{2(/^.0CPbVXG\u5DBAd)4&");
    }

    @Inject(at = @At("HEAD"), method = "getChatVisibility()Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private void getChatVisibility__226648720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226648720L))
            info.setReturnValue(net.minecraft.world.entity.player.ChatVisiblity.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "resetLastActionTime()V", cancellable = true)
    private void resetLastActionTime_943330823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(943330823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendChatMessage(Lnet/minecraft/network/chat/OutgoingChatMessage;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendChatMessage__876435819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-876435819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasChangedDimension()V", cancellable = true)
    private void hasChangedDimension__181829309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-181829309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void getLastSectionPos_1734925754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734925754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkMovementStatistics(DDD)V", cancellable = true)
    private void checkMovementStatistics__1501435299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1501435299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/server/PlayerAdvancements;", cancellable = true)
    private void getAdvancements_698346859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698346859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChunkTrackingView(Lnet/minecraft/server/level/ChunkTrackingView;)V", cancellable = true)
    private void setChunkTrackingView_737918449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737918449L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChatSession(Lnet/minecraft/network/chat/RemoteChatSession;)V", cancellable = true)
    private void setChatSession__1298852180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298852180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLastSectionPos(Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void setLastSectionPos_1400616354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1400616354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deregisterEnderPearl(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)V", cancellable = true)
    private void deregisterEnderPearl_826640568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(826640568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestDebugSubscriptions(Ljava/util/Set;)V", cancellable = true)
    private void requestDebugSubscriptions_1645526742(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1645526742L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnderPearls()Ljava/util/Set;", cancellable = true)
    private void getEnderPearls__135793153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135793153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldFilterMessageTo(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void shouldFilterMessageTo__675593542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675593542L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLastClientInput()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void getLastClientInput__96362602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96362602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerEnderPearl(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)V", cancellable = true)
    private void registerEnderPearl_2054630489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2054630489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setKnownMovement(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setKnownMovement_704870251(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(704870251L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "debugSubscriptions()Ljava/util/Set;", cancellable = true)
    private void debugSubscriptions_1031829691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031829691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatSession()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void getChatSession__1694336900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694336900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastClientMoveIntent()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLastClientMoveIntent_925365041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925365041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastClientInput(Lnet/minecraft/world/entity/player/Input;)V", cancellable = true)
    private void setLastClientInput__763350890(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-763350890L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doTick()V", cancellable = true)
    private void doTick__2064580153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2064580153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Lnet/minecraft/stats/ServerStatsCounter;", cancellable = true)
    private void getStats__746055153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746055153L))
            info.setReturnValue(null);
    }


}
