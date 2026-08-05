package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CrafterBlock.class)
public class CrafterBlock_813519100Mixin {
        @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__771958556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771958556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1139948244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1139948244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__445080668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445080668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1754016049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1754016049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPotentialResults(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/crafting/CraftingInput;)Ljava/util/Optional;", cancellable = true)
    private static void getPotentialResults_1332727169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332727169L))
            info.setReturnValue(null);
    }


}
