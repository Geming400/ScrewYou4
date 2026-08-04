package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.HoneycombItem.class)
public class HoneycombItem2105208481Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_196365226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(196365226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryApplyToSign(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void tryApplyToSign_1420915081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420915081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canApplyToSign(Lnet/minecraft/world/level/block/entity/SignText;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void canApplyToSign__571101193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571101193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWaxed(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Optional;", cancellable = true)
    private static void getWaxed_1681121720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681121720L))
            info.setReturnValue(null);
    }


}
