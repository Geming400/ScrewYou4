package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BannerBlock.AttachmentType.class)
public class AttachmentType484691708Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private static void values__569979395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569979395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/BannerBlock$AttachmentType;", cancellable = true)
    private static void valueOf__2063594758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063594758L))
            info.setReturnValue(net.minecraft.world.level.block.BannerBlock.AttachmentType.GROUND);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__650768763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650768763L))
            info.setReturnValue("Azs]D`p㊼衵EC4撺#s)2슂T.E.5e/.ZBE^^No/J.h麮*I77WYmlitc歞p0N䈭)T}웫l /?MVwBNࢻ/n)U21老8ta?+");
    }


}
