package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.class)
public class WorldLoader_886118985Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/WorldLoader$InitConfig;Lnet/minecraft/server/WorldLoader$WorldDataSupplier;Lnet/minecraft/server/WorldLoader$ResultFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void load_80566296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80566296L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
