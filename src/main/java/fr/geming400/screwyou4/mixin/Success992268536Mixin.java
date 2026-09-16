package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Success.class)
public class Success992268536Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_83642268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83642268L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1762692061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762692061L))
            info.setReturnValue("\u3233]P`.\u048F\u06ABX-Rf3g Sj8{\u9DCBb\uAEB3;>i\u0ECEyx}vYoiN\u2C34@sJ\uA5D0L2t|2m \u3FEATG#sJx*](\u1D86Fm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1549620627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549620627L))
            info.setReturnValue(569788919);
    }

    @Inject(at = @At("HEAD"), method = "consumesAction()Z", cancellable = true)
    private void consumesAction__2035700286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035700286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withoutItem()Lnet/minecraft/world/InteractionResult$Success;", cancellable = true)
    private void withoutItem__1075421948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075421948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/InteractionResult$Success;", cancellable = true)
    private void heldItemTransformedTo_1739673254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739673254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void heldItemTransformedTo_2109785338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109785338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasItemInteraction()Z", cancellable = true)
    private void wasItemInteraction__1489322599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489322599L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "swingSource()Lnet/minecraft/world/InteractionResult$SwingSource;", cancellable = true)
    private void swingSource__2063826160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063826160L))
            info.setReturnValue(net.minecraft.world.InteractionResult.SwingSource.SERVER);
    }

    @Inject(at = @At("HEAD"), method = "itemContext()Lnet/minecraft/world/InteractionResult$ItemContext;", cancellable = true)
    private void itemContext__688440310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688440310L))
            info.setReturnValue(null);
    }


}
