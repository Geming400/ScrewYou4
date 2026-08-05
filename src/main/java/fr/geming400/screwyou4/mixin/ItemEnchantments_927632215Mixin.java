package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ItemEnchantments.class)
public class ItemEnchantments_927632215Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1371363803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1371363803L))
            info.setReturnValue(-208660936);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_19005450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19005450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1698055243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698055243L))
            info.setReturnValue("PJw\u6798Y\u07C8&K\u2487}81KI\u755BC\u21E5\uAF94'x,S a#(:!s9m)i:mgp@j3Sb\uA908-E+AYpIy|Kyx\uF9AC\u488Cc<,a8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1484983809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484983809L))
            info.setReturnValue(-1371880854);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1986748586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986748586L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entrySet()Ljava/util/Set;", cancellable = true)
    private void entrySet__307071768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307071768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet_328084245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328084245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private void getLevel_1452030681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452030681L))
            info.setReturnValue(861516763);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1447587833(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1447587833L))
            info.cancel();
    }


}
