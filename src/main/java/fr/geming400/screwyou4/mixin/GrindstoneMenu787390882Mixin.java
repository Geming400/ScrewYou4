package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.GrindstoneMenu.class)
public class GrindstoneMenu787390882Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1452584560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1452584560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__954215301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-954215301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__535437922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535437922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1246520288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246520288L))
            info.setReturnValue(false);
    }


}
