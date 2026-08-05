package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.PreparableReloadListener.SharedState.class)
public class SharedState2116990403Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/packs/resources/PreparableReloadListener$StateKey;)Ljava/lang/Object;", cancellable = true)
    private void get__1283468549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283468549L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/server/packs/resources/PreparableReloadListener$StateKey;Ljava/lang/Object;)V", cancellable = true)
    private void set_813584265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(813584265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resourceManager()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void resourceManager_864347272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864347272L))
            info.setReturnValue(null);
    }


}
