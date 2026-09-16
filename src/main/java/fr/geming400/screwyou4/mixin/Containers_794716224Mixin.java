package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Containers.class)
public class Containers_794716224Mixin {
        @Inject(at = @At("HEAD"), method = "updateNeighboursAfterDestroy(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void updateNeighboursAfterDestroy_1505846145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1505846145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/NonNullList;)V", cancellable = true)
    private static void dropContents__1254948577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254948577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/Container;)V", cancellable = true)
    private static void dropContents_1446845141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1446845141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropContents(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/Container;)V", cancellable = true)
    private static void dropContents_799107632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799107632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropItemStack(Lnet/minecraft/world/level/Level;DDDLnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void dropItemStack_725278830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(725278830L))
            info.cancel();
    }


}
