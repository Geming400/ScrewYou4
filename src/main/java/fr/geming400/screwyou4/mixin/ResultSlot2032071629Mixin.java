package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ResultSlot.class)
public class ResultSlot2032071629Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove__868977448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868977448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake_2070350212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070350212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__528360535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528360535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__1048586848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1048586848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeClone(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeClone_1430330262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430330262L))
            info.setReturnValue(null);
    }


}
