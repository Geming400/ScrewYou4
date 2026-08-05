package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.FireworkExplosion.class)
public class FireworkExplosion_769144720Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2140310318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140310318L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__366315256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366315256L))
            info.setReturnValue("\u3155XF._'BBu\u8D04$\u87ACGdfK'r\u9B16`?W[\u7364\u172Awh|YkP\uF98B\u5452\u057AL_IbrrOdg<[kBP?1fRO:]cC\u0E4C\u04DBZ2QsP=:wS\u3D9Ee!\u6E20`\u0146z81");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_807407461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807407461L))
            info.setReturnValue(-519911236);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private void shape__1003950193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003950193L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.SMALL_BALL);
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalTooltip(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addAdditionalTooltip_1450161132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1450161132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withFadeColors(Lit/unimi/dsi/fastutil/ints/IntList;)Lnet/minecraft/world/item/component/FireworkExplosion;", cancellable = true)
    private void withFadeColors__1072365452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072365452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1773573671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1773573671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "colors()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void colors_1699635814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699635814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTrail()Z", cancellable = true)
    private void hasTrail_807423302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807423302L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fadeColors()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void fadeColors_1699635814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699635814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTwinkle()Z", cancellable = true)
    private void hasTwinkle_807423302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807423302L))
            info.setReturnValue(false);
    }


}
