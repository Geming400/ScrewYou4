package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModel.SimpleCachedUnbakedRoot.class)
public class SimpleCachedUnbakedRoot_1723163045Mixin {
        @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1496113969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1496113969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visualEqualityGroup(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/Object;", cancellable = true)
    private void visualEqualityGroup__925720267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925720267L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__1903390989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903390989L))
            info.setReturnValue(null);
    }


}
