package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemLore.class)
public class ItemLore92547591Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__816078677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816078677L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_862971116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862971116L))
            info.setReturnValue("\u7DA0Q1:zW\u50AD\"IB[\u231CQs0+>?D?\uC5139b<L\u8467\u75E0ITm\u8C26k>DpC$\uBAB4|/a\uC819I*\uC1393xbW\u7680pc3\uA737X\uBCF7_:^ \u755Bt\u2A69txhv8jM=#\u9AB3\u065ChQ\uA627n/J9Xq\u5E81");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_649899682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649899682L))
            info.setReturnValue(-2134055968);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines_608235958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608235958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_2012294840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2012294840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withLineAdded(Lnet/minecraft/network/chat/Component;)Lnet/minecraft/world/item/component/ItemLore;", cancellable = true)
    private void withLineAdded__1749475277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749475277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "styledLines()Ljava/util/List;", cancellable = true)
    private void styledLines__975619037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975619037L))
            info.setReturnValue(null);
    }


}
