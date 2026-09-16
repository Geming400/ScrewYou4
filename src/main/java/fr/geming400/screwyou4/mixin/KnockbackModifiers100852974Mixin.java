package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.KnockbackModifiers.class)
public class KnockbackModifiers100852974Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__807773294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807773294L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_871276499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871276499L))
            info.setReturnValue("\u83A8>h:<?d_\uD08B|b\uFDF7Fc3d\"|Pzk\u6B08M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_658205065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658205065L))
            info.setReturnValue(-1592081997);
    }

    @Inject(at = @At("HEAD"), method = "horizontalPower()F", cancellable = true)
    private void horizontalPower__900494096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900494096L))
            info.setReturnValue(7.908453E8F);
    }

    @Inject(at = @At("HEAD"), method = "verticalPower()F", cancellable = true)
    private void verticalPower__939136574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-939136574L))
            info.setReturnValue(7.908453E8F);
    }


}
