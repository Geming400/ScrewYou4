package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureContents.class)
public class TextureContents_1718512681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_809886412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809886412L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1806031091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806031091L))
            info.setReturnValue("+tf/X}\uC2ACE^ve4#=1)@\u613D`P\u1C6B1.1jdX$e<1,;#rc #CF\u8D8Ca%vL)#a_\u9BC5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2019102525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019102525L))
            info.setReturnValue(-40776865);
    }

    @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private static void load_1365033256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365033256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clamp()Z", cancellable = true)
    private void clamp_259266052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259266052L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__396062749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-396062749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "image()Lcom/mojang/blaze3d/platform/NativeImage;", cancellable = true)
    private void image__1190964130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190964130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "metadata()Lnet/minecraft/client/resources/metadata/texture/TextureMetadataSection;", cancellable = true)
    private void metadata__339180944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339180944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMissing()Lnet/minecraft/client/renderer/texture/TextureContents;", cancellable = true)
    private static void createMissing_570793461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570793461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blur()Z", cancellable = true)
    private void blur__307660328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307660328L))
            info.setReturnValue(true);
    }


}
