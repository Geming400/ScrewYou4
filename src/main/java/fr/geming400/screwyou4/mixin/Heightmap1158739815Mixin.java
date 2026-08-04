package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Heightmap.class)
public class Heightmap1158739815Mixin {
        @Inject(at = @At("HEAD"), method = "update(IIILnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void update__1526278810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526278810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRawData()[J", cancellable = true)
    private void getRawData__1950385163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950385163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHighestTaken(II)I", cancellable = true)
    private void getHighestTaken_162847853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162847853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "primeHeightmaps(Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/Set;)V", cancellable = true)
    private static void primeHeightmaps__503915069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-503915069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFirstAvailable(II)I", cancellable = true)
    private void getFirstAvailable_162847853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162847853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRawData(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/Heightmap$Types;[J)V", cancellable = true)
    private void setRawData_1792419961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792419961L))
            info.cancel();
    }


}
