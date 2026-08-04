package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerRegistries.class)
public class ReloadableServerRegistries1932933717Mixin {
        @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/core/LayeredRegistryAccess;Ljava/util/List;Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void reload_1666792400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666792400L))
            info.setReturnValue(null);
    }


}
