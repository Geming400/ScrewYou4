package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Fail.class)
public class Fail_2016505735Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__892949303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892949303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_881045759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881045759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2054768476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054768476L))
            info.setReturnValue(null);
    }


}
