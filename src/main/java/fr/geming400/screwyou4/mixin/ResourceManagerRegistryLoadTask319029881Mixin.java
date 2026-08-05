package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.ResourceManagerRegistryLoadTask.class)
public class ResourceManagerRegistryLoadTask319029881Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/resources/RegistryOps$RegistryInfoLookup;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void load_478055521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478055521L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
