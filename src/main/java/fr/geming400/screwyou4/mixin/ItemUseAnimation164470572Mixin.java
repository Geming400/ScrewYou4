package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemUseAnimation.class)
public class ItemUseAnimation164470572Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private static void values__1839345290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839345290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private static void valueOf_1592604559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1592604559L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.SPYGLASS);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1493853023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493853023L))
            info.setReturnValue(1583787544);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_252679194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252679194L))
            info.setReturnValue(";ogiaNe\u33EE\u5179dG[b2Y5J|\u2743\uBEC8z2j^j\u44E1Hk\uC104eO-9__QD+;\u57A65cEi4\u8F98\u4494QH1%O>+[=}UltN'}PXP$n6puu<EG'\u9D06Bzmp{\u3AA48");
    }

    @Inject(at = @At("HEAD"), method = "hasCustomArmTransform()Z", cancellable = true)
    private void hasCustomArmTransform_102981384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102981384L))
            info.setReturnValue(true);
    }


}
