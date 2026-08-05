package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BannerBlock.AttachmentType.class)
public class AttachmentType484691708Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private static void values__728963813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728963813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private static void valueOf_708138018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(708138018L))
            info.setReturnValue(net.minecraft.world.level.block.BannerBlock.AttachmentType.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_572900330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572900330L))
            info.setReturnValue("o)tQ4(\u1D16#X\u0966#`Pl7wD+3[72g*i(QYy(IY8Zx6*b{\u0F86dK\u29C8/3goG8Y\u770ER+");
    }


}
