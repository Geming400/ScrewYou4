package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockStateModelSet.class)
public class BlockStateModelSet756225701Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void get_999090646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999090646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingModel()Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void missingModel__2030860635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030860635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParticleMaterial(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/resources/model/sprite/Material$Baked;", cancellable = true)
    private void getParticleMaterial__2026146356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026146356L))
            info.setReturnValue(null);
    }


}
