package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BlockEntityType.class)
public class BlockEntityType2026573308Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void create_2008867177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008867177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValid(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValid__1313621584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313621584L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "builtInRegistryHolder()Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void builtInRegistryHolder_2010600293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010600293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1794478327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794478327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onlyOpCanSetNbt()Z", cancellable = true)
    private void onlyOpCanSetNbt__1859842286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859842286L))
            info.setReturnValue(false);
    }


}
