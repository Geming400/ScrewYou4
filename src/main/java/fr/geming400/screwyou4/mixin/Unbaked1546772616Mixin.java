package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BannerSpecialRenderer.Unbaked.class)
public class Unbaked1546772616Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_151521962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151521962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_638146348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638146348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1977771155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977771155L))
            info.setReturnValue("5A(!m_s&&%l4N\u93E5Ft\uA21DZY|&E<>[d\u7034 P>?P*\u261Cd\uA03CA`%8lmD3w*9UO%k\"x'NIy+iH``Us\uCCC1\u77D7$E3e\u4569kUs^BV;\u1BFFMdElh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2104124707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104124707L))
            info.setReturnValue(233735685);
    }

    @Inject(at = @At("HEAD"), method = "attachment()Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private void attachment_1809712891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809712891L))
            info.setReturnValue(net.minecraft.world.level.block.BannerBlock.AttachmentType.GROUND);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1575392299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575392299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BannerSpecialRenderer;", cancellable = true)
    private void bake__311930806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311930806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor__176968196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176968196L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.CYAN);
    }


}
