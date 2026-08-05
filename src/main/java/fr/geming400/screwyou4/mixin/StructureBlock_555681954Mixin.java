package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StructureBlock.class)
public class StructureBlock_555681954Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2003431619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003431619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__2011853195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2011853195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1029795702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029795702L))
            info.setReturnValue(null);
    }


}
