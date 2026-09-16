package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.InstrumentComponent.class)
public class InstrumentComponent1584085560Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_675459292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(675459292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1940458211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940458211L))
            info.setReturnValue("\u6A85wU$IO?\"<W@&H[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2141437651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141437651L))
            info.setReturnValue(1876453011);
    }

    @Inject(at = @At("HEAD"), method = "instrument()Lnet/minecraft/core/Holder;", cancellable = true)
    private void instrument__835907219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835907219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__791134487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791134487L))
            info.cancel();
    }


}
