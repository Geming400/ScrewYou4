package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SuspiciousStewEffects.class)
public class SuspiciousStewEffects1338698996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_430072728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430072728L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2109122521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109122521L))
            info.setReturnValue("J:k6Azj)d5}\u6FB9DKgB\u643Eb\u4E59vg[njK]=^<v^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1896051087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896051087L))
            info.setReturnValue(1020433608);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects_1889976102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889976102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1036521051(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1036521051L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withEffectAdded(Lnet/minecraft/world/item/component/SuspiciousStewEffects$Entry;)Lnet/minecraft/world/item/component/SuspiciousStewEffects;", cancellable = true)
    private void withEffectAdded__1221529686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221529686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume_1246601845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1246601845L))
            info.cancel();
    }


}
