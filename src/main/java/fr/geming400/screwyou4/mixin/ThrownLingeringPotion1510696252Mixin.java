package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.throwableitemprojectile.ThrownLingeringPotion.class)
public class ThrownLingeringPotion1510696252Mixin {
        @Inject(at = @At("HEAD"), method = "onHitAsPotion(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/phys/HitResult;)V", cancellable = true)
    private void onHitAsPotion__1359393001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1359393001L))
            info.cancel();
    }


}
