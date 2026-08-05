package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureContents.class)
public class TextureContents_1718512681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1190942357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190942357L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_583052705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583052705L))
            info.setReturnValue("xuoi}'+[OG>◜`Nʁ꯱砚>JHH!늴퀮8Q複呗e$[⧌P뵵sウ둛@wNC!.t`ꁔP3X`z䝼0^ᄗ└u:LvD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1756775422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756775422L))
            info.setReturnValue(719385218);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private static void load__351339954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351339954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clamp()Z", cancellable = true)
    private void clamp_1756791263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756791263L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1756787419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1756787419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "image()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void image_1992295897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992295897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "metadata()Lnet/minecraft/client/resources/metadata/texture/TextureMetadataSection;", cancellable = true)
    private void metadata__311800383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311800383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMissing()Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private static void createMissing__981251841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981251841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blur()Z", cancellable = true)
    private void blur_1756791263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756791263L))
            info.setReturnValue(true);
    }


}
