package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultBlockEntity.Client.class)
public class Client1257969083Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/vault/VaultClientData;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)V", cancellable = true)
    private static void tick__509711959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-509711959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitDeactivationParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void emitDeactivationParticles__1418970787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418970787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitActivationParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void emitActivationParticles__1366153468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1366153468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldDisplayActiveEffects(Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)Z", cancellable = true)
    private static void shouldDisplayActiveEffects__1286257802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286257802L))
            info.setReturnValue(false);
    }


}
