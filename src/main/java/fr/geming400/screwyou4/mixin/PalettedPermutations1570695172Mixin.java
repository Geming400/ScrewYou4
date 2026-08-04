package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations.class)
public class PalettedPermutations1570695172Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run__316451370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-316451370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1338759865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338759865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_435235197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435235197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1608957914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608957914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "separator()Ljava/lang/String;", cancellable = true)
    private void separator_435234701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(435234701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__988418400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988418400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textures()Ljava/util/List;", cancellable = true)
    private void textures__1097935308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097935308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paletteKey()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void paletteKey__872371381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872371381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "permutations()Ljava/util/Map;", cancellable = true)
    private void permutations__433928468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433928468L))
            info.setReturnValue(null);
    }


}
