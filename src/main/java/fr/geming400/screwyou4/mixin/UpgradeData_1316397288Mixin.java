package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.UpgradeData.class)
public class UpgradeData_1316397288Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/UpgradeData;", cancellable = true)
    private void copy__1236464765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236464765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1354675870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354675870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void write__253825633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253825633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrade(Lnet/minecraft/world/level/chunk/LevelChunk;)V", cancellable = true)
    private void upgrade__46669182(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-46669182L))
            info.cancel();
    }


}
