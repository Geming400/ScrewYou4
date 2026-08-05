package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BannerSpecialRenderer.Unbaked.class)
public class Unbaked1546772616Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1012340956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012340956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1362682421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362682421L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_411312641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411312641L))
            info.setReturnValue("WZ/sLcV+[<K%[lO{/x)\u975B\uBC73F/t6wVoj%f|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1585035358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585035358L))
            info.setReturnValue(-128095742);
    }

    @Inject(at = @At("HEAD"), method = "attachment()Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private void attachment__419346984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419346984L))
            info.setReturnValue(net.minecraft.world.level.block.BannerBlock.AttachmentType.WALL);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__141250244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141250244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BannerSpecialRenderer;", cancellable = true)
    private void bake_1196799939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196799939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor__1312886450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1312886450L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.YELLOW);
    }


}
