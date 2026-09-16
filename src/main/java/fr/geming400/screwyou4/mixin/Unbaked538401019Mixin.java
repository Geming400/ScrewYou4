package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.Unbaked.class)
public class Unbaked538401019Mixin {
        @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1614091302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1614091302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visualEqualityGroup(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/Object;", cancellable = true)
    private void visualEqualityGroup__2110482292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110482292L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake_1206814282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206814282L))
            info.setReturnValue(null);
    }


}
