package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.player.LocalPlayer.class)
public class LocalPlayer1665030334Mixin {
        @Inject(at = @At("HEAD"), method = "permissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void permissions__447423104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447423104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPermissions(Lnet/minecraft/server/permissions/PermissionSet;)V", cancellable = true)
    private void setPermissions_1302816046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302816046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void move__1084491713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1084491713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drop(Z)Z", cancellable = true)
    private void drop_1326374446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326374446L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1535346676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1535346676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshChatAbilities()V", cancellable = true)
    private void refreshChatAbilities_1618762972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618762972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "chatAbilities()Lnet/minecraft/client/multiplayer/chat/ChatAbilities;", cancellable = true)
    private void chatAbilities_894598100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894598100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendOpenInventory()V", cancellable = true)
    private void sendOpenInventory__183459289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-183459289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHandsBusy()Z", cancellable = true)
    private void isHandsBusy__1475401118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475401118L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "raycastHitResult(FLnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void raycastHitResult_1350696108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350696108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCurrentMood()F", cancellable = true)
    private void getCurrentMood_394136775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394136775L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "getActivePortalLocalTransition()Lnet/minecraft/world/level/block/Portal$Transition;", cancellable = true)
    private void getActivePortalLocalTransition__970791717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970791717L))
            info.setReturnValue(net.minecraft.world.level.block.Portal.Transition.CONFUSION);
    }

    @Inject(at = @At("HEAD"), method = "setShowDeathScreen(Z)V", cancellable = true)
    private void setShowDeathScreen__1636300100(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1636300100L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDoLimitedCrafting(Z)V", cancellable = true)
    private void setDoLimitedCrafting_1963600234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963600234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExperienceValues(FII)V", cancellable = true)
    private void setExperienceValues_1785494709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1785494709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastSentInput()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void getLastSentInput_1112665861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112665861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clientSideCloseContainer()V", cancellable = true)
    private void clientSideCloseContainer_810420358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(810420358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGameModeChanged(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void onGameModeChanged_650007160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(650007160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDropSpamThrottler()Lnet/minecraft/util/TickThrottler;", cancellable = true)
    private void getDropSpamThrottler__1506564172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506564172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1923202614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1923202614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRopeHoldPosition(F)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRopeHoldPosition_67551933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67551933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReducedDebugInfo(Z)V", cancellable = true)
    private void setReducedDebugInfo__32817216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-32817216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUsedItemHand()Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private void getUsedItemHand__599453091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599453091L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }

    @Inject(at = @At("HEAD"), method = "isLocalPlayer()Z", cancellable = true)
    private void isLocalPlayer__1515864813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515864813L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isUsingItem()Z", cancellable = true)
    private void isUsingItem__914700568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914700568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "closeContainer()V", cancellable = true)
    private void closeContainer__1886743640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1886743640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTextEdit(Lnet/minecraft/world/level/block/entity/SignBlockEntity;Z)V", cancellable = true)
    private void openTextEdit_1022112914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1022112914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openMinecartCommandBlock(Lnet/minecraft/world/entity/vehicle/minecart/MinecartCommandBlock;)V", cancellable = true)
    private void openMinecartCommandBlock__1746408018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1746408018L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openCommandBlock(Lnet/minecraft/world/level/block/entity/CommandBlockEntity;)V", cancellable = true)
    private void openCommandBlock_1602710977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1602710977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemDrop(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleCreativeModeItemDrop__1588305382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1588305382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTextFilteringEnabled()Z", cancellable = true)
    private void isTextFilteringEnabled_1854361895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854361895L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "openTestBlock(Lnet/minecraft/world/level/block/entity/TestBlockEntity;)V", cancellable = true)
    private void openTestBlock__1301710945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1301710945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openJigsawBlock(Lnet/minecraft/world/level/block/entity/JigsawBlockEntity;)V", cancellable = true)
    private void openJigsawBlock__1183579139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1183579139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openTestInstanceBlock(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;)V", cancellable = true)
    private void openTestInstanceBlock__1545248311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1545248311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openStructureBlock(Lnet/minecraft/world/level/block/entity/StructureBlockEntity;)V", cancellable = true)
    private void openStructureBlock__607990335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-607990335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openItemGui(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void openItemGui_1461085041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461085041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canDropItems()Z", cancellable = true)
    private void canDropItems_2032806644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032806644L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sendSystemMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendSystemMessage__1717474731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1717474731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRotateWithMinecart()Z", cancellable = true)
    private void shouldRotateWithMinecart__1326985746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326985746L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onUpdateAbilities()V", cancellable = true)
    private void onUpdateAbilities_1223055057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1223055057L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopUsingItem()V", cancellable = true)
    private void stopUsingItem__539699012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-539699012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startUsingItem(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void startUsingItem__839459667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-839459667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewXRot(F)F", cancellable = true)
    private void getViewXRot_1132739025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1132739025L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "getViewYRot(F)F", cancellable = true)
    private void getViewYRot_936225520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936225520L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeVehicle()V", cancellable = true)
    private void removeVehicle__2079649175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2079649175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startRiding(Lnet/minecraft/world/entity/Entity;ZZ)Z", cancellable = true)
    private void startRiding_1766802245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766802245L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isShiftKeyDown()Z", cancellable = true)
    private void isShiftKeyDown__91679476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91679476L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1876188846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1876188846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendOverlayMessage(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void sendOverlayMessage__414674970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-414674970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnSprintParticle()Z", cancellable = true)
    private void canSpawnSprintParticle_349123626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349123626L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCrouching()Z", cancellable = true)
    private void isCrouching__1206118569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206118569L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isUnderWater()Z", cancellable = true)
    private void isUnderWater_457581100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457581100L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playSound(Lnet/minecraft/sounds/SoundEvent;FF)V", cancellable = true)
    private void playSound__167364639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-167364639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "heal(F)V", cancellable = true)
    private void heal_364362063(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364362063L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "rideTick()V", cancellable = true)
    private void rideTick__1149577764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1149577764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees__2024375100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024375100L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "updateTutorialInventoryAction(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/ClickAction;)V", cancellable = true)
    private void updateTutorialInventoryAction_717098319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(717098319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSuppressingSlidingDownLadder()Z", cancellable = true)
    private void isSuppressingSlidingDownLadder_191310566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191310566L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRecipeBook()Lnet/minecraft/client/ClientRecipeBook;", cancellable = true)
    private void getRecipeBook__311792925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311792925L))
            info.setReturnValue(new net.minecraft.client.ClientRecipeBook());
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__998639395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-998639395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openDialog(Lnet/minecraft/core/Holder;)V", cancellable = true)
    private void openDialog__1285941390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1285941390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "crit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void crit__2114458844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114458844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "magicCrit(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void magicCrit__98412175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-98412175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "swing(Lnet/minecraft/world/InteractionHand;)V", cancellable = true)
    private void swing_64015606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(64015606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyInput()V", cancellable = true)
    private void applyInput__15285259(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-15285259L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldShowDeathScreen()Z", cancellable = true)
    private void shouldShowDeathScreen__1434792475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434792475L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getJumpRidingScale()F", cancellable = true)
    private void getJumpRidingScale_1009112752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009112752L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "jumpableVehicle()Lnet/minecraft/world/entity/PlayerRideableJumping;", cancellable = true)
    private void jumpableVehicle__1697296342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697296342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "respawn()V", cancellable = true)
    private void respawn__623408311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-623408311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStats()Lnet/minecraft/stats/StatsCounter;", cancellable = true)
    private void getStats__1173468876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173468876L))
            info.setReturnValue(new net.minecraft.stats.StatsCounter());
    }

    @Inject(at = @At("HEAD"), method = "resetPos()V", cancellable = true)
    private void resetPos_1109181452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1109181452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtTo(F)V", cancellable = true)
    private void hurtTo__712183599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-712183599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeRecipeHighlight(Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;)V", cancellable = true)
    private void removeRecipeHighlight_597148810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(597148810L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDoLimitedCrafting()Z", cancellable = true)
    private void getDoLimitedCrafting_1799814810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799814810L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isMovingSlowly()Z", cancellable = true)
    private void isMovingSlowly__885120337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885120337L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWaterVision()F", cancellable = true)
    private void getWaterVision__332267944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332267944L))
            info.setReturnValue(4.572592E8F);
    }

    @Inject(at = @At("HEAD"), method = "isAutoJumpEnabled()Z", cancellable = true)
    private void isAutoJumpEnabled__1683545285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683545285L))
            info.setReturnValue(false);
    }


}
