package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BundleContents.Mutable.class)
public class Mutable_132757580Mixin {
        @Inject(at = @At("HEAD"), method = "tryTransfer(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/entity/player/Player;)I", cancellable = true)
    private void tryTransfer__654499399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654499399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()Lorg/apache/commons/lang3/math/Fraction;", cancellable = true)
    private void weight_501194263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501194263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toImmutable()Lnet/minecraft/world/item/component/BundleContents;", cancellable = true)
    private void toImmutable__974751498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974751498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryInsert(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void tryInsert_1867276374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867276374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleSelectedItem(I)V", cancellable = true)
    private void toggleSelectedItem_1346674551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1346674551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeOne()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeOne_656176239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656176239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearItems()Lnet/minecraft/world/item/component/BundleContents$Mutable;", cancellable = true)
    private void clearItems_307500372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307500372L))
            info.setReturnValue(null);
    }


}
