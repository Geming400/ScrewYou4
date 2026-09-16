package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.ChunkSkyLightSources.class)
public class ChunkSkyLightSources776622012Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/BlockGetter;III)Z", cancellable = true)
    private void update__865931512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865931512L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLowestSourceY(II)I", cancellable = true)
    private void getLowestSourceY_1360513580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360513580L))
            info.setReturnValue(1954368500);
    }

    @Inject(at = @At("HEAD"), method = "getHighestLowestSourceY()I", cancellable = true)
    private void getHighestLowestSourceY_1406063780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406063780L))
            info.setReturnValue(-902227248);
    }

    @Inject(at = @At("HEAD"), method = "fillFrom(Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void fillFrom_576038848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576038848L))
            info.cancel();
    }


}
