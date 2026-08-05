package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Fail.class)
public class Fail_2016505735Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1107879466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107879466L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1508038037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508038037L))
            info.setReturnValue(" *\u3A69Y]P<D6#?M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1721109471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721109471L))
            info.setReturnValue(-1809266187);
    }


}
