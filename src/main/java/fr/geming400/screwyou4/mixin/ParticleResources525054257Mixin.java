package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleResources.class)
public class ParticleResources525054257Mixin {
        @Inject(at = @At("HEAD"), method = "getProviders()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void getProviders__833259749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833259749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1427714718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427714718L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "onReload(Ljava/lang/Runnable;)V", cancellable = true)
    private void onReload_1981795938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1981795938L))
            info.cancel();
    }


}
