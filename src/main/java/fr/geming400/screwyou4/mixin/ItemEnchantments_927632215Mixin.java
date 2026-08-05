package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ItemEnchantments.class)
public class ItemEnchantments_927632215Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_965894460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965894460L))
            info.setReturnValue(1095087614);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1981823319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981823319L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__207828257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207828257L))
            info.setReturnValue("K3V_#J/p@$G\u8DE33iOH<.+}1{BSZ*\uAFE4\u836FQT\u2C09,Hh0g<}s&!lhWdNq(Olu\u7122Cc{ixhkd7t6\uB65D{K,Q\u9EA0RiIeA$9n3+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_965894460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965894460L))
            info.setReturnValue(1095087614);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_965910797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965910797L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__901403272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901403272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__901403272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901403272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private void getLevel__1820872437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820872437L))
            info.setReturnValue(-8512367);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1615086176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1615086176L))
            info.cancel();
    }


}
