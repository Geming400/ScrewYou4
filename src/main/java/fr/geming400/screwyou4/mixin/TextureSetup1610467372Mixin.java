package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.TextureSetup.class)
public class TextureSetup1610467372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1298987665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298987665L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_475007397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475007397L))
            info.setReturnValue("JP[CvU?=ZrM,]jCv.WHR+#zOBis=/愋t3hQH7UD7Whgt!rVO:gY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1648730114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648730114L))
            info.setReturnValue(1933623278);
    }

    @Inject(at = @At("HEAD"), method = "sampler0()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler0_1263689522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263689522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler1()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler1_1263689522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263689522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texure2()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure2__790147238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790147238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texure1()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure1__790147238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790147238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSortKey()I", cancellable = true)
    private void getSortKey_1648729618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648729618L))
            info.setReturnValue(-1725369410);
    }

    @Inject(at = @At("HEAD"), method = "texure0()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure0__790147238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790147238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler2()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler2_1263689522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263689522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSortKeySeed()V", cancellable = true)
    private static void updateSortKeySeed_1648742359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1648742359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doubleTexture(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void doubleTexture__2049274321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049274321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleTextureWithLightmap(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void singleTextureWithLightmap__679323355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679323355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleTexture(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void singleTexture__679323355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679323355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTexture()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void noTexture__2093782245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093782245L))
            info.setReturnValue(null);
    }


}
