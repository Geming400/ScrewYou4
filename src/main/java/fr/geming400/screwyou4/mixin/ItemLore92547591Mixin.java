package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemLore.class)
public class ItemLore92547591Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1478059850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478059850L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1042912384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042912384L))
            info.setReturnValue("nG'솃zG휇z?{y_swᨙ?Wb罷nYIཐd凪AF룩DD&艪<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_130810333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130810333L))
            info.setReturnValue(-2133422158);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines_1718884407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718884407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_1844796497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1844796497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "styledLines()Ljava/util/List;", cancellable = true)
    private void styledLines_1718884407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718884407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withLineAdded(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/item/component/ItemLore;", cancellable = true)
    private void withLineAdded_476235321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476235321L))
            info.setReturnValue(null);
    }


}
