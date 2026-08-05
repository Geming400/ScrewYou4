package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JukeboxBlockEntity.class)
public class JukeboxBlockEntity1481357408Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/JukeboxBlockEntity;)V", cancellable = true)
    private static void tick__2139169197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2139169197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_345110283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345110283L))
            info.setReturnValue(-995964030);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved()V", cancellable = true)
    private void setRemoved__715427787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-715427787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTheItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setTheItem_429674262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429674262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTheItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getTheItem__601966222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601966222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerBlockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getContainerBlockEntity__822163919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822163919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSongPlayer()Lnet/minecraft/world/item/JukeboxSongPlayer;", cancellable = true)
    private void getSongPlayer_1220136425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220136425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSongItemWithoutPlaying(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setSongItemWithoutPlaying_1924120072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1924120072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "popOutTheItem()V", cancellable = true)
    private void popOutTheItem_1658781260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658781260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSongChanged()V", cancellable = true)
    private void onSongChanged_1979314835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979314835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryForcePlaySong()V", cancellable = true)
    private void tryForcePlaySong__1524875718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1524875718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitTheItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void splitTheItem_1934165505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934165505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getComparatorOutput()I", cancellable = true)
    private void getComparatorOutput__1297753735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297753735L))
            info.setReturnValue(-1520033565);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_881211706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(881211706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_1675866751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675866751L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItem(Lnet/minecraft/world/Container;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canTakeItem__712089916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712089916L))
            info.setReturnValue(false);
    }


}
