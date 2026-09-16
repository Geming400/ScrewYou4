package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.TextureSetup.class)
public class TextureSetup1610467372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_701841104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701841104L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1914076399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914076399L))
            info.setReturnValue("m\u397B5}XZcB_e\u1706,i 8;&{\u62D5Z-.c\"M{]?. 0\u71A72=$Ei$Ib,{cRi4yF>Y>&r\uA5D1\u4549jm\uB9B0\u7F69ujar+qfsIv,ff{[ea[NbaUgXn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2127147833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127147833L))
            info.setReturnValue(1711683291);
    }

    @Inject(at = @At("HEAD"), method = "sampler0()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler0_2094269530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094269530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texure1()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure1_1420880842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420880842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texure2()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure2_1413121483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413121483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler1()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler1_393529051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(393529051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler2()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler2__1307211428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307211428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texure0()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texure0_1428640201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428640201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSortKey()I", cancellable = true)
    private void getSortKey__617770681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617770681L))
            info.setReturnValue(696826843);
    }

    @Inject(at = @At("HEAD"), method = "updateSortKeySeed()V", cancellable = true)
    private static void updateSortKeySeed_2084779022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2084779022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doubleTexture(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void doubleTexture__724796999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724796999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleTextureWithLightmap(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void singleTextureWithLightmap_79283364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79283364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleTexture(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;)Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void singleTexture__838312296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838312296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noTexture()Lnet/minecraft/client/gui/render/TextureSetup;", cancellable = true)
    private static void noTexture_1799881909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799881909L))
            info.setReturnValue(null);
    }


}
