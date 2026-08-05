package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.DebugStickItem.class)
public class DebugStickItem1664519324Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__244323931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244323931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDestroyBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void canDestroyBlock__1320764470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320764470L))
            info.setReturnValue(true);
    }


}
