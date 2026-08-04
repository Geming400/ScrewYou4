package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.MultiPlayerGameMode.class)
public class MultiPlayerGameMode836303297Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_874578036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(874578036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(ILnet/minecraft/world/item/crafting/display/RecipeDisplayId;Z)V", cancellable = true)
    private void handlePlaceRecipe__569408288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-569408288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSlotStateChanged(IIZ)V", cancellable = true)
    private void handleSlotStateChanged_71910750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71910750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerInput(IIILnet/minecraft/world/inventory/ContainerInput;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void handleContainerInput_952079146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(952079146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemAdd(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void handleCreativeModeItemAdd__1200401560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1200401560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemDrop(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleCreativeModeItemDrop__1724132711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1724132711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInventoryButtonClick(II)V", cancellable = true)
    private void handleInventoryButtonClick__159576172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-159576172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canHurtPlayer()Z", cancellable = true)
    private void canHurtPlayer_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExperience()Z", cancellable = true)
    private void hasExperience_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPlayerMode__559143001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559143001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSpectator()Z", cancellable = true)
    private void isSpectator_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreviousPlayerMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPreviousPlayerMode__559143001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559143001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopDestroyBlock()V", cancellable = true)
    private void stopDestroyBlock_874578036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(874578036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spectatorNoAction()V", cancellable = true)
    private void spectatorNoAction_874578036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(874578036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "continueDestroyBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void continueDestroyBlock_1448512600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448512600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "piercingAttack(Lnet/minecraft/world/item/component/PiercingWeapon;)V", cancellable = true)
    private void piercingAttack__131038579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-131038579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasMissTime()Z", cancellable = true)
    private void hasMissTime_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startDestroyBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void startDestroyBlock_1448512600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448512600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "releaseUsingItem(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void releaseUsingItem_1776904943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776904943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDestroying()Z", cancellable = true)
    private void isDestroying_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromEntity(Lnet/minecraft/world/entity/Entity;Z)V", cancellable = true)
    private void handlePickItemFromEntity__239159355(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-239159355L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromBlock(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void handlePickItemFromBlock_1816200490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1816200490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isServerControlledInventory()Z", cancellable = true)
    private void isServerControlledInventory_874581880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874581880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItem(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItem__1841838157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841838157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/EntityHitResult;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_173134850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173134850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn__400879567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400879567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attack(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void attack__740581390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-740581390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spectate(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void spectate_384578637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(384578637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void destroyBlock_1005073740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005073740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void adjustPlayer_1776904943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776904943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayer(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/stats/StatsCounter;Lnet/minecraft/client/ClientRecipeBook;)Lnet/minecraft/client/player/LocalPlayer;", cancellable = true)
    private void createPlayer_1313652755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313652755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayer(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/stats/StatsCounter;Lnet/minecraft/client/ClientRecipeBook;Lnet/minecraft/world/entity/player/Input;Z)Lnet/minecraft/client/player/LocalPlayer;", cancellable = true)
    private void createPlayer__1417838243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417838243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLocalMode(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setLocalMode_1082579931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1082579931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocalMode(Lnet/minecraft/world/level/GameType;Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setLocalMode_954290114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(954290114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDestroyStage()I", cancellable = true)
    private void getDestroyStage_874565543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874565543L))
            info.setReturnValue(null);
    }


}
