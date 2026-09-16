package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSpreader.ChargeCursor.class)
public class ChargeCursor_933682922Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)V", cancellable = true)
    private void update__1621631758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1621631758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1423248652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423248652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecayDelay()I", cancellable = true)
    private void getDecayDelay__355345840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355345840L))
            info.setReturnValue(1035666929);
    }

    @Inject(at = @At("HEAD"), method = "getCharge()I", cancellable = true)
    private void getCharge_1262184805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262184805L))
            info.setReturnValue(-397699027);
    }

    @Inject(at = @At("HEAD"), method = "getFacingData()Ljava/util/Set;", cancellable = true)
    private void getFacingData__192624591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192624591L))
            info.setReturnValue(null);
    }


}
