package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BundleContents.Mutable.class)
public class Mutable_132757580Mixin {
        @Inject(at = @At("HEAD"), method = "tryTransfer(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/entity/player/Player;)I", cancellable = true)
    private void tryTransfer_1591078195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591078195L))
            info.setReturnValue(-211560700);
    }

    @Inject(at = @At("HEAD"), method = "weight()Lorg/apache/commons/lang3/math/Fraction;", cancellable = true)
    private void weight__1498346353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498346353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearItems()Lnet/minecraft/world/item/component/BundleContents$Mutable;", cancellable = true)
    private void clearItems__1695839871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695839871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toImmutable()Lnet/minecraft/world/item/component/BundleContents;", cancellable = true)
    private void toImmutable_64131023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64131023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleSelectedItem(I)V", cancellable = true)
    private void toggleSelectedItem__568355911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-568355911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeOne()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeOne__999568975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999568975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryInsert(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void tryInsert_199808642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199808642L))
            info.setReturnValue(1365628143);
    }


}
