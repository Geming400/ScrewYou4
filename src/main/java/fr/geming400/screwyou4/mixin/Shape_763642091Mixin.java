package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.FireworkExplosion.Shape.class)
public class Shape_763642091Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getName__1644362123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644362123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void values__98004325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98004325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void valueOf__1591619688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1591619688L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.SMALL_BALL);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_801904336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801904336L))
            info.setReturnValue(551779772);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private static void byId_876689865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876689865L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.LARGE_BALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__371818381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371818381L))
            info.setReturnValue("'?]VNg+qXCv4MIG7gC#ts4\u2DD8\uCCF1n\u301Cs");
    }


}
