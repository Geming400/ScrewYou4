package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ShearsItem.class)
public class ShearsItem_2070046447Mixin {
        @Inject(at = @At("HEAD"), method = "createToolProperties()Lnet/minecraft/world/item/component/Tool;", cancellable = true)
    private static void createToolProperties__584849650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584849650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_1154929213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154929213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mineBlock(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void mineBlock_2116952020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116952020L))
            info.setReturnValue(false);
    }


}
