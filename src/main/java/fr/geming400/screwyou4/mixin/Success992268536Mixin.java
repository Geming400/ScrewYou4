package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Success.class)
public class Success992268536Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1917186501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917186501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__143191439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143191439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1030531278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030531278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withoutItem()Lnet/minecraft/world/InteractionResult$Success;", cancellable = true)
    private void withoutItem_706227423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706227423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swingSource()Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private void swingSource_334232553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334232553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/InteractionResult$Success;", cancellable = true)
    private void heldItemTransformedTo__541391292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541391292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void heldItemTransformedTo_1515687196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515687196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "consumesAction()Z", cancellable = true)
    private void consumesAction_1030547119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030547119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasItemInteraction()Z", cancellable = true)
    private void wasItemInteraction_1030547119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030547119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemContext()Lnet/minecraft/world/InteractionResult$ItemContext;", cancellable = true)
    private void itemContext__311536986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311536986L))
            info.setReturnValue(null);
    }


}
