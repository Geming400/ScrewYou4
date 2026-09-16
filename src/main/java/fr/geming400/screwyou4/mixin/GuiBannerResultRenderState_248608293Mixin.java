package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiBannerResultRenderState.class)
public class GuiBannerResultRenderState_248608293Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__660017976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-660017976L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1019031817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019031817L))
            info.setReturnValue("J6\u3EAA\uAD90oc\u4E64H*c0%4(B\u29C4SI6>\u3B026\uFF37{\u79DCIAi.kO`;K*E\"^Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_805960383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805960383L))
            info.setReturnValue(-766085343);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_2119857597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119857597L))
            info.setReturnValue(1.46294E7F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_2076643239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076643239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flag()Lnet/minecraft/client/model/object/banner/BannerFlagModel;", cancellable = true)
    private void flag_1215763446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215763446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_815958257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815958257L))
            info.setReturnValue(885352621);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_1703461938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703461938L))
            info.setReturnValue(1805978671);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_787329106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787329106L))
            info.setReturnValue(1917370938);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_1674832787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674832787L))
            info.setReturnValue(-1785684309);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor__1475132520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475132520L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_2018675283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018675283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resultBannerPatterns()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void resultBannerPatterns__1497550458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497550458L))
            info.setReturnValue(null);
    }


}
