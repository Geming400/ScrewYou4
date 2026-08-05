package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleResources.class)
public class ParticleResources525054257Mixin {
        @Inject(at = @At("HEAD"), method = "getProviders()Lit/unimi/dsi/fastutil/ints/Int2ObjectMap;", cancellable = true)
    private void getProviders_945497095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945497095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1116332631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116332631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onReload(Ljava/lang/Runnable;)V", cancellable = true)
    private void onReload__888665846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-888665846L))
            info.cancel();
    }


}
