package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelBakery.class)
public class ModelBakery_196584805Mixin {
        @Inject(at = @At("HEAD"), method = "bakeModels(Lnet/minecraft/client/resources/model/sprite/MaterialBaker;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void bakeModels__1942425433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942425433L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
