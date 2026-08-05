package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.ProjectileDispenseBehavior.class)
public class ProjectileDispenseBehavior604498198Mixin {
        @Inject(at = @At("HEAD"), method = "execute(Lnet/minecraft/core/dispenser/BlockSource;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void execute_1848852429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848852429L))
            info.setReturnValue(null);
    }


}
