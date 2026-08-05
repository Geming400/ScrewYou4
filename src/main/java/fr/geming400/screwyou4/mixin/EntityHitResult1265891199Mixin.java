package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.EntityHitResult.class)
public class EntityHitResult1265891199Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private void getType__344492071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-344492071L))
            info.setReturnValue(net.minecraft.world.phys.HitResult.Type.BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1691877876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691877876L))
            info.setReturnValue(null);
    }


}
