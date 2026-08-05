package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.FurnaceResultSlot.class)
public class FurnaceResultSlot_1062543739Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove__1838505339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838505339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__2018114739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2018114739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1497888426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497888426L))
            info.setReturnValue(false);
    }


}
