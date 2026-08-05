package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.InstrumentComponent.class)
public class InstrumentComponent1584085560Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1325369477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325369477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_448625585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448625585L))
            info.setReturnValue("G,4A\uFB55f:{m`\u58FB\u6A93Krx0T6?s&[c5KJyqd?\u44F4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1622348302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622348302L))
            info.setReturnValue(-1112734552);
    }

    @Inject(at = @At("HEAD"), method = "instrument()Lnet/minecraft/core/Holder;", cancellable = true)
    private void instrument__1162005964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162005964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__958632830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-958632830L))
            info.cancel();
    }


}
