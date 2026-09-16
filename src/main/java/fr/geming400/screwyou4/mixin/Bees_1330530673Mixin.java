package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Bees.class)
public class Bees_1330530673Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_421904404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421904404L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2100954197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100954197L))
            info.setReturnValue("\uC9CF\u82EA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1887882763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887882763L))
            info.setReturnValue(-267708958);
    }

    @Inject(at = @At("HEAD"), method = "bees()Ljava/util/List;", cancellable = true)
    private void bees_702630225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702630225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1044689375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044689375L))
            info.cancel();
    }


}
