package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryDataLoader.class)
public class RegistryDataLoader_1306330814Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void load_1423244015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423244015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Ljava/util/Map;Lnet/minecraft/server/packs/resources/ResourceProvider;Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void load__1346647186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346647186L))
            info.setReturnValue(null);
    }


}
