package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.SulfurCubeBlockDispenseItemBehavior.class)
public class SulfurCubeBlockDispenseItemBehavior1441990419Mixin {
        @Inject(at = @At("HEAD"), method = "dispenseBlock(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void dispenseBlock__54563526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54563526L))
            info.setReturnValue(true);
    }


}
