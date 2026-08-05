package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.JukeboxBlock.class)
public class JukeboxBlock_1930332181Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1298189862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298189862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__860640162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-860640162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSignalSource(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isSignalSource_1477325613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477325613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__376492475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376492475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2071907565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071907565L))
            info.setReturnValue(null);
    }


}
