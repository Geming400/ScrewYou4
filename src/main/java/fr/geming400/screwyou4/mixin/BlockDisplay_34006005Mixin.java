package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.BlockDisplay.class)
public class BlockDisplay_34006005Mixin {
        @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState__111286330(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-111286330L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1679755448(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1679755448L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2033214930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033214930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockRenderState()Lnet/minecraft/world/entity/Display$BlockDisplay$BlockRenderState;", cancellable = true)
    private void blockRenderState__1881311486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881311486L))
            info.setReturnValue(null);
    }


}
