package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.AABB.Builder.class)
public class Builder887024781Mixin {
        @Inject(at = @At("HEAD"), method = "isDefined()Z", cancellable = true)
    private void isDefined_452260901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452260901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void build__1250288489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250288489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lorg/joml/Vector3fc;)V", cancellable = true)
    private void include_1125368026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1125368026L))
            info.cancel();
    }


}
