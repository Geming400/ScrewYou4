package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.AABB.Builder.class)
public class Builder887024781Mixin {
        @Inject(at = @At("HEAD"), method = "isDefined()Z", cancellable = true)
    private void isDefined_925303364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925303364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void build__533632571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533632571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lorg/joml/Vector3fc;)V", cancellable = true)
    private void include__1931999102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1931999102L))
            info.cancel();
    }


}
