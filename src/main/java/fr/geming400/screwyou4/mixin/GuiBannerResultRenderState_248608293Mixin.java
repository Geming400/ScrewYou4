package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.pip.GuiBannerResultRenderState.class)
public class GuiBannerResultRenderState_248608293Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1634120551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634120551L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__886851683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886851683L))
            info.setReturnValue("u)d)fM\u3401\u624FbVk?}\u4F2CH%;d%]Yv08\u34AA1_\uC98A}<r\uD222&1%f1Po>FyoWQ\"H\uAD912\u80E2^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_286871034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286871034L))
            info.setReturnValue(1481622391);
    }

    @Inject(at = @At("HEAD"), method = "scale()F", cancellable = true)
    private void scale_286867655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286867655L))
            info.setReturnValue(2.9712E7F);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void bounds_1423633596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423633596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flag()Lnet/minecraft/client/model/object/banner/BannerFlagModel;", cancellable = true)
    private void flag_1262455178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262455178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x1()I", cancellable = true)
    private void x1_286870538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286870538L))
            info.setReturnValue(1364658726);
    }

    @Inject(at = @At("HEAD"), method = "y1()I", cancellable = true)
    private void y1_286870538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286870538L))
            info.setReturnValue(1364658726);
    }

    @Inject(at = @At("HEAD"), method = "x0()I", cancellable = true)
    private void x0_286870538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286870538L))
            info.setReturnValue(1364658726);
    }

    @Inject(at = @At("HEAD"), method = "y0()I", cancellable = true)
    private void y0_286870538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286870538L))
            info.setReturnValue(1364658726);
    }

    @Inject(at = @At("HEAD"), method = "resultBannerPatterns()Lnet/minecraft/world/level/block/entity/BannerPatternLayers;", cancellable = true)
    private void resultBannerPatterns__1727629862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727629862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor_1683916522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683916522L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GREEN);
    }

    @Inject(at = @At("HEAD"), method = "scissorArea()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void scissorArea_1423633596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423633596L))
            info.setReturnValue(null);
    }


}
