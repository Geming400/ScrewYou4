package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.cauldron.CauldronInteractions.class)
public class CauldronInteractions252244243Mixin {
        @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_290519230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(290519230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emptyBucket(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void emptyBucket_687912395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687912395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDefaultInteractions(Lnet/minecraft/core/cauldron/CauldronInteraction$Dispatcher;)V", cancellable = true)
    private static void addDefaultInteractions_343255745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(343255745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillBucket(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Ljava/util/function/Predicate;Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void fillBucket__1409351467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409351467L))
            info.setReturnValue(null);
    }


}
