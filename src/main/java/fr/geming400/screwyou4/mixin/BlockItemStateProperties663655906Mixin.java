package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlockItemStateProperties.class)
public class BlockItemStateProperties663655906Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/lang/Comparable;", cancellable = true)
    private void get__1109947104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109947104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2049168165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049168165L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__471804069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471804069L))
            info.setReturnValue("Os1=L})}dY{1m짳K>![胻EvXa棉(X\"8hfXN6S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_701918648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701918648L))
            info.setReturnValue(-849909790);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_701934489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701934489L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void apply_326105729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326105729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Map;", cancellable = true)
    private void properties__1340967734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340967734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void with__623626922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623626922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void with__732246264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732246264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1879062484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1879062484L))
            info.cancel();
    }


}
