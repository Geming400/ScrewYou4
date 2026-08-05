package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BlockDisplay.class)
public class BlockDisplay_34006005Mixin {
        @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_740740352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(740740352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState__1217514752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1217514752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1650786740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650786740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockRenderState()Lnet/minecraft/world/entity/Display$BlockDisplay$BlockRenderState;", cancellable = true)
    private void blockRenderState_841256528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841256528L))
            info.setReturnValue(null);
    }


}
