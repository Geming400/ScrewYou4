package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.UpgradeData.class)
public class UpgradeData_1316397288Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/UpgradeData;", cancellable = true)
    private void copy__84465490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84465490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1919453637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919453637L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write__1575530144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575530144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrade(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void upgrade_511488998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(511488998L))
            info.cancel();
    }


}
