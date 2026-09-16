package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidModel.Unbaked.class)
public class Unbaked903548045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__5078223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-5078223L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1673971570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673971570L))
            info.setReturnValue("n\u0B16${^%!ck9TizhoiCRJ5&/[\u6AD3p$>r#++]v76BzjJs\uB68EY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1460900136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1460900136L))
            info.setReturnValue(1216000965);
    }

    @Inject(at = @At("HEAD"), method = "stillMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void stillMaterial__844249415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844249415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void overlayMaterial__1875910815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875910815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowingMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void flowingMaterial_536281605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536281605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tintSource()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void tintSource__1180413204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180413204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/sprite/MaterialBaker;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/renderer/block/FluidModel;", cancellable = true)
    private void bake_952321700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952321700L))
            info.setReturnValue(null);
    }


}
