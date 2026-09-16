package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Heightmap.class)
public class Heightmap1158739815Mixin {
        @Inject(at = @At("HEAD"), method = "update(IIILnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void update__695283473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695283473L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFirstAvailable(II)I", cancellable = true)
    private void getFirstAvailable_1551095454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551095454L))
            info.setReturnValue(2122454126);
    }

    @Inject(at = @At("HEAD"), method = "primeHeightmaps(Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/Set;)V", cancellable = true)
    private static void primeHeightmaps__845815482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-845815482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRawData()[J", cancellable = true)
    private void getRawData__825507151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825507151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRawData(Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/levelgen/Heightmap$Types;[J)V", cancellable = true)
    private void setRawData__758117975(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-758117975L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHighestTaken(II)I", cancellable = true)
    private void getHighestTaken__779915948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779915948L))
            info.setReturnValue(1910449863);
    }


}
