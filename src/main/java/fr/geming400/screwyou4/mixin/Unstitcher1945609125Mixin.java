package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.Unstitcher.class)
public class Unstitcher1945609125Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_58462583(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(58462583L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__963845912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963845912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_810149150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810149150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1983871867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983871867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resource()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void resource__497457428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497457428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "regions()Ljava/util/List;", cancellable = true)
    private void regions__723021355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723021355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__613504447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613504447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yDivisor()D", cancellable = true)
    private void yDivisor_1983866566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983866566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xDivisor()D", cancellable = true)
    private void xDivisor_1983866566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983866566L))
            info.setReturnValue(null);
    }


}
