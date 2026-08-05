package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.ChunkSkyLightSources.class)
public class ChunkSkyLightSources776622012Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/BlockGetter;III)Z", cancellable = true)
    private void update__1495200015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495200015L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLowestSourceY(II)I", cancellable = true)
    private void getLowestSourceY__219269950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219269950L))
            info.setReturnValue(-170028816);
    }

    @Inject(at = @At("HEAD"), method = "getHighestLowestSourceY()I", cancellable = true)
    private void getHighestLowestSourceY_814884258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814884258L))
            info.setReturnValue(110543833);
    }

    @Inject(at = @At("HEAD"), method = "fillFrom(Lnet/minecraft/world/level/chunk/ChunkAccess;)V", cancellable = true)
    private void fillFrom__187069133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-187069133L))
            info.cancel();
    }


}
