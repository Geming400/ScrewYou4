package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BlockEntityType.class)
public class BlockEntityType2026573308Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void create_441095653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441095653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValid(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValid_1881284322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881284322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1028737937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028737937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_838227281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838227281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyOpCanSetNbt()Z", cancellable = true)
    private void onlyOpCanSetNbt_2064851891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064851891L))
            info.setReturnValue(null);
    }


}
