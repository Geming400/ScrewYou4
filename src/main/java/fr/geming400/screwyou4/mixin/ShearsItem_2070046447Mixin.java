package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ShearsItem.class)
public class ShearsItem_2070046447Mixin {
        @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties__1096277835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096277835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void mineBlock__809944486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809944486L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_161203191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161203191L))
            info.setReturnValue(null);
    }


}
