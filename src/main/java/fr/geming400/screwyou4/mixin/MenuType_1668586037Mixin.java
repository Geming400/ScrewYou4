package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.MenuType.class)
public class MenuType_1668586037Mixin {
        @Inject(at = @At("HEAD"), method = "create(ILnet/minecraft/world/entity/player/Inventory;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void create_761058451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761058451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__1961560762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1961560762L))
            info.setReturnValue(null);
    }


}
