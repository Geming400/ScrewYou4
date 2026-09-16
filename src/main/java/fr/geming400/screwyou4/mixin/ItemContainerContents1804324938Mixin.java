package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ItemContainerContents.class)
public class ItemContainerContents1804324938Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_895698174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895698174L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1933290763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933290763L))
            info.setReturnValue(2024804261);
    }

    @Inject(at = @At("HEAD"), method = "copyInto(Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private void copyInto_978571105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(978571105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__570895109(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-570895109L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyOne()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void copyOne__1815896545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815896545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyItems()Ljava/lang/Iterable;", cancellable = true)
    private void nonEmptyItems_465501362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465501362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nonEmptyItemCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void nonEmptyItemCopyStream__1790222249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790222249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromItems(Ljava/util/List;)Lnet/minecraft/world/item/component/ItemContainerContents;", cancellable = true)
    private static void fromItems_878807754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878807754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allItemsCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void allItemsCopyStream_537552363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537552363L))
            info.setReturnValue(null);
    }


}
