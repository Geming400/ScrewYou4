package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidModel.Unbaked.class)
public class Unbaked903548045Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2005906992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005906992L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__231911930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231911930L))
            info.setReturnValue("\uB11Av\uFF93\u31840feQW|wmF05:!XkV%3}(eqk]tiq0\u89AA19w5\u8333<M,*TD%W>\u1574{j|hFN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_941810787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941810787L))
            info.setReturnValue(-485585949);
    }

    @Inject(at = @At("HEAD"), method = "tintSource()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void tintSource_1125296246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125296246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowingMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void flowingMaterial__1186358134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186358134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void stillMaterial__1186358134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186358134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayMaterial()Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void overlayMaterial__1186358134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186358134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/sprite/MaterialBaker;Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/renderer/block/FluidModel;", cancellable = true)
    private void bake_1134561611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134561611L))
            info.setReturnValue(null);
    }


}
