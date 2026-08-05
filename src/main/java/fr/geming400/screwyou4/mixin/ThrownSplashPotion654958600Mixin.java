package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownSplashPotion.class)
public class ThrownSplashPotion654958600Mixin {
        @Inject(at = @At("HEAD"), method = "onHitAsPotion(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onHitAsPotion_2079836643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2079836643L))
            info.cancel();
    }


}
