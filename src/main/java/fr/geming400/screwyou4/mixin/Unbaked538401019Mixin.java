package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.MultiPartModel.Unbaked.class)
public class Unbaked538401019Mixin {
        @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__1733683069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733683069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visualEqualityGroup(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/lang/Object;", cancellable = true)
    private void visualEqualityGroup__1223211193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223211193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_488607089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(488607089L))
            info.cancel();
    }


}
