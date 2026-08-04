package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.particle.ParticleRenderType.class)
public class ParticleRenderType_817319770Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__318140702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318140702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2092135268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092135268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__318140206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318140206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_855582511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855582511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shorthand()Ljava/lang/String;", cancellable = true)
    private void shorthand__318140702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318140702L))
            info.setReturnValue(null);
    }


}
