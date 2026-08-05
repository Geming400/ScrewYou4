package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeProbe.class)
public class EnvironmentAttributeProbe_156553799Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1572883190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1572883190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/world/attribute/EnvironmentAttribute;F)Ljava/lang/Object;", cancellable = true)
    private void getValue__1854353614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854353614L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void tick__884386887(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-884386887L))
            info.cancel();
    }


}
