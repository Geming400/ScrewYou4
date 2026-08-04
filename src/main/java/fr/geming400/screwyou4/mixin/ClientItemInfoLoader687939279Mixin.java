package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ClientItemInfoLoader.class)
public class ClientItemInfoLoader687939279Mixin {
        @Inject(at = @At("HEAD"), method = "scheduleLoad(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void scheduleLoad__1222574817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222574817L))
            info.setReturnValue(null);
    }


}
