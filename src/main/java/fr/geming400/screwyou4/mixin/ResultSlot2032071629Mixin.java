package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ResultSlot.class)
public class ResultSlot2032071629Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove_986702036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986702036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1164320953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164320953L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__50332454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-50332454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeClone(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeClone_1143252326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143252326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake__103890619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103890619L))
            info.setReturnValue(false);
    }


}
