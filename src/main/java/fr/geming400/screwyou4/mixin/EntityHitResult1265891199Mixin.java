package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.EntityHitResult.class)
public class EntityHitResult1265891199Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private void getType__1761169015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761169015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1200187643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200187643L))
            info.setReturnValue(null);
    }


}
