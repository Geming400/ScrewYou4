package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.BlockStateModelLoader.class)
public class BlockStateModelLoader_159203030Mixin {
        @Inject(at = @At("HEAD"), method = "loadBlockStates(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void loadBlockStates__1751311067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751311067L))
            info.setReturnValue(null);
    }


}
