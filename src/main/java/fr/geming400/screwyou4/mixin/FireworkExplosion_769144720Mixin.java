package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.FireworkExplosion.class)
public class FireworkExplosion_769144720Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__139481549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139481549L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1539568244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539568244L))
            info.setReturnValue(">..#3&7\u233B|I\u4F3CI&e 7|!]`[Nmu66FS>*{\u79DAg:Z?T\u0425_RN%\u2F6DJeOieE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1326496810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326496810L))
            info.setReturnValue(1740726214);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/item/component/FireworkExplosion$Shape;", cancellable = true)
    private void shape_505460528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505460528L))
            info.setReturnValue(net.minecraft.world.item.component.FireworkExplosion.Shape.LARGE_BALL);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1606075328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1606075328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "colors()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void colors_1147072470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1147072470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fadeColors()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void fadeColors_511777138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511777138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasTwinkle()Z", cancellable = true)
    private void hasTwinkle_2011263812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011263812L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasTrail()Z", cancellable = true)
    private void hasTrail__670751430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670751430L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalTooltip(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addAdditionalTooltip_765356135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765356135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withFadeColors(Lit/unimi/dsi/fastutil/ints/IntList;)Lnet/minecraft/world/item/component/FireworkExplosion;", cancellable = true)
    private void withFadeColors_1810701670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810701670L))
            info.setReturnValue(null);
    }


}
