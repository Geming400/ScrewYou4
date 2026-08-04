package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.JukeboxBlockEntity.class)
public class JukeboxBlockEntity1481357408Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/JukeboxBlockEntity;)V", cancellable = true)
    private static void tick__700323146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-700323146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxStackSize()I", cancellable = true)
    private void getMaxStackSize_1519619654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519619654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved()V", cancellable = true)
    private void setRemoved_1519632147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1519632147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "splitTheItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void splitTheItem__1419691669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419691669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerBlockEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getContainerBlockEntity_2040493356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040493356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSongItemWithoutPlaying(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setSongItemWithoutPlaying__1079078600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079078600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tryForcePlaySong()V", cancellable = true)
    private void tryForcePlaySong_1519632147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1519632147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_136607797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136607797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSongChanged()V", cancellable = true)
    private void onSongChanged_1519632147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1519632147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTheItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setTheItem__1079078600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079078600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSongPlayer()Lnet/minecraft/world/item/JukeboxSongPlayer;", cancellable = true)
    private void getSongPlayer_47105437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(47105437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "popOutTheItem()V", cancellable = true)
    private void popOutTheItem_1519632147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1519632147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getComparatorOutput()I", cancellable = true)
    private void getComparatorOutput_1519619654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519619654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItem(Lnet/minecraft/world/Container;ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canTakeItem_130718638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130718638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTheItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getTheItem_2004776068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004776068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__1037352170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1037352170L))
            info.cancel();
    }


}
