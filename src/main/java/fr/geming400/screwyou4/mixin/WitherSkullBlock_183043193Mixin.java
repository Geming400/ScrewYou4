package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WitherSkullBlock.class)
public class WitherSkullBlock_183043193Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1249488446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249488446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpawnMob(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canSpawnMob_308342268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308342268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_1687038146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1687038146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/SkullBlockEntity;)V", cancellable = true)
    private static void checkSpawn__1658113337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1658113337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void checkSpawn__949275083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-949275083L))
            info.cancel();
    }


}
