package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ProfiledReloadInstance.class)
public class ProfiledReloadInstance_658992825Mixin {
        @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private static void of_2095431374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095431374L))
            info.setReturnValue(null);
    }


}
