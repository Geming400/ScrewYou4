package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerPlayer.class)
public class ServerPlayer774876Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__1071784678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071784678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level_1719603064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719603064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level_668312876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668312876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drop(Z)V", cancellable = true)
    private void drop_1230391705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230391705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drop(Lnet/minecraft/world/item/ItemStack;ZZ)Lnet/minecraft/world/entity/item/ItemEntity;", cancellable = true)
    private void drop__804738962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804738962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnect()V", cancellable = true)
    private void disconnect_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "take(Lnet/minecraft/world/entity/Entity;I)V", cancellable = true)
    private void take__1090387633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1090387633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lookAt(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;)V", cancellable = true)
    private void lookAt__210382200(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-210382200L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lookAt(Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void lookAt_183858180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183858180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport__432976558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432976558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/server/level/ServerPlayer;", cancellable = true)
    private void teleport__143416695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143416695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snapTo(DDD)V", cancellable = true)
    private void snapTo__1069631997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069631997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__448655455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-448655455L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "gameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void gameMode__1394671422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394671422L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "getTextFilter()Lnet/minecraft/server/network/TextFilter;", cancellable = true)
    private void getTextFilter__1843206366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843206366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "awardStat(Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void awardStat_541940401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(541940401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCamera(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setCamera__450949784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450949784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teleportTo(Lnet/minecraft/server/level/ServerLevel;DDDLjava/util/Set;FFZ)Z", cancellable = true)
    private void teleportTo__1424638453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1424638453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "teleportTo(DDD)V", cancellable = true)
    private void teleportTo__1069631997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069631997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCamera()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getCamera_1829663330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829663330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "magicCrit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void magicCrit__450949784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450949784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "crit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void crit__450949784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450949784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetStat(Lnet/minecraft/stats/Stat;)V", cancellable = true)
    private void resetStat__1506672698(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506672698L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "die(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void die__330898584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-330898584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openMenu(Lnet/minecraft/world/MenuProvider;)Ljava/util/OptionalInt;", cancellable = true)
    private void openMenu__1367462369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367462369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openDialog(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void openDialog_1547250014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1547250014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void swing_961783190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(961783190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "jumpFromGround()V", cancellable = true)
    private void jumpFromGround_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEnterCombat()V", cancellable = true)
    private void onEnterCombat_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLeaveCombat()V", cancellable = true)
    private void onLeaveCombat_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onItemPickup(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onItemPickup__438194009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-438194009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEquippedItemBroken(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void onEquippedItemBroken__200768090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200768090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunkTrackingView()Lnet/minecraft/server/level/ChunkTrackingView;", cancellable = true)
    private void getChunkTrackingView__1658042588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1658042588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetFallDistance()V", cancellable = true)
    private void resetFallDistance_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onInsideBlock(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void onInsideBlock__144517954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-144517954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "adjustSpawnLocation(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void adjustSpawnLocation_1964787584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964787584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "awardKillScore(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void awardKillScore__2128705937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2128705937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_1064274796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064274796L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeVehicle()V", cancellable = true)
    private void removeVehicle_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void restoreFrom_1957261129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1957261129L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forceSetRotation(FZFZ)V", cancellable = true)
    private void forceSetRotation__1480843721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1480843721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getKnownMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownMovement_1098504405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098504405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getKnownSpeed()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getKnownSpeed_1098504405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098504405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "broadcastToPlayer(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void broadcastToPlayer__768783133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768783133L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isReceivingWaypoints()Z", cancellable = true)
    private void isReceivingWaypoints_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mayInteract(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void mayInteract__1386468810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386468810L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stopSleepInBed(ZZ)V", cancellable = true)
    private void stopSleepInBed__492709169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-492709169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleShoulderEntities()V", cancellable = true)
    private void handleShoulderEntities_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInvulnerableTo(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void isInvulnerableTo__430155653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430155653L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "doCloseContainer()V", cancellable = true)
    private void doCloseContainer_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSleeping(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void startSleeping_169541475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169541475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "giveExperienceLevels(I)V", cancellable = true)
    private void giveExperienceLevels_1214691848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214691848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "openTextEdit(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Z)V", cancellable = true)
    private void openTextEdit_1389588783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389588783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openHorseInventory(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/world/Container;)V", cancellable = true)
    private void openHorseInventory__1677877182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1677877182L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendMerchantOffers(ILnet/minecraft/world/item/trading/MerchantOffers;IIZZ)V", cancellable = true)
    private void sendMerchantOffers_240480213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(240480213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canHarmPlayer(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canHarmPlayer_941380366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941380366L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "openItemGui(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void openItemGui__1310411119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1310411119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openNautilusInventory(Lnet/minecraft/world/entity/animal/nautilus/AbstractNautilus;Lnet/minecraft/world/Container;)V", cancellable = true)
    private void openNautilusInventory_207028696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(207028696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "closeContainer()V", cancellable = true)
    private void closeContainer_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openCommandBlock(Lnet/minecraft/world/level/block/entity/CommandBlockEntity;)V", cancellable = true)
    private void openCommandBlock_1886527603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1886527603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "awardRecipesByKey(Ljava/util/List;)V", cancellable = true)
    private void awardRecipesByKey__778443712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-778443712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onEnchantmentPerformed(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onEnchantmentPerformed__2035929981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2035929981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__1900404061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1900404061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;Z)V", cancellable = true)
    private void sendSystemMessage_1236869893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1236869893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendOverlayMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendOverlayMessage__1900404061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1900404061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startSleepInBed(Lnet/minecraft/core/BlockPos;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void startSleepInBed_106607303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106607303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerRecipeCrafted(Lnet/minecraft/world/item/crafting/RecipeHolder;Ljava/util/List;)V", cancellable = true)
    private void triggerRecipeCrafted_2125613075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125613075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "awardRecipes(Ljava/util/Collection;)I", cancellable = true)
    private void awardRecipes_1452083315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452083315L))
            info.setReturnValue(1566965901);
    }

    @Inject(at = @At("HEAD"), method = "giveExperiencePoints(I)V", cancellable = true)
    private void giveExperiencePoints_1214691848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214691848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetRecipes(Ljava/util/Collection;)I", cancellable = true)
    private void resetRecipes_1452083315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452083315L))
            info.setReturnValue(1566965901);
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAbilities()V", cancellable = true)
    private void onUpdateAbilities_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWardenSpawnTracker()Ljava/util/Optional;", cancellable = true)
    private void getWardenSpawnTracker_246236298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246236298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indicateDamage(DD)V", cancellable = true)
    private void indicateDamage__1142867953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1142867953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestedViewDistance()I", cancellable = true)
    private void requestedViewDistance_39037122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39037122L))
            info.setReturnValue(1274909885);
    }

    @Inject(at = @At("HEAD"), method = "allowsListing()Z", cancellable = true)
    private void allowsListing_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "commandSource()Lnet/minecraft/commands/CommandSource;", cancellable = true)
    private void commandSource__1553343113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553343113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isChangingDimension()Z", cancellable = true)
    private void isChangingDimension_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setExperiencePoints(I)V", cancellable = true)
    private void setExperiencePoints_1214691848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214691848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadAndSpawnEnderPearls(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadAndSpawnEnderPearls_232011509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(232011509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShoulderEntityLeft()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getShoulderEntityLeft__1569448044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569448044L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "updateOptions(Lnet/minecraft/server/level/ClientInformation;)V", cancellable = true)
    private void updateOptions_240412096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(240412096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clientInformation()Lnet/minecraft/server/level/ClientInformation;", cancellable = true)
    private void clientInformation__931114804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931114804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initInventoryMenu()V", cancellable = true)
    private void initInventoryMenu_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "loadAndSpawnParentVehicle(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void loadAndSpawnParentVehicle_232011509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(232011509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeEnderPearlTicket(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/ChunkPos;)J", cancellable = true)
    private static void placeEnderPearlTicket_2059712696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059712696L))
            info.setReturnValue(5008087167576259477L);
    }

    @Inject(at = @At("HEAD"), method = "setEntityOnShoulder(Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private void setEntityOnShoulder_561686942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561686942L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getShoulderEntityRight()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getShoulderEntityRight__1569448044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569448044L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "trackStartFallingPosition()V", cancellable = true)
    private void trackStartFallingPosition_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExperienceLevels(I)V", cancellable = true)
    private void setExperienceLevels_1214691848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214691848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkMovementStatistics(DDD)V", cancellable = true)
    private void checkMovementStatistics__1069631997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069631997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCommonSpawnInfo(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/network/protocol/game/CommonPlayerSpawnInfo;", cancellable = true)
    private void createCommonSpawnInfo_1746601455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746601455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetSentInfo()V", cancellable = true)
    private void resetSentInfo_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setServerLevel(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void setServerLevel__977634464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-977634464L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyRespawnPosition(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void copyRespawnPosition__768786977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-768786977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastSectionPos()Lnet/minecraft/core/SectionPos;", cancellable = true)
    private void getLastSectionPos_909279477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909279477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendSpawnProtectionMessage(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void sendSpawnProtectionMessage_169541475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169541475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChatVisibility()Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private void getChatVisibility_549322480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549322480L))
            info.setReturnValue(net.minecraft.world.entity.player.ChatVisiblity.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "getLastClientInput()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void getLastClientInput_1467925705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1467925705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastClientInput(Lnet/minecraft/world/entity/player/Input;)V", cancellable = true)
    private void setLastClientInput_811303759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(811303759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLastSectionPos(Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void setLastSectionPos__1088018501(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1088018501L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestDebugSubscriptions(Ljava/util/Set;)V", cancellable = true)
    private void requestDebugSubscriptions__543305852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-543305852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastActionTime()J", cancellable = true)
    private void getLastActionTime_39038083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39038083L))
            info.setReturnValue(2363354252633076756L);
    }

    @Inject(at = @At("HEAD"), method = "sendBuildLimitMessage(ZI)V", cancellable = true)
    private void sendBuildLimitMessage__508409026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-508409026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEnderPearls()Ljava/util/Set;", cancellable = true)
    private void getEnderPearls__1828260610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828260610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "debugSubscriptions()Ljava/util/Set;", cancellable = true)
    private void debugSubscriptions__1828260610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828260610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldFilterMessageTo(Lnet/minecraft/server/level/ServerPlayer;)Z", cancellable = true)
    private void shouldFilterMessageTo__768783133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768783133L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getChatSession()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void getChatSession_1190995860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190995860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastClientMoveIntent()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLastClientMoveIntent_1098504405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098504405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendServerStatus(Lnet/minecraft/network/protocol/status/ServerStatus;)V", cancellable = true)
    private void sendServerStatus_611990574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611990574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabListDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabListDisplayName_2118833007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118833007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasChangedDimension()V", cancellable = true)
    private void hasChangedDimension_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChatSession(Lnet/minecraft/network/chat/RemoteChatSession;)V", cancellable = true)
    private void setChatSession__520705400(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-520705400L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setKnownMovement(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void setKnownMovement_368510875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(368510875L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deregisterEnderPearl(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)V", cancellable = true)
    private void deregisterEnderPearl_10688282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(10688282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChunkTrackingView(Lnet/minecraft/server/level/ChunkTrackingView;)V", cancellable = true)
    private void setChunkTrackingView_1742480920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1742480920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIpAddress()Ljava/lang/String;", cancellable = true)
    private void getIpAddress__1134685595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134685595L))
            info.setReturnValue("{a9");
    }

    @Inject(at = @At("HEAD"), method = "registerEnderPearl(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)V", cancellable = true)
    private void registerEnderPearl_10688282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(10688282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetLastActionTime()V", cancellable = true)
    private void resetLastActionTime_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canChatInColor()Z", cancellable = true)
    private void canChatInColor_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTabListOrder()I", cancellable = true)
    private void getTabListOrder_39037122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39037122L))
            info.setReturnValue(1274909885);
    }

    @Inject(at = @At("HEAD"), method = "getAdvancements()Lnet/minecraft/server/PlayerAdvancements;", cancellable = true)
    private void getAdvancements_777270484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777270484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendChatMessage(Lnet/minecraft/network/chat/OutgoingChatMessage;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendChatMessage__1840915812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1840915812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDisconnected()Z", cancellable = true)
    private void hasDisconnected_39053459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39053459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/world/level/GameType;)Z", cancellable = true)
    private void setGameMode_247055354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247055354L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "teleportRelative(DDD)V", cancellable = true)
    private void teleportRelative__1069631997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069631997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onExplosionHit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void onExplosionHit__450949784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-450949784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleExtraItemsCreatedOnUse(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleExtraItemsCreatedOnUse_1735306164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1735306164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showEndCredits()V", cancellable = true)
    private void showEndCredits_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRaidOmenPosition(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setRaidOmenPosition_169541475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169541475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRaidOmenPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getRaidOmenPosition__1892612003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892612003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearRaidOmenPosition()V", cancellable = true)
    private void clearRaidOmenPosition_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findRespawnPositionAndUseSpawnBlock(ZLnet/minecraft/world/level/portal/TeleportTransition$PostTeleportTransition;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void findRespawnPositionAndUseSpawnBlock_353148341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(353148341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackEnteredOrExitedLavaOnVehicle()V", cancellable = true)
    private void trackEnteredOrExitedLavaOnVehicle_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAndUpdateEnderPearlTicket(Lnet/minecraft/world/entity/projectile/throwableitemprojectile/ThrownEnderpearl;)J", cancellable = true)
    private void registerAndUpdateEnderPearlTicket_10676750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10676750L))
            info.setReturnValue(2655447713954969160L);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnExtraParticlesOnFall(Z)V", cancellable = true)
    private void setSpawnExtraParticlesOnFall_1230391705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230391705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/stats/ServerRecipeBook;", cancellable = true)
    private void getRecipeBook__135668564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135668564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCommandSourceStack()Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private void createCommandSourceStack_2010297867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010297867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRespawnConfig()Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;", cancellable = true)
    private void getRespawnConfig__228006445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228006445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRespawnPosition(Lnet/minecraft/server/level/ServerPlayer$RespawnConfig;Z)V", cancellable = true)
    private void setRespawnPosition_151716431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(151716431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doTick()V", cancellable = true)
    private void doTick_39049615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39049615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Lnet/minecraft/stats/ServerStatsCounter;", cancellable = true)
    private void getStats_763734182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763734182L))
            info.setReturnValue(null);
    }


}
