package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlockItemStateProperties.class)
public class BlockItemStateProperties663655906Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/lang/Comparable;", cancellable = true)
    private void get_2027536266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027536266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__244970362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244970362L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1434079431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1434079431L))
            info.setReturnValue("!yL%\uFE9Arn)de7*1HX4\u1A91c1e\uD01Ceb.9V`Qj`@=&6^4Nm}v^;(F2eaig{Z=.q)-(\u04B1u\uCA9D.l{:nS\u3596d\u6975l(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1221007997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1221007997L))
            info.setReturnValue(-1706559416);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1722772278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722772278L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void apply__2035513361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035513361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__629834569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629834569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void with__1788404836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788404836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void with_273922638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273922638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1711564141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1711564141L))
            info.cancel();
    }


}
