package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.LocalPlayer.class)
public class LocalPlayer1665030334Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions_592470780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592470780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPermissions(Lnet/minecraft/server/permissions/PermissionSet;)V", cancellable = true)
    private void setPermissions__1009819984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1009819984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move__438463058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-438463058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drop(Z)Z", cancellable = true)
    private void drop__1400316289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400316289L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetPos()V", cancellable = true)
    private void resetPos_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtTo(F)V", cancellable = true)
    private void hurtTo__1418790553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418790553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "heal(F)V", cancellable = true)
    private void heal__1418790553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418790553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/sounds/SoundEvent;FF)V", cancellable = true)
    private void playSound_301342886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(301342886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "respawn()V", cancellable = true)
    private void respawn_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Lnet/minecraft/stats/StatsCounter;", cancellable = true)
    private void getStats_178541835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178541835L))
            info.setReturnValue(new net.minecraft.stats.StatsCounter());
    }

    @Inject(at = @At("HEAD"), method = "startUsingItem(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void startUsingItem__1668928648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1668928648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/client/ClientRecipeBook;", cancellable = true)
    private void getRecipeBook__348993904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348993904L))
            info.setReturnValue(new net.minecraft.client.ClientRecipeBook());
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_1703289697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703289697L))
            info.setReturnValue(3.706602E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateTutorialInventoryAction(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/ClickAction;)V", cancellable = true)
    private void updateTutorialInventoryAction_1102815716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1102815716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSuppressingSlidingDownLadder()Z", cancellable = true)
    private void isSuppressingSlidingDownLadder_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Z", cancellable = true)
    private void isCrouching_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isUnderWater()Z", cancellable = true)
    private void isUnderWater_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getViewYRot(F)F", cancellable = true)
    private void getViewYRot__1418805929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418805929L))
            info.setReturnValue(3.706602E8F);
    }

    @Inject(at = @At("HEAD"), method = "getViewXRot(F)F", cancellable = true)
    private void getViewXRot__1418805929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1418805929L))
            info.setReturnValue(3.706602E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeVehicle()V", cancellable = true)
    private void removeVehicle_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding__1566437042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566437042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isShiftKeyDown()Z", cancellable = true)
    private void isShiftKeyDown_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1422484637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1422484637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__984187518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-984187518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRopeHoldPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRopeHoldPosition__604789203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604789203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReducedDebugInfo(Z)V", cancellable = true)
    private void setReducedDebugInfo__1400320133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1400320133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLocalPlayer()Z", cancellable = true)
    private void isLocalPlayer_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isUsingItem()Z", cancellable = true)
    private void isUsingItem_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getUsedItemHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getUsedItemHand__1775948238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775948238L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }

    @Inject(at = @At("HEAD"), method = "closeContainer()V", cancellable = true)
    private void closeContainer_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "openMinecartCommandBlock(Lnet/minecraft/world/entity/vehicle/minecart/MinecartCommandBlock;)V", cancellable = true)
    private void openMinecartCommandBlock_794713485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(794713485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTestBlock(Lnet/minecraft/world/level/block/entity/TestBlockEntity;)V", cancellable = true)
    private void openTestBlock_1248135664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1248135664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openCommandBlock(Lnet/minecraft/world/level/block/entity/CommandBlockEntity;)V", cancellable = true)
    private void openCommandBlock__744184235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-744184235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemDrop(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleCreativeModeItemDrop__895405674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-895405674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openStructureBlock(Lnet/minecraft/world/level/block/entity/StructureBlockEntity;)V", cancellable = true)
    private void openStructureBlock_592809725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(592809725L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openJigsawBlock(Lnet/minecraft/world/level/block/entity/JigsawBlockEntity;)V", cancellable = true)
    private void openJigsawBlock__868790081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-868790081L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTextEdit(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Z)V", cancellable = true)
    private void openTextEdit__1241123055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1241123055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTestInstanceBlock(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;)V", cancellable = true)
    private void openTestInstanceBlock_425172133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(425172133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__236148603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-236148603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendOverlayMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendOverlayMessage__236148603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-236148603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openItemGui(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void openItemGui_353844339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(353844339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canDropItems()Z", cancellable = true)
    private void canDropItems_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRotateWithMinecart()Z", cancellable = true)
    private void shouldRotateWithMinecart_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAbilities()V", cancellable = true)
    private void onUpdateAbilities_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopUsingItem()V", cancellable = true)
    private void stopUsingItem_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshChatAbilities()V", cancellable = true)
    private void refreshChatAbilities_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "crit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void crit_1213305674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1213305674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "magicCrit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void magicCrit_1213305674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1213305674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openDialog(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void openDialog__1083461824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1083461824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void swing__1668928648(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1668928648L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyInput()V", cancellable = true)
    private void applyInput_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getActivePortalLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getActivePortalLocalTransition__181634989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181634989L))
            info.setReturnValue(net.minecraft.world.level.block.Portal.Transition.CONFUSION);
    }

    @Inject(at = @At("HEAD"), method = "isHandsBusy()Z", cancellable = true)
    private void isHandsBusy_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sendOpenInventory()V", cancellable = true)
    private void sendOpenInventory_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "raycastHitResult(FLnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void raycastHitResult_82375173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82375173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeRecipeHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void removeRecipeHighlight__267847960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-267847960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameModeChanged(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void onGameModeChanged_1911306968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1911306968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDropSpamThrottler()Lnet/minecraft/util/TickThrottler;", cancellable = true)
    private void getDropSpamThrottler__383766182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-383766182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDoLimitedCrafting()Z", cancellable = true)
    private void getDoLimitedCrafting_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAutoJumpEnabled()Z", cancellable = true)
    private void isAutoJumpEnabled_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWaterVision()F", cancellable = true)
    private void getWaterVision_1703289697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703289697L))
            info.setReturnValue(3.706602E8F);
    }

    @Inject(at = @At("HEAD"), method = "isMovingSlowly()Z", cancellable = true)
    private void isMovingSlowly_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chatAbilities()Lnet/minecraft/client/multiplayer/chat/ChatAbilities;", cancellable = true)
    private void chatAbilities_1538008228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538008228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldShowDeathScreen()Z", cancellable = true)
    private void shouldShowDeathScreen_1703308917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703308917L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "jumpableVehicle()Lnet/minecraft/world/entity/PlayerRideableJumping;", cancellable = true)
    private void jumpableVehicle_590585766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590585766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getJumpRidingScale()F", cancellable = true)
    private void getJumpRidingScale_1703289697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703289697L))
            info.setReturnValue(3.706602E8F);
    }

    @Inject(at = @At("HEAD"), method = "setDoLimitedCrafting(Z)V", cancellable = true)
    private void setDoLimitedCrafting__1400320133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1400320133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowDeathScreen(Z)V", cancellable = true)
    private void setShowDeathScreen__1400320133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1400320133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clientSideCloseContainer()V", cancellable = true)
    private void clientSideCloseContainer_1703305073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703305073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExperienceValues(FII)V", cancellable = true)
    private void setExperienceValues__1777573113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777573113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastSentInput()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void getLastSentInput__1162786133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162786133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentMood()F", cancellable = true)
    private void getCurrentMood_1703289697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703289697L))
            info.setReturnValue(3.706602E8F);
    }


}
