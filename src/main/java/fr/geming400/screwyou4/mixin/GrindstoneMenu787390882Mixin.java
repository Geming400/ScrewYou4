package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.GrindstoneMenu.class)
public class GrindstoneMenu787390882Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_1727992528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1727992528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1661086632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661086632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__1973823172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1973823172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1727996372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727996372L))
            info.setReturnValue(null);
    }


}
