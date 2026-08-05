package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Containers.class)
public class Containers_794716224Mixin {
        @Inject(at = @At("HEAD"), method = "dropItemStack(Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void dropItemStack_1969811380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1969811380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void dropContents__587128600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-587128600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/Container;)V", cancellable = true)
    private static void dropContents_498556396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(498556396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/Container;)V", cancellable = true)
    private static void dropContents__171130873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-171130873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNeighboursAfterDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void updateNeighboursAfterDestroy_1061530910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061530910L))
            info.cancel();
    }


}
