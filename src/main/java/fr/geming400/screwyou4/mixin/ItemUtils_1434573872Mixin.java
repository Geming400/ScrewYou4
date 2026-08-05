package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemUtils.class)
public class ItemUtils_1434573872Mixin {
        @Inject(at = @At("HEAD"), method = "createFilledResult(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createFilledResult_640418470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640418470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFilledResult(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;Z)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void createFilledResult__284549370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284549370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startUsingInstantly(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void startUsingInstantly_1844950154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844950154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onContainerDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;Ljava/util/stream/Stream;)V", cancellable = true)
    private static void onContainerDestroyed__539926518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-539926518L))
            info.cancel();
    }


}
