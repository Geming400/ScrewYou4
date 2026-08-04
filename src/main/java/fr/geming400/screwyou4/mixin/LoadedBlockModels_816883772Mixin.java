package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.LoadedBlockModels.class)
public class LoadedBlockModels_816883772Mixin {
        @Inject(at = @At("HEAD"), method = "bake(Ljava/util/function/Function;Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void bake__235290667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235290667L))
            info.setReturnValue(null);
    }


}
