package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidModel.class)
public class FluidModel_89832425Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1475344683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475344683L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1045627551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045627551L))
            info.setReturnValue("Ut\uAC4F#%jud{qu4`FHN;QEg6\u5A7BY_g.x/$N\u5FD3o\u8B07Ep{kF(r=Z=W?iAQ?l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_128095166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128095166L))
            info.setReturnValue(311110103);
    }

    @Inject(at = @At("HEAD"), method = "layer()Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layer_916732689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916732689L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.CUTOUT);
    }

    @Inject(at = @At("HEAD"), method = "tintSource()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void tintSource_311580625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311580625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowingMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void flowingMaterial__2110218338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110218338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void stillMaterial__2110218338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110218338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void overlayMaterial__2110218338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110218338L))
            info.setReturnValue(null);
    }


}
