package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.JukeboxBlock.class)
public class JukeboxBlock_1930332181Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__628781392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628781392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSignalSource(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isSignalSource_1785043194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785043194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_344854525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(344854525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__23135163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23135163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__637202968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-637202968L))
            info.cancel();
    }


}
