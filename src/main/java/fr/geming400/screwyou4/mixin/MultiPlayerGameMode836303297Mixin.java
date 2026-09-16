package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.MultiPlayerGameMode.class)
public class MultiPlayerGameMode836303297Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_706619639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(706619639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleSlotStateChanged(IIZ)V", cancellable = true)
    private void handleSlotStateChanged_1113170087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1113170087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleContainerInput(IIILnet/minecraft/world/inventory/ContainerInput;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void handleContainerInput_1481318203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1481318203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "continueDestroyBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void continueDestroyBlock__394421422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394421422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spectatorNoAction()V", cancellable = true)
    private void spectatorNoAction_849666766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(849666766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopDestroyBlock()V", cancellable = true)
    private void stopDestroyBlock__886877249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-886877249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasMissTime()Z", cancellable = true)
    private void hasMissTime_1398305461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398305461L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDestroying()Z", cancellable = true)
    private void isDestroying__1903457210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903457210L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "startDestroyBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void startDestroyBlock_1858804365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1858804365L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "piercingAttack(Lnet/minecraft/world/item/component/PiercingWeapon;)V", cancellable = true)
    private void piercingAttack_218468410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(218468410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromBlock(Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void handlePickItemFromBlock_1903399555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1903399555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePickItemFromEntity(Lnet/minecraft/world/entity/Entity;Z)V", cancellable = true)
    private void handlePickItemFromEntity_729479036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(729479036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocalMode(Lnet/minecraft/world/level/GameType;Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setLocalMode__1594667562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1594667562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLocalMode(Lnet/minecraft/world/level/GameType;)V", cancellable = true)
    private void setLocalMode__1999088657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1999088657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayer(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/stats/StatsCounter;Lnet/minecraft/client/ClientRecipeBook;Lnet/minecraft/world/entity/player/Input;Z)Lnet/minecraft/client/player/LocalPlayer;", cancellable = true)
    private void createPlayer_1789543834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789543834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayer(Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/stats/StatsCounter;Lnet/minecraft/client/ClientRecipeBook;)Lnet/minecraft/client/player/LocalPlayer;", cancellable = true)
    private void createPlayer_1520595088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520595088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustPlayer(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void adjustPlayer_637831583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637831583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDestroyStage()I", cancellable = true)
    private void getDestroyStage_1592004173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1592004173L))
            info.setReturnValue(1094102975);
    }

    @Inject(at = @At("HEAD"), method = "spectate(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void spectate_1890680614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1890680614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemDrop(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void handleCreativeModeItemDrop_1877934877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1877934877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "releaseUsingItem(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void releaseUsingItem__620010625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-620010625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPreviousPlayerMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPreviousPlayerMode__1896742120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896742120L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "isSpectator()Z", cancellable = true)
    private void isSpectator__337498189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337498189L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "destroyBlock(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void destroyBlock__344561345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344561345L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "attack(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void attack_1136675898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1136675898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useItemOn(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/phys/BlockHitResult;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItemOn__407548246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407548246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interact(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/EntityHitResult;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void interact_747963660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747963660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useItem(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useItem_422360173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422360173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isServerControlledInventory()Z", cancellable = true)
    private void isServerControlledInventory__106595081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106595081L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getPlayerMode__1856885311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856885311L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "hasExperience()Z", cancellable = true)
    private void hasExperience_837183060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837183060L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canHurtPlayer()Z", cancellable = true)
    private void canHurtPlayer_1739490232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739490232L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleCreativeModeItemAdd(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void handleCreativeModeItemAdd_4159836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(4159836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleInventoryButtonClick(II)V", cancellable = true)
    private void handleInventoryButtonClick_841767058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(841767058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handlePlaceRecipe(ILnet/minecraft/world/item/crafting/display/RecipeDisplayId;Z)V", cancellable = true)
    private void handlePlaceRecipe__1793257523(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1793257523L))
            info.cancel();
    }


}
