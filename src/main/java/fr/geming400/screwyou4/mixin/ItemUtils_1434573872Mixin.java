package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemUtils.class)
public class ItemUtils_1434573872Mixin {
        @Inject(at = @At("HEAD"), method = "onContainerDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;Ljava/util/stream/Stream;)V", cancellable = true)
    private static void onContainerDestroyed_466117153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(466117153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startUsingInstantly(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void startUsingInstantly__1331332866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331332866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFilledResult(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createFilledResult_1379670561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379670561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFilledResult(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Z)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createFilledResult_1157428971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157428971L))
            info.setReturnValue(null);
    }


}
