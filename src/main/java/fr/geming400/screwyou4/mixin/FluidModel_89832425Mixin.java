package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.FluidModel.class)
public class FluidModel_89832425Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__818793844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818793844L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_860255949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860255949L))
            info.setReturnValue("|:\uD23C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_647184515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647184515L))
            info.setReturnValue(-1743327609);
    }

    @Inject(at = @At("HEAD"), method = "layer()Lnet/minecraft/client/renderer/chunk/ChunkSectionLayer;", cancellable = true)
    private void layer_546217760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546217760L))
            info.setReturnValue(net.minecraft.client.renderer.chunk.ChunkSectionLayer.TRANSLUCENT);
    }

    @Inject(at = @At("HEAD"), method = "tintSource()Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void tintSource__1994128825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994128825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowingMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void flowingMaterial__1289437991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289437991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void stillMaterial_932850317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932850317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overlayMaterial()Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void overlayMaterial__582933195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582933195L))
            info.setReturnValue(null);
    }


}
