package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WitherSkullBlock.class)
public class WitherSkullBlock_183043193Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1918896916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918896916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy_1910475340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1910475340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canSpawnMob(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canSpawnMob_1568614673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1568614673L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "checkSpawn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void checkSpawn_1010648680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1010648680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "checkSpawn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/entity/SkullBlockEntity;)V", cancellable = true)
    private static void checkSpawn__2058961420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2058961420L))
            info.cancel();
    }


}
