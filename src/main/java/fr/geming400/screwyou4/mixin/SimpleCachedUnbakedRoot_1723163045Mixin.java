package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModel.SimpleCachedUnbakedRoot.class)
public class SimpleCachedUnbakedRoot_1723163045Mixin {
        @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1673369114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1673369114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visualEqualityGroup(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/Object;", cancellable = true)
    private void visualEqualityGroup__38449168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38449168L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__548921044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548921044L))
            info.setReturnValue(null);
    }


}
