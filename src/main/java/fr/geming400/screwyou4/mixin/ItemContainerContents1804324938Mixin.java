package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemContainerContents.class)
public class ItemContainerContents1804324938Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1105130595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105130595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1842587184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842587184L))
            info.setReturnValue(-1856084575);
    }

    @Inject(at = @At("HEAD"), method = "copyInto(Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private void copyInto_1315217846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1315217846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allItemsCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void allItemsCopyStream_1593618623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593618623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyItemCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void nonEmptyItemCopyStream_1593618623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593618623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyOne()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyOne__1967223698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967223698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyItems()Ljava/lang/Iterable;", cancellable = true)
    private void nonEmptyItems__205424750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205424750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__738393452(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-738393452L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromItems(Ljava/util/List;)Lnet/minecraft/world/item/component/ItemContainerContents;", cancellable = true)
    private static void fromItems__1896990956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896990956L))
            info.setReturnValue(null);
    }


}
