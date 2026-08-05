package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.DispenserBlockEntity.class)
public class DispenserBlockEntity950157649Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1105607093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1105607093L))
            info.setReturnValue(-1483022460);
    }

    @Inject(at = @At("HEAD"), method = "insertItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void insertItem_2022153372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022153372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomSlot(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void getRandomSlot__173327122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173327122L))
            info.setReturnValue(1560005609);
    }


}
