package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultBlockEntity.Client.class)
public class Client1257969083Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/vault/VaultClientData;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)V", cancellable = true)
    private static void tick_654213542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(654213542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldDisplayActiveEffects(Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;)Z", cancellable = true)
    private static void shouldDisplayActiveEffects__253354397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253354397L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "emitActivationParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/vault/VaultSharedData;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void emitActivationParticles__997773848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-997773848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emitDeactivationParticles(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/particles/ParticleOptions;)V", cancellable = true)
    private static void emitDeactivationParticles__27183872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-27183872L))
            info.cancel();
    }


}
